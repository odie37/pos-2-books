package se.budohoor.economics.pos2books.tool;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;

import se.budohoor.economics.pos2books.model.BookEntry;
import se.budohoor.economics.pos2books.model.TxGeneric;
import se.budohoor.economics.pos2books.model.TxList;
import se.budohoor.economics.pos2books.plugins.books.economic.BooksImpl;
import se.budohoor.economics.pos2books.plugins.pos.ringitup.PosImpl;
import se.budohoor.economics.pos2books.plugins.pos.ringitup.PosImplDbx;


public class Pos2BooksTool {
    private static final Logger log = Logger.getLogger(Pos2BooksTool.class.getName());
    
    private Pos2BooksRunner runner;
    
    public Pos2BooksTool(Pos2BooksRunner runner) {
        super();
        this.runner = runner;
    }

    public static void main(String[] args) {
        try {
            //Pos2BooksTool pos2BooksTool = new Pos2BooksTool(new Pos2BooksTxRunner(new PosImpl(), new BooksImpl()));
            Pos2BooksTool pos2BooksTool = new Pos2BooksTool(new Pos2BooksDailyBatchRunner(new PosImplDbx(), new BooksImpl()));
            pos2BooksTool.run();
        } catch (Exception e) {
            log.log(Level.WARNING, "Eject, eject, eject!", e);
        }
    }

    public void run() {
        runner.run();
    }
        
}
