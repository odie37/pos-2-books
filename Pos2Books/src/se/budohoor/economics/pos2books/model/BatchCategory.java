package se.budohoor.economics.pos2books.model;

public class BatchCategory {
    private String name;
    private double totalAmount = 0;
    private double items = 0;
    private int sales = 0;
    
    public BatchCategory(String name) {
        super();
        this.name = name;
    }
    
    public void addSale(double items, double amount) {
        sales++;
        this.items += items;
        totalAmount += amount;
    }


    public String getName() {
        return name;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getItems() {
        return items;
    }

    public int getSales() {
        return sales;
    }
}
