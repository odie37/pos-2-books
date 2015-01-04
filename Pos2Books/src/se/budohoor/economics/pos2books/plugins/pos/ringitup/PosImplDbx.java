package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import com.dropbox.core.DbxClient;

import com.dropbox.core.DbxEntry;
import com.dropbox.core.DbxRequestConfig;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.InputStream;

import java.text.MessageFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.budohoor.economics.pos2books.model.Pos;
import se.budohoor.economics.pos2books.model.ProductDefinition;
import se.budohoor.economics.pos2books.model.TxList;
import se.budohoor.economics.pos2books.settings.RunInfo;
import se.budohoor.economics.pos2books.settings.Settings;


public class PosImplDbx implements Pos {
    private static final String DROPBOX_FOLDER = "/RingItUp/Backups";
    private static final String DROPBOX_BACKUP_FILENAME_FORMAT = "RingItUp-Backup-{0,date,yyyy-MM-dd'T'hh.mm.ss}.zip";
    private static final String TEMP_ZIPFILE_PREFIX1 = "ringitup_backup_";
    private static final String TEMP_ZIPFILE_PREFIX2 = "ringitup_business_";
    private static final String TEMP_ZIPFILE_SUFFIX = ".zip";
    private static final String TEMP_DBFILE_PREFIX = "ringitup_db_";
    private static final String TEMP_DBFILE_SUFFIX = ".sql";
    private static final String RINGITUP_BUSINESS_ZIPENTRY = "My Busines.zip";
    private static final String RINGITUP_DB_ZIPENTRY = "ringitup.sql";
    
    private static final String PERSISTENCE_JDBC_URL = "javax.persistence.jdbc.url";
    //private static final int BUF_SIZE = 16;
    
    private static final Logger log = Logger.getLogger(PosImplDbx.class.getName());
    
    @PersistenceContext
    EntityManager emPos;    
    
    public PosImplDbx() {
        super();
        Settings.getInstance().registerPos(this);
    }

    @Override
    public TxList getNewTransactions() {
        getLatestDB();
        RunInfo latestRun = Settings.getInstance().getLatestRun();
        if (latestRun == null) {
            log.info("No latest run found! Beginning from scratch...");
            latestRun = new RunInfo();
            latestRun.setLastTxId(0);
            latestRun.setLastExpId(0);
        } else {
            log.info("Latest run: (" + latestRun.getRunStart() + " -> " + latestRun.getRunEnd() + ") " + latestRun.getLastTxId() + " " + latestRun.getLastExpId());
        }
        RunInfo thisRun = new RunInfo();
        thisRun.setRunStart(new Date());
        TxList txList = new TxList();

        //read sales
        Query txQuery = emPos.createNamedQuery("Transaction.findAllSalesAfterId");
        txQuery.setParameter("txId", latestRun.getLastTxId());
        txQuery.setParameter("txType", TransactionType.SALE);
        List<Transaction> transactions = txQuery.getResultList();
        log.info("Tx Hits: " + transactions.size());
        if (transactions.isEmpty()) {
            log.info("No new transactions!");
        } else {
            thisRun.setFirstTxId(transactions.get(0).getTransactionId());
            thisRun.setLastTxId(transactions.get(transactions.size()-1).getTransactionId());
            for (Transaction tx : transactions) {
                txList.add(new TxSaleImpl(tx));
            }
        }

        //read expenses
        Query expQuery = emPos.createNamedQuery("ExpenseItem.findAllExpensesAfterId");
        expQuery.setParameter("expId", latestRun.getLastExpId());
        List<ExpenseItem> expenses = expQuery.getResultList();
        log.info("Exp Hits: " + expenses.size());
        if (transactions.isEmpty()) {
            log.info("No new expenses!");
        } else {
            thisRun.setFirstExpId(expenses.get(0).getExpenseItemId());
            thisRun.setLastExpId(expenses.get(expenses.size()-1).getExpenseItemId());
            for (ExpenseItem exp : expenses) {
                txList.add(new TxExpenseImpl(exp));
            }
        }
        thisRun.setRunEnd(new Date());
        if (!txList.findAll().isEmpty()) {
            Settings.getInstance().storeThisRun(thisRun);
            log.fine("Sorting...");
            txList.sort();
        }
        log.info("Total hits: " + txList.findAll().size() + "(" + (transactions.size() + expenses.size()) + ")");
        
        return txList;
    }
    
    private void getLatestDB() {
        try {
            Date latestDate = null;
            DbxEntry latestEntry = null;
            MessageFormat backupFileFormat = new MessageFormat(DROPBOX_BACKUP_FILENAME_FORMAT);
            String dropboxToken = Settings.getInstance().getDropBoxToken();
            DbxRequestConfig config = new DbxRequestConfig(
                "Pos2Books/2.0", Locale.getDefault().toString());
            DbxClient client = new DbxClient(config, dropboxToken);
            System.out.println("Linked account: " + client.getAccountInfo().displayName);
            DbxEntry.WithChildren listing = client.getMetadataWithChildren(DROPBOX_FOLDER);
            for (DbxEntry child : listing.children) {
                Object[] parsed = backupFileFormat.parse(child.name);
                Date backupDate = (Date) parsed[0];
                if (latestDate == null) {
                    latestDate = backupDate;
                    latestEntry = child;
                } else {
                    if(latestDate.before(backupDate)) {
                        latestDate = backupDate;
                        latestEntry = child;
                    }
                }
            }
            log.info("Identified latest backup to be: " + latestEntry.name);
            File tmpZip1 = File.createTempFile(TEMP_ZIPFILE_PREFIX1, TEMP_ZIPFILE_SUFFIX);
            FileOutputStream os1 = new FileOutputStream(tmpZip1);
            try {
                DbxEntry.File downloadedFile = client.getFile(latestEntry.path, null, os1);
                System.out.println("Metadata: " + downloadedFile.toString());
            } finally {
                os1.close();
            }
            ZipFile zip1 = new ZipFile(tmpZip1);
            System.out.println("Zip1 size: " + zip1.size());
            //ZipEntry businessEntry = zip1.getEntry(RINGITUP_BUSINESS_ZIPENTRY);
            ZipEntry businessEntry = zip1.entries().nextElement();
            System.out.println("Got first zip-entry: " + businessEntry);
            InputStream is1 = zip1.getInputStream(businessEntry);
            File tmpZip2 = File.createTempFile(TEMP_ZIPFILE_PREFIX2, TEMP_ZIPFILE_SUFFIX);
            FileOutputStream os2 = new FileOutputStream(tmpZip2);
            try {
                int b;
                while((b = is1.read()) != -1) {
                    os2.write(b);             
                }
            } finally {
                is1.close();
                os2.close();
            }
            ZipFile zip2 = new ZipFile(tmpZip2);
            ZipEntry dbEntry = zip2.getEntry(RINGITUP_DB_ZIPENTRY);
            InputStream is2 = zip2.getInputStream(dbEntry);
            System.out.println("Got db zip-entry!");
            File tmpDbFile = File.createTempFile(TEMP_DBFILE_PREFIX, TEMP_DBFILE_SUFFIX);
            FileOutputStream os3 = new FileOutputStream(tmpDbFile);
            try {
                int b;
                while((b = is2.read()) != -1) {
                    os3.write(b);             
                }
            } finally {
                is2.close();
                os3.close();
            }
            log.info("Extracted latest db file into: " + tmpDbFile.getAbsolutePath());
            HashMap<String,String> dbProps = new java.util.HashMap<String,String>();
            dbProps.put(PERSISTENCE_JDBC_URL, "jdbc:sqlite:" + tmpDbFile.getAbsolutePath());
            EntityManagerFactory emfPos = Persistence.createEntityManagerFactory("RingItUp", dbProps);
            emPos = emfPos.createEntityManager();            
        } catch (Exception e) {
            log.warning("Failed getting latest DB from DropBox! Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public ProductDefinition getProductDefinition(String productId) {
        Query itemQuery = emPos.createNamedQuery("CatalogItem.findBySKU");
        itemQuery.setParameter("sku", productId);
        List<CatalogItem> items = itemQuery.getResultList();
        if (items.isEmpty()) {
            return null;
        } else {
            return new ProductDefinition(items.get(0));
        }
    }
}
