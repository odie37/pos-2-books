package se.budohoor.economics.pos2books.model;

public interface Pos {
    public TxList getNewTransactions();
    
    public ProductDefinition getProductDefinition(String productId);
}
