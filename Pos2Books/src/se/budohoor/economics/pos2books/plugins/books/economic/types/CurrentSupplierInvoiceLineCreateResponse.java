
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentSupplierInvoiceLine_CreateResult" type="{http://e-conomic.com}CurrentSupplierInvoiceLineHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currentSupplierInvoiceLineCreateResult"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_CreateResponse")
public class CurrentSupplierInvoiceLineCreateResponse {

    @XmlElement(name = "CurrentSupplierInvoiceLine_CreateResult")
    protected CurrentSupplierInvoiceLineHandle currentSupplierInvoiceLineCreateResult;

    /**
     * Gets the value of the currentSupplierInvoiceLineCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceLineHandle }
     *     
     */
    public CurrentSupplierInvoiceLineHandle getCurrentSupplierInvoiceLineCreateResult() {
        return currentSupplierInvoiceLineCreateResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceLineCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceLineHandle }
     *     
     */
    public void setCurrentSupplierInvoiceLineCreateResult(CurrentSupplierInvoiceLineHandle value) {
        this.currentSupplierInvoiceLineCreateResult = value;
    }

}
