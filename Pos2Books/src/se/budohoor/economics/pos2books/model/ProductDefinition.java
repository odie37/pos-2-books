package se.budohoor.economics.pos2books.model;

import se.budohoor.economics.pos2books.plugins.pos.ringitup.CatalogItem;

public class ProductDefinition {
    private String id;
    private String name;
    private String description;
    private double itemPrice;
    private double itemCost;
    private String category;
    
    public ProductDefinition() {
        super();
    }
    
    public ProductDefinition(CatalogItem item) {
        super();
        this.id = item.getItemSku();
        this.name = item.getItemName();
        this.description = item.getItemDescription();
        this.itemPrice = item.getTier1Price();
        this.itemCost = item.getUnitCost();
        this.category = item.getCategory().getCategoryName();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getItemCost() {
        return itemCost;
    }
}
