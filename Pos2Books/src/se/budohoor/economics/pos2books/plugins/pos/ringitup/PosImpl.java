package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

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


public class PosImpl implements Pos {
    private static final Logger log = Logger.getLogger(PosImpl.class.getName());
    
    @PersistenceContext
    EntityManager emPos;    
    
    public PosImpl() {
        super();
        Settings.getInstance().registerPos(this);
        EntityManagerFactory emfPos = Persistence.createEntityManagerFactory("RingItUp", new java.util.HashMap<String,String>());
        emPos = emfPos.createEntityManager();
    }

    @Override
    public TxList getNewTransactions() {
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
        thisRun.setFirstTxId(transactions.get(0).getTransactionId());
        thisRun.setLastTxId(transactions.get(transactions.size()-1).getTransactionId());
        for (Transaction tx : transactions) {
            txList.add(new TxSaleImpl(tx));
        }

        //read expenses
        Query expQuery = emPos.createNamedQuery("ExpenseItem.findAllExpensesAfterId");
        expQuery.setParameter("expId", latestRun.getLastExpId());
        List<ExpenseItem> expenses = expQuery.getResultList();
        log.info("Exp Hits: " + expenses.size());
        thisRun.setFirstExpId(expenses.get(0).getExpenseItemId());
        thisRun.setLastExpId(expenses.get(expenses.size()-1).getExpenseItemId());
        for (ExpenseItem exp : expenses) {
            txList.add(new TxExpenseImpl(exp));
        }
        thisRun.setRunEnd(new Date());
        Settings.getInstance().storeThisRun(thisRun);
        log.fine("Sorting...");
        txList.sort();
        log.info("Total hits: " + txList.findAll().size() + "(" + (transactions.size() + expenses.size()) + ")");
        
        return txList;
    }
    
    @Override
    public ProductDefinition getProductDefinition(String productId) {
        Query itemQuery = emPos.createNamedQuery("Catalogitem.findBySKU");
        itemQuery.setParameter("sku", productId);
        List<CatalogItem> items = itemQuery.getResultList();
        if (items.isEmpty()) {
            return null;
        } else {
            return new ProductDefinition(items.get(0));
        }
    }

}
