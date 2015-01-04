package se.budohoor.economics.pos2books.model;

import java.util.HashMap;

public interface TxCashSale extends TxSale {
    public void categorizeSale(HashMap<String,BatchCategory> categories);
    public String getReceiptId();
}
