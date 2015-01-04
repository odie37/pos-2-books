package se.budohoor.economics.pos2books.settings;

import com.dropbox.core.DbxAppInfo;

import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxRequestConfig;

import com.dropbox.core.DbxWebAuthNoRedirect;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;

import java.io.InputStreamReader;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import java.security.spec.InvalidKeySpecException;

import java.util.Date;
import java.util.HashMap;

import java.util.List;
import java.util.Locale;
import java.util.Properties;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;

import javax.crypto.spec.PBEKeySpec;

import javax.crypto.spec.SecretKeySpec;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.budohoor.economics.pos2books.model.BookEntry;
import se.budohoor.economics.pos2books.model.Pos;
import se.budohoor.economics.pos2books.model.TxGeneric;
import se.budohoor.economics.pos2books.model.TxLogStatus;

public class Settings {
    private static final String DEFAULT_PETTY_CASH_ACCOUNT = "1910";
    private static final String DEFAULT_CASH_BOOK_NAME = "Handkassan";
    private static final String DEFAULT_CUSTOMER_PAYMENTS_CASH_BOOK_NAME = "Kundbetalningar";
    private static final String DEFAULT_ECONOMIC_AGREEMENT_NUMBER = "<set me>";
    private static final String DEFAULT_ECONOMIC_USERNAME = "<set me>";
    private static final String DEFAULT_ECONOMIC_PASSWORD = "<set me>";
    
    private static final String KEY_PETTY_CASH_ACCOUNT = "pos2books.accounts.pettyCashAccount";
    private static final String KEY_CASH_BOOK_NAME = "pos2books.economics.cashBookName";
    private static final String KEY_CUSTOMER_PAYMENTS_CASH_BOOK_NAME = "pos2books.economics.customerPaymentsCashBookName";
    private static final String KEY_ECONOMIC_AGREEMENT_NUMBER = "pos2books.economics.agreementNumber";
    private static final String KEY_ECONOMIC_USERNAME = "pos2books.economics.userName";
    private static final String KEY_ECONOMIC_PASSWORD = "pos2books.economics.password";
    private static final String KEY_DROPBOX_TOKEN = "pos2books.dropbox.token";
    
    private static final String DROPBOX_APP_KEY = "289tac688yc12d4";
    private static final String DROPBOX_APP_SECRET = "0idplbkfhok3ddg";
    
    private static final String ENCRYPTION_SALT = "Pos2Books is a salty sailor!";
    private static final String ENCRYPTION_PASSPHRASE = "Pos2Books rules!";

    private static final Logger log = Logger.getLogger(Settings.class.getName());
    private static Settings instance;
    private static Pos pos;
   
    //private Integer pettyCashAccount;
    //private String cashBookName;
    //private Integer economicAgreementNumber;
    //private String economicUserName;
    //private String economicPassword;
    
    //private String dropboxToken;
    private Properties props = new Properties();

    @PersistenceContext
    EntityManager em;

    private Settings() {
        super();
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Settings", new java.util.HashMap<String,String>());
        em = emf.createEntityManager();
    }
    
    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
            instance.init();
        }
        return instance;
    }
    
    private void init() {
        try {
            File propFile = new File("settings.properties");
            if (propFile.exists()) {
                props.load(new FileReader(propFile));
            } else {
                props.setProperty(KEY_PETTY_CASH_ACCOUNT, DEFAULT_PETTY_CASH_ACCOUNT);
                props.setProperty(KEY_CASH_BOOK_NAME, DEFAULT_CASH_BOOK_NAME);
                props.setProperty(KEY_ECONOMIC_AGREEMENT_NUMBER, DEFAULT_ECONOMIC_AGREEMENT_NUMBER);
                props.setProperty(KEY_ECONOMIC_USERNAME, DEFAULT_ECONOMIC_USERNAME);
                props.setProperty(KEY_ECONOMIC_PASSWORD, DEFAULT_ECONOMIC_PASSWORD);
                props.store(new FileWriter(propFile),"Default settings generated " + new Date());
            }
        } catch (IOException ioe) {
            log.log(Level.SEVERE, "Settings failed to initiate!", ioe);
        }
    }

    public Integer getPettyCashAccount() {
        return new Integer(props.getProperty(KEY_PETTY_CASH_ACCOUNT, DEFAULT_PETTY_CASH_ACCOUNT));
    }
    
    public EntityManager getEM() {
        return em;
    }
    
    public RunInfo getLatestRun() {
        try {
            Query q = em.createNamedQuery("RunInfo.findLatest");
            return (RunInfo) q.getSingleResult();
        } catch (NoResultException nre) {
            log.log(Level.WARNING, "No latest run found!", nre);
            return null;
        }
    }
    
    public void storeThisRun(RunInfo thisRun) {
        em.getTransaction().begin();
        em.persist(thisRun);
        em.getTransaction().commit();
    }

    public String getCashBookName() {
        return props.getProperty(KEY_CASH_BOOK_NAME, DEFAULT_CASH_BOOK_NAME);
    }

    public String getCustomerPaymentsCashBookName() {
        return props.getProperty(KEY_CUSTOMER_PAYMENTS_CASH_BOOK_NAME, DEFAULT_CUSTOMER_PAYMENTS_CASH_BOOK_NAME);
    }

    public Integer getEconomicAgreementNumber() {
        return new Integer(props.getProperty(KEY_ECONOMIC_AGREEMENT_NUMBER, DEFAULT_ECONOMIC_AGREEMENT_NUMBER));
    }

    public String getEconomicUserName() {
        return props.getProperty(KEY_ECONOMIC_USERNAME, DEFAULT_ECONOMIC_USERNAME);
    }

    public String getEconomicPassword() {
        return props.getProperty(KEY_ECONOMIC_PASSWORD, DEFAULT_ECONOMIC_PASSWORD);
    }
    
    public String getDropBoxToken() {
        String encDropboxToken = props.getProperty(KEY_DROPBOX_TOKEN);
        if (encDropboxToken != null) {
            try {
                //return decrypt(encDropboxToken);
                return encDropboxToken;
            } catch (Exception e) {
                log.warning("Failed to decrypt token! Message: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            try {
                DbxAppInfo appInfo = new DbxAppInfo(DROPBOX_APP_KEY, DROPBOX_APP_SECRET);
    
                DbxRequestConfig config = new DbxRequestConfig(
                    "Pos2Books/2.0", Locale.getDefault().toString());
                DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
                String authorizeUrl = webAuth.start();
                System.out.println("1. Go to: " + authorizeUrl);
                System.out.println("2. Click \"Allow\" (you might have to log in first)");
                System.out.println("3. Copy the authorization code.");
                String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
                DbxAuthFinish authFinish = webAuth.finish(code);
                String dropboxToken = authFinish.accessToken;
                storeDropboxToken(dropboxToken);
                return dropboxToken;
            } catch (Exception e) {
                log.severe("Failed to authenticate with DropBox! Message:" + e.getMessage());
                e.printStackTrace();
            }
        }
        return null;
    }
    
    private String decrypt(String encryptedText) throws NoSuchAlgorithmException, NoSuchPaddingException,
                                                        InvalidKeyException, InvalidKeySpecException,
                                                        IllegalBlockSizeException, BadPaddingException {
        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        aes.init(Cipher.DECRYPT_MODE, getEncryptionKey());
        return new String(aes.doFinal(encryptedText.getBytes()));
    }
    
    private String encrypt(String clearText) throws NoSuchAlgorithmException, NoSuchPaddingException,
                                                    InvalidKeyException, InvalidKeySpecException,
                                                    IllegalBlockSizeException, BadPaddingException {
        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        aes.init(Cipher.ENCRYPT_MODE, getEncryptionKey());
        return new String(aes.doFinal(clearText.getBytes()));
    }
    
    private SecretKeySpec getEncryptionKey() throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] salt = ENCRYPTION_SALT.getBytes();
        int iterations = 10000;
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        SecretKey tmp = factory.generateSecret(new PBEKeySpec(ENCRYPTION_PASSPHRASE.toCharArray(), salt, iterations, 128));
        SecretKeySpec key = new SecretKeySpec(tmp.getEncoded(), "AES");
        return key;
    }

    private void storeDropboxToken(String dropboxToken) {
        try {
            //props.put(KEY_DROPBOX_TOKEN, encrypt(dropboxToken));
            props.put(KEY_DROPBOX_TOKEN, dropboxToken);
        } catch (Exception e) {
            log.warning("Failed to encrypt token! Message: " + e.getMessage());
            e.printStackTrace();
        }
        File propFile = new File("settings.properties");
        try {
            props.store(new FileWriter(propFile),"Added dropbox token " + new Date());
        } catch (IOException e) {
            log.warning("Failed to store properties! Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void auditLog(TxGeneric tx, TxLogStatus status) {
        em.getTransaction().begin();
        TxAuditLog alog = em.find(TxAuditLog.class, new TxAuditLogPK(tx.getTxType(), Integer.parseInt(tx.getTxId())));
        if (alog == null) {
            alog = new TxAuditLog(tx);
            em.persist(alog);
        }
        alog.setTxLogStatus(status);
        em.getTransaction().commit();
    }

    public void auditLog(List<TxGeneric> txList, TxLogStatus status, String booksRef) {
        em.getTransaction().begin();
        for (TxGeneric tx : txList) {
            TxAuditLog alog = em.find(TxAuditLog.class, new TxAuditLogPK(tx.getTxType(), Integer.parseInt(tx.getTxId())));
            if (alog == null) {
                alog = new TxAuditLog(tx);
                em.persist(alog);
                log.info("Created new auditlog for tx = " + tx.getTxId() + ", setting status = " + status + " & booksRef = " + booksRef);
            } else {
                log.info("Found auditlog for tx = " + tx.getTxId() + ", setting status = " + status + " & booksRef = " + booksRef);
            }
            alog.setTxLogStatus(status);
            alog.setTxBooksRef(booksRef);
            alog.setTimestamp(new Date());
            em.merge(alog);
        }
        em.getTransaction().commit();
    }

    public void auditLog(BookEntry entry, TxLogStatus status, String booksRef) {
        auditLog(entry.getTxList(), status, booksRef);
    }

    public void auditLogEntries(List<BookEntry> entryList, TxLogStatus status, String booksRef) {
        for (BookEntry entry : entryList) {
            auditLog(entry.getTxList(), status, booksRef);
        }
    }

    public void auditLogEntries(List<BookEntry> entryList, TxLogStatus status) {
        for (BookEntry entry : entryList) {
            auditLog(entry.getTxList(), status, entry.getBookRef());
        }
    }

    public static void registerPos(Pos pos) {
        Settings.pos = pos;
    }

    public static Pos getPos() {
        return pos;
    }
}
