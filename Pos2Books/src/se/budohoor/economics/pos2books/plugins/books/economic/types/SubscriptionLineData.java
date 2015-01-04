
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionLineData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionLineData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}SubscriptionLineHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubscriptionHandle" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
 *         &lt;element name="ProductHandle" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DepartmentHandle" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionLineData", propOrder = {
    "handle",
    "id",
    "number",
    "subscriptionHandle",
    "productHandle",
    "quantity",
    "departmentHandle",
    "productName",
    "specialPrice"
})
public class SubscriptionLineData {

    @XmlElement(name = "Handle")
    protected SubscriptionLineHandle handle;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "SubscriptionHandle")
    protected SubscriptionHandle subscriptionHandle;
    @XmlElement(name = "ProductHandle")
    protected ProductHandle productHandle;
    @XmlElement(name = "Quantity", required = true, nillable = true)
    protected BigDecimal quantity;
    @XmlElement(name = "DepartmentHandle")
    protected DepartmentHandle departmentHandle;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "SpecialPrice", required = true, nillable = true)
    protected BigDecimal specialPrice;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionLineHandle }
     *     
     */
    public SubscriptionLineHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionLineHandle }
     *     
     */
    public void setHandle(SubscriptionLineHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
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
     * Gets the value of the subscriptionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriptionHandle() {
        return subscriptionHandle;
    }

    /**
     * Sets the value of the subscriptionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriptionHandle(SubscriptionHandle value) {
        this.subscriptionHandle = value;
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
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the specialPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecialPrice() {
        return specialPrice;
    }

    /**
     * Sets the value of the specialPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecialPrice(BigDecimal value) {
        this.specialPrice = value;
    }

}
