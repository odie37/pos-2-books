package se.budohoor.economics.pos2books.model;

import java.math.BigDecimal;

import java.util.ArrayList;

import se.budohoor.economics.pos2books.plugins.books.economic.EconomicWebServiceSoap;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceLineData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceLineHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ProductData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ProductHandle;
import se.budohoor.economics.pos2books.tool.membershipinvoicer.MemberData;

public class InvoiceItem {
   
    private double itemPrice; 
    private double quantity;
    private String productNumber;
    private double discountPercent;
    private String description;

    public InvoiceItem() {
        super();
    }
    
    private InvoiceItem(String description, String productNumber, int quantity, int itemPrice, int discountPercent) {
        super();    
        this.description = description;
        this.productNumber = productNumber;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.discountPercent = discountPercent;
    }
    
    public double getAmount() {
        return quantity * itemPrice * (1 + discountPercent / 100);
    }
    
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
