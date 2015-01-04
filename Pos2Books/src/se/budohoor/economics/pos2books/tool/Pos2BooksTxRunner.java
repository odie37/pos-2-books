package se.budohoor.economics.pos2books.tool;

import java.util.logging.Logger;

import se.budohoor.economics.pos2books.model.BookEntry;
import se.budohoor.economics.pos2books.model.Books;
import se.budohoor.economics.pos2books.model.Pos;
import se.budohoor.economics.pos2books.model.TxGeneric;
import se.budohoor.economics.pos2books.model.TxList;

public class Pos2BooksTxRunner extends Pos2BooksRunner {
    private static final Logger log = Logger.getLogger(Pos2BooksTxRunner.class.getName());

    public Pos2BooksTxRunner(Pos pos, Books books) {
        super(pos, books);
    }

    @Override
    public void run() {
        TxList newTransactions = pos.getNewTransactions();
                
        //handle each tx in sequence
        for (TxGeneric tx : newTransactions.findAll()) {
            log.info("-------------------------- TX Handling Start ---------------------------");
            tx.log();
            BookEntry[] entries = tx.translate(true);
            logBookEntries(entries);
            books.sendEntries(entries);        
            log.info("-------------------------- TX Handling End ---------------------------");
        }
    }
}
