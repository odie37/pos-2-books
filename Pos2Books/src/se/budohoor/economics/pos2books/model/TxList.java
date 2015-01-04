package se.budohoor.economics.pos2books.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

public class TxList {
    //private TreeMap<Date,TxGeneric> transactions;
    private ArrayList<TxGeneric> transactions;
    public TxList() {
        super();
        //transactions = new TreeMap<Date,TxGeneric>();
        transactions = new ArrayList<TxGeneric>();
    }
    
    public void add(TxGeneric tx) {
        //transactions.put(tx.getTxDate(), tx);
        transactions.add(tx);
    }
    
    public List<TxGeneric> findAll() {
        //return new ArrayList<TxGeneric>(transactions.values());
        return transactions;
    }
    
    public void sort() {
        Collections.sort(transactions, new TxGenericComparator());
    }
}
