
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderLineData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLineData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}OrderLineHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderHandle" type="{http://e-conomic.com}OrderHandle" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UnitHandle" type="{http://e-conomic.com}UnitHandle" minOccurs="0"/>
 *         &lt;element name="ProductHandle" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UnitNetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DiscountAsPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UnitCostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalNetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalMargin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MarginAsPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DepartmentHandle" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
 *         &lt;element name="DistributionKeyHandle" type="{http://e-conomic.com}DistributionKeyHandle" minOccurs="0"/>
 *         &lt;element name="InventoryLocationHandle" type="{http://e-conomic.com}InventoryLocationHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLineData", propOrder = {
    "handle",
    "id",
    "number",
    "orderHandle",
    "description",
    "deliveryDate",
    "unitHandle",
    "productHandle",
    "quantity",
    "unitNetPrice",
    "discountAsPercent",
    "unitCostPrice",
    "totalNetAmount",
    "totalMargin",
    "marginAsPercent",
    "departmentHandle",
    "distributionKeyHandle",
    "inventoryLocationHandle"
})
public class OrderLineData {

    @XmlElement(name = "Handle")
    protected OrderLineHandle handle;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "OrderHandle")
    protected OrderHandle orderHandle;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DeliveryDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "UnitHandle")
    protected UnitHandle unitHandle;
    @XmlElement(name = "ProductHandle")
    protected ProductHandle productHandle;
    @XmlElement(name = "Quantity", required = true, nillable = true)
    protected BigDecimal quantity;
    @XmlElement(name = "UnitNetPrice", required = true, nillable = true)
    protected BigDecimal unitNetPrice;
    @XmlElement(name = "DiscountAsPercent", required = true)
    protected BigDecimal discountAsPercent;
    @XmlElement(name = "UnitCostPrice", required = true)
    protected BigDecimal unitCostPrice;
    @XmlElement(name = "TotalNetAmount", required = true, nillable = true)
    protected BigDecimal totalNetAmount;
    @XmlElement(name = "TotalMargin", required = true)
    protected BigDecimal totalMargin;
    @XmlElement(name = "MarginAsPercent", required = true)
    protected BigDecimal marginAsPercent;
    @XmlElement(name = "DepartmentHandle")
    protected DepartmentHandle departmentHandle;
    @XmlElement(name = "DistributionKeyHandle")
    protected DistributionKeyHandle distributionKeyHandle;
    @XmlElement(name = "InventoryLocationHandle")
    protected InventoryLocationHandle inventoryLocationHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineHandle }
     *     
     */
    public OrderLineHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineHandle }
     *     
     */
    public void setHandle(OrderLineHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the orderHandle property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHandle }
     *     
     */
    public OrderHandle getOrderHandle() {
        return orderHandle;
    }

    /**
     * Sets the value of the orderHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHandle }
     *     
     */
    public void setOrderHandle(OrderHandle value) {
        this.orderHandle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the unitHandle property.
     * 
     * @return
     *     possible object is
     *     {@link UnitHandle }
     *     
     */
    public UnitHandle getUnitHandle() {
        return unitHandle;
    }

    /**
     * Sets the value of the unitHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitHandle }
     *     
     */
    public void setUnitHandle(UnitHandle value) {
        this.unitHandle = value;
    }

    /**
     * Gets the value of the productHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductHandle }
     *     
     */
    public ProductHandle getProductHandle() {
        return productHandle;
    }

    /**
     * Sets the value of the productHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHandle }
     *     
     */
    public void setProductHandle(ProductHandle value) {
        this.productHandle = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitNetPrice() {
        return unitNetPrice;
    }

    /**
     * Sets the value of the unitNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitNetPrice(BigDecimal value) {
        this.unitNetPrice = value;
    }

    /**
     * Gets the value of the discountAsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAsPercent() {
        return discountAsPercent;
    }

    /**
     * Sets the value of the discountAsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAsPercent(BigDecimal value) {
        this.discountAsPercent = value;
    }

    /**
     * Gets the value of the unitCostPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCostPrice() {
        return unitCostPrice;
    }

    /**
     * Sets the value of the unitCostPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCostPrice(BigDecimal value) {
        this.unitCostPrice = value;
    }

    /**
     * Gets the value of the totalNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNetAmount() {
        return totalNetAmount;
    }

    /**
     * Sets the value of the totalNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNetAmount(BigDecimal value) {
        this.totalNetAmount = value;
    }

    /**
     * Gets the value of the totalMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMargin() {
        return totalMargin;
    }

    /**
     * Sets the value of the totalMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMargin(BigDecimal value) {
        this.totalMargin = value;
    }

    /**
     * Gets the value of the marginAsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarginAsPercent() {
        return marginAsPercent;
    }

    /**
     * Sets the value of the marginAsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarginAsPercent(BigDecimal value) {
        this.marginAsPercent = value;
    }

    /**
     * Gets the value of the departmentHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentHandle }
     *     
     */
    public DepartmentHandle getDepartmentHandle() {
        return departmentHandle;
    }

    /**
     * Sets the value of the departmentHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentHandle }
     *     
     */
    public void setDepartmentHandle(DepartmentHandle value) {
        this.departmentHandle = value;
    }

    /**
     * Gets the value of the distributionKeyHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public DistributionKeyHandle getDistributionKeyHandle() {
        return distributionKeyHandle;
    }

    /**
     * Sets the value of the distributionKeyHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public void setDistributionKeyHandle(DistributionKeyHandle value) {
        this.distributionKeyHandle = value;
    }

    /**
     * Gets the value of the inventoryLocationHandle property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationHandle }
     *     
     */
    public InventoryLocationHandle getInventoryLocationHandle() {
        return inventoryLocationHandle;
    }

    /**
     * Sets the value of the inventoryLocationHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationHandle }
     *     
     */
    public void setInventoryLocationHandle(InventoryLocationHandle value) {
        this.inventoryLocationHandle = value;
    }

}
