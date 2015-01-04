package se.budohoor.economics.pos2books.model;

import java.util.Date;

public interface TxGeneric {
    public String getTxId();
    public String getPosReference();
    public Date getTxDate();
    public Double getTxAmount();
    public String getTxDescription();
    public TxType getTxType();
    public BookEntry[] translate(boolean forceCompleteEntries);
    public BookEntry[] getBookEntries();
    public boolean hasIncompleteEntries();
    public void log();
}
