
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentSupplierInvoiceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentSupplierInvoiceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}CurrentSupplierInvoiceHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CreditorHandle" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentSupplierInvoiceData", propOrder = {
    "handle",
    "id",
    "creditorHandle"
})
public class CurrentSupplierInvoiceData {

    @XmlElement(name = "Handle")
    protected CurrentSupplierInvoiceHandle handle;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "CreditorHandle")
    protected CreditorHandle creditorHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public CurrentSupplierInvoiceHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public void setHandle(CurrentSupplierInvoiceHandle value) {
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
     * Gets the value of the creditorHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getCreditorHandle() {
        return creditorHandle;
    }

    /**
     * Sets the value of the creditorHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setCreditorHandle(CreditorHandle value) {
        this.creditorHandle = value;
    }

}
