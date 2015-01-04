package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries( { 
    @NamedQuery(name = "CatalogItem.findAll", query = "select o from CatalogItem o"),
    @NamedQuery(name = "CatalogItem.findBySKU", query = "select o from CatalogItem o where o.itemSku = :sku")
})
@Table(name = "\"catalog_items\"")
public class CatalogItem implements Serializable {
    @Column(name = "apply_taxrate1")
    private int applyTaxRate1;
    @Column(name = "apply_taxrate2")
    private int applyTaxRate2;
    @Column(name = "bind_to_labor_rate")
    private int bindToLaborRate;
    @Id
    @Column(name = "pk")
    private int catalogItemId;
    @Column(name = "grouped")
    private int grouped;
    @Column(name = "image_exists")
    private int imageExists;
    @Column(name = "item_description")
    private String itemDescription;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_sku")
    private String itemSku;
    @Column(name = "item_type")
    private int itemType;
    @Column(name = "onhand_qty")
    private double onhandQty;
    @Column(name = "qty_in_stock")
    private double qtyInStock;
    @Column(name = "fk_supplier_id")
    private int supplierId;
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
    @Column(name = "unit_cost")
    private double unitCost;
    @Column(name = "unit_label")
    private String unitLabel;
    @Column(name = "upc")
    private String upc;
    @Column(name = "wholesale_price")
    private double wholesalePrice;
    @ManyToOne
    @JoinColumn(name = "fk_category_id", referencedColumnName = "pk")
    private Category category;

    public CatalogItem() {
    }

    public CatalogItem(int applyTaxRate1, int applyTaxRate2, int bindToLaborRate, int catalogItemId, 
                       int grouped, int imageExists, String itemDescription, String itemName, String itemSku,
                       int itemType, double onhandQty, double qtyInStock, int supplierId, double tier1Price,
                       double tier2Price, double tier2Threshold, double tier3Price, double tier3Threshold,
                       double unitCost, String unitLabel, String upc, double wholesalePrice) {
        this.applyTaxRate1 = applyTaxRate1;
        this.applyTaxRate2 = applyTaxRate2;
        this.bindToLaborRate = bindToLaborRate;
        this.catalogItemId = catalogItemId;
        this.grouped = grouped;
        this.imageExists = imageExists;
        this.itemDescription = itemDescription;
        this.itemName = itemName;
        this.itemSku = itemSku;
        this.itemType = itemType;
        this.onhandQty = onhandQty;
        this.qtyInStock = qtyInStock;
        this.supplierId = supplierId;
        this.tier1Price = tier1Price;
        this.tier2Price = tier2Price;
        this.tier2Threshold = tier2Threshold;
        this.tier3Price = tier3Price;
        this.tier3Threshold = tier3Threshold;
        this.unitCost = unitCost;
        this.unitLabel = unitLabel;
        this.upc = upc;
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

    public int getBindToLaborRate() {
        return bindToLaborRate;
    }

    public void setBindToLaborRate(int bindToLaborRate) {
        this.bindToLaborRate = bindToLaborRate;
    }

    public int getCatalogItemId() {
        return catalogItemId;
    }

    public void setCatalogItemId(int catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    public int getGrouped() {
        return grouped;
    }

    public void setGrouped(int grouped) {
        this.grouped = grouped;
    }

    public int getImageExists() {
        return imageExists;
    }

    public void setImageExists(int imageExists) {
        this.imageExists = imageExists;
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

    public double getOnhandQty() {
        return onhandQty;
    }

    public void setOnhandQty(double onhandQty) {
        this.onhandQty = onhandQty;
    }

    public double getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(double qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
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

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
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
        buffer.append("bindToLaborRate=");
        buffer.append(getBindToLaborRate());
        buffer.append(',');
        buffer.append("catalogItemId=");
        buffer.append(getCatalogItemId());
        buffer.append(',');
        buffer.append("grouped=");
        buffer.append(getGrouped());
        buffer.append(',');
        buffer.append("imageExists=");
        buffer.append(getImageExists());
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
        buffer.append("onhandQty=");
        buffer.append(getOnhandQty());
        buffer.append(',');
        buffer.append("qtyInStock=");
        buffer.append(getQtyInStock());
        buffer.append(',');
        buffer.append("supplierId=");
        buffer.append(getSupplierId());
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
        buffer.append("unitCost=");
        buffer.append(getUnitCost());
        buffer.append(',');
        buffer.append("unitLabel=");
        buffer.append(getUnitLabel());
        buffer.append(',');
        buffer.append("upc=");
        buffer.append(getUpc());
        buffer.append(',');
        buffer.append("wholesalePrice=");
        buffer.append(getWholesalePrice());
        buffer.append(']');
        return buffer.toString();
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
