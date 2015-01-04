package se.budohoor.economics.pos2books.tool;

import java.util.logging.Logger;

import se.budohoor.economics.pos2books.model.BookEntry;
import se.budohoor.economics.pos2books.model.Books;
import se.budohoor.economics.pos2books.model.Pos;

public abstract class Pos2BooksRunner implements Runnable {
    private static final Logger log = Logger.getLogger(Pos2BooksRunner.class.getName());

    Books books;
    Pos pos;

    public Pos2BooksRunner(Pos pos, Books books) {
        super();
        this.pos = pos;
        this.books = books;
    }
    
    void logBookEntries(BookEntry[] entries) {
        if (entries == null) {
            log.info("--- No Entries ---");
        } else {
            log.info("--- Entries Start ---");
            for (BookEntry entry : entries) {
                entry.log();
            }
            log.info("--- Entries End ---");
        }
    }
}
