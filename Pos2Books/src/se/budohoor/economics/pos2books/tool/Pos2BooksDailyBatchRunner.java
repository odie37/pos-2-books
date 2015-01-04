package se.budohoor.economics.pos2books.tool;

import java.util.logging.Logger;

import se.budohoor.economics.pos2books.model.BookEntries;
import se.budohoor.economics.pos2books.model.BookEntry;
import se.budohoor.economics.pos2books.model.Books;
import se.budohoor.economics.pos2books.model.DailyBatch;
import se.budohoor.economics.pos2books.model.Pos;
import se.budohoor.economics.pos2books.model.TxGeneric;
import se.budohoor.economics.pos2books.model.TxList;
import se.budohoor.economics.pos2books.model.TxLogStatus;
import se.budohoor.economics.pos2books.model.TxType;
import se.budohoor.economics.pos2books.settings.Settings;

public class Pos2BooksDailyBatchRunner extends Pos2BooksRunner {
    private static final Logger log = Logger.getLogger(Pos2BooksDailyBatchRunner.class.getName());

    public Pos2BooksDailyBatchRunner(Pos pos, Books books) {
        super(pos, books);
    }

    @Override
    public void run() {
        TxList newTransactions = pos.getNewTransactions();
                
        //handle the tx's in daily batches
        DailyBatch batch = new DailyBatch();
        for (TxGeneric tx : newTransactions.findAll()) {
            log.info("-------------------------- TX Handling Start ---------------------------");
            Settings.getInstance().auditLog(tx, TxLogStatus.PARSED);
            if(batch.addTx(tx)) {
                tx.log();
                log.info("Tx added to batch '" + batch.getBatchDay() + "'");
            } else {
                switch (tx.getTxType()) {
                case CASH_SALE:
                    BookEntry[] batchEntries = batch.translate();
                    logBookEntries(batchEntries);
                    books.sendEntries(batchEntries);        
                    batch = new DailyBatch();
                    if(batch.addTx(tx)) {
                        tx.log();
                        break;
                    } else {    
                        throw new RuntimeException("Unruly cash sale! Can't fit into batch!");
                    }
                default:
                    tx.log();
                    BookEntry[] entries = tx.translate(true);
                    logBookEntries(entries);
                    books.sendEntries(entries); 
                }
            }
            log.info("-------------------------- TX Handling End ---------------------------");
        }
    }
}
