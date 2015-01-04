package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "CartItem.findAll", query = "select o from CartItem o") })
@Table(name = "\"cart_items\"")
public class CartItem implements Serializable {
    @Column(name = "apply_taxrate1")
    private int applyTaxRate1;
    @Column(name = "apply_taxrate2")
    private int applyTaxRate2;
    @Id
    @Column(name = "pk", nullable = false)
    private int cartItemId;
    @Column(name = "date")
    private float date;
    @Column(name = "discount_is_percent")
    private int discountIsPercent;
    @Column(name = "discount_subtotal")
    private double discountSubtotal;
    @Column(name = "expense_subtotal")
    private double expenseSubtotal;
    @Column(name = "item_description")
    private String itemDescription;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_sku")
    private String itemSku;
    @Column(name = "item_type")
    private int itemType;
    @Column(name = "item_was_received")
    private int itemWasReceived;
    @Column(name = "quantity")
    private double quantity;
    @Column(name = "raw_discount")
    private double rawDiscount;
    @Column(name = "subtotal")
    private double subtotal;
    @Column(name = "tier1_price")
    private double tier1Price;
    @Column(name = "tier2_price")
    private double tier2Price;
    @Column(name = "tier2_threshold")
    private double tier2Threshold;
    @Column(name = "tier3_price")
    private double tier3Price;
    @Column(name = "tier3_threshold")
    private double tier3Threshold;
    @Column(name = "transaction_type")
    private int transactionType;
    @Column(name = "unit_cost")
    private double unitCost;
    @Column(name = "unit_label")
    private String unitLabel;
    @Column(name = "wholesale_price")
    private double wholesalePrice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_catalog_item_id", referencedColumnName = "pk")
    private CatalogItem catalogItem;
    @ManyToOne
    @JoinColumn(name = "fk_transaction_id", referencedColumnName = "pk")
    private Transaction transaction;
    @OneToMany
    @JoinColumn(name="fk_parent_record_id")
    private List<CartItemNote> notes;

    public CartItem() {
    }

    public CartItem(int applyTaxRate1, int applyTaxRate2, int cartItemId, float date,
                    int discountIsPercent, double discountSubtotal, double expenseSubtotal, String itemDescription,
                    String itemName, String itemSku, int itemType, int itemWasReceived, double quantity,
                    double rawDiscount, double subtotal, double tier1Price, double tier2Price, double tier2Threshold,
                    double tier3Price, double tier3Threshold, int transactionType, double unitCost,
                    String unitLabel, double wholesalePrice) {
        this.applyTaxRate1 = applyTaxRate1;
        this.applyTaxRate2 = applyTaxRate2;
        this.cartItemId = cartItemId;
        this.date = date;
        this.discountIsPercent = discountIsPercent;
        this.discountSubtotal = discountSubtotal;
        this.expenseSubtotal = expenseSubtotal;
        this.itemDescription = itemDescription;
        this.itemName = itemName;
        this.itemSku = itemSku;
        this.itemType = itemType;
        this.itemWasReceived = itemWasReceived;
        this.quantity = quantity;
        this.rawDiscount = rawDiscount;
        this.subtotal = subtotal;
        this.tier1Price = tier1Price;
        this.tier2Price = tier2Price;
        this.tier2Threshold = tier2Threshold;
        this.tier3Price = tier3Price;
        this.tier3Threshold = tier3Threshold;
        this.transactionType = transactionType;
        this.unitCost = unitCost;
        this.unitLabel = unitLabel;
        this.wholesalePrice = wholesalePrice;
    }


    public int getApplyTaxRate1() {
        return applyTaxRate1;
    }

    public void setApplyTaxRate1(int applyTaxRate1) {
        this.applyTaxRate1 = applyTaxRate1;
    }

    public int getApplyTaxRate2() {
        return applyTaxRate2;
    }

    public void setApplyTaxRate2(int applyTaxRate2) {
        this.applyTaxRate2 = applyTaxRate2;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public int getDiscountIsPercent() {
        return discountIsPercent;
    }

    public void setDiscountIsPercent(int discountIsPercent) {
        this.discountIsPercent = discountIsPercent;
    }

    public double getDiscountSubtotal() {
        return discountSubtotal;
    }

    public void setDiscountSubtotal(double discountSubtotal) {
        this.discountSubtotal = discountSubtotal;
    }

    public double getExpenseSubtotal() {
        return expenseSubtotal;
    }

    public void setExpenseSubtotal(double expenseSubtotal) {
        this.expenseSubtotal = expenseSubtotal;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemSku() {
        return itemSku;
    }

    public void setItemSku(String itemSku) {
        this.itemSku = itemSku;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getItemWasReceived() {
        return itemWasReceived;
    }

    public void setItemWasReceived(int itemWasReceived) {
        this.itemWasReceived = itemWasReceived;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getRawDiscount() {
        return rawDiscount;
    }

    public void setRawDiscount(double rawDiscount) {
        this.rawDiscount = rawDiscount;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTier1Price() {
        return tier1Price;
    }

    public void setTier1Price(double tier1Price) {
        this.tier1Price = tier1Price;
    }

    public double getTier2Price() {
        return tier2Price;
    }

    public void setTier2Price(double tier2Price) {
        this.tier2Price = tier2Price;
    }

    public double getTier2Threshold() {
        return tier2Threshold;
    }

    public void setTier2Threshold(double tier2Threshold) {
        this.tier2Threshold = tier2Threshold;
    }

    public double getTier3Price() {
        return tier3Price;
    }

    public void setTier3Price(double tier3Price) {
        this.tier3Price = tier3Price;
    }

    public double getTier3Threshold() {
        return tier3Threshold;
    }

    public void setTier3Threshold(double tier3Threshold) {
        this.tier3Threshold = tier3Threshold;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public String getUnitLabel() {
        return unitLabel;
    }

    public void setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("applyTaxRate1=");
        buffer.append(getApplyTaxRate1());
        buffer.append(',');
        buffer.append("applyTaxRate2=");
        buffer.append(getApplyTaxRate2());
        buffer.append(',');
        buffer.append("cartItemId=");
        buffer.append(getCartItemId());
        buffer.append(',');
        buffer.append("date=");
        buffer.append(getDate());
        buffer.append(',');
        buffer.append("discountIsPercent=");
        buffer.append(getDiscountIsPercent());
        buffer.append(',');
        buffer.append("discountSubtotal=");
        buffer.append(getDiscountSubtotal());
        buffer.append(',');
        buffer.append("expenseSubtotal=");
        buffer.append(getExpenseSubtotal());
        buffer.append(',');
        buffer.append("itemDescription=");
        buffer.append(getItemDescription());
        buffer.append(',');
        buffer.append("itemName=");
        buffer.append(getItemName());
        buffer.append(',');
        buffer.append("itemSku=");
        buffer.append(getItemSku());
        buffer.append(',');
        buffer.append("itemType=");
        buffer.append(getItemType());
        buffer.append(',');
        buffer.append("itemWasReceived=");
        buffer.append(getItemWasReceived());
        buffer.append(',');
        buffer.append("quantity=");
        buffer.append(getQuantity());
        buffer.append(',');
        buffer.append("rawDiscount=");
        buffer.append(getRawDiscount());
        buffer.append(',');
        buffer.append("subtotal=");
        buffer.append(getSubtotal());
        buffer.append(',');
        buffer.append("tier1Price=");
        buffer.append(getTier1Price());
        buffer.append(',');
        buffer.append("tier2Price=");
        buffer.append(getTier2Price());
        buffer.append(',');
        buffer.append("tier2Threshold=");
        buffer.append(getTier2Threshold());
        buffer.append(',');
        buffer.append("tier3Price=");
        buffer.append(getTier3Price());
        buffer.append(',');
        buffer.append("tier3Threshold=");
        buffer.append(getTier3Threshold());
        buffer.append(',');
        buffer.append("transactionType=");
        buffer.append(getTransactionType());
        buffer.append(',');
        buffer.append("unitCost=");
        buffer.append(getUnitCost());
        buffer.append(',');
        buffer.append("unitLabel=");
        buffer.append(getUnitLabel());
        buffer.append(',');
        buffer.append("wholesalePrice=");
        buffer.append(getWholesalePrice());
        buffer.append(']');
        return buffer.toString();
    }


    public CatalogItem getCatalogItem() {
        return catalogItem;
    }

    public void setCatalogItem(CatalogItem catalogItem) {
        this.catalogItem = catalogItem;
    }


    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public List<CartItemNote> getNotes() {
        return notes;
    }

}
