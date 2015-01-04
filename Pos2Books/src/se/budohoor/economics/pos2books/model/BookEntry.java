package se.budohoor.economics.pos2books.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import oracle.binding.AttributeContext;
import oracle.binding.DataControl;
import oracle.binding.OperationBinding;
import oracle.binding.RowContext;
import oracle.binding.UpdateableDataControl;

public abstract class BookEntry {
    private String bookRef;
    private ArrayList<TxGeneric> txList = new ArrayList<TxGeneric>();
    
    public void addTx(TxGeneric tx) {
        txList.add(tx);
    }
    
    public void addTxList(List<TxGeneric> txList) {
        this.txList.addAll(txList);
    }
    
    public List<TxGeneric> getTxList() {
        return txList;
    }
    
    public abstract void log();

    public abstract boolean isComplete();

    public void setBookRef(String bookRef) {
        this.bookRef = bookRef;
    }

    public String getBookRef() {
        return bookRef;
    }
}
