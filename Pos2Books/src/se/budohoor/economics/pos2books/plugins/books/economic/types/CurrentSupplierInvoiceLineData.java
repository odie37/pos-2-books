
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentSupplierInvoiceLineData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentSupplierInvoiceLineData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}CurrentSupplierInvoiceLineHandle" minOccurs="0"/>
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InvoiceHandle" type="{http://e-conomic.com}CurrentSupplierInvoiceHandle" minOccurs="0"/>
 *         &lt;element name="ProductHandle" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentSupplierInvoiceLineData", propOrder = {
    "handle",
    "invoiceId",
    "number",
    "invoiceHandle",
    "productHandle",
    "quantity",
    "unitPrice"
})
public class CurrentSupplierInvoiceLineData {

    @XmlElement(name = "Handle")
    protected CurrentSupplierInvoiceLineHandle handle;
    @XmlElement(name = "InvoiceId")
    protected int invoiceId;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "InvoiceHandle")
    protected CurrentSupplierInvoiceHandle invoiceHandle;
    @XmlElement(name = "ProductHandle")
    protected ProductHandle productHandle;
    @XmlElement(name = "Quantity", required = true, nillable = true)
    protected BigDecimal quantity;
    @XmlElement(name = "UnitPrice", required = true, nillable = true)
    protected BigDecimal unitPrice;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceLineHandle }
     *     
     */
    public CurrentSupplierInvoiceLineHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceLineHandle }
     *     
     */
    public void setHandle(CurrentSupplierInvoiceLineHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     */
    public int getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     */
    public void setInvoiceId(int value) {
        this.invoiceId = value;
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
     * Gets the value of the invoiceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public CurrentSupplierInvoiceHandle getInvoiceHandle() {
        return invoiceHandle;
    }

    /**
     * Sets the value of the invoiceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public void setInvoiceHandle(CurrentSupplierInvoiceHandle value) {
        this.invoiceHandle = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

}
