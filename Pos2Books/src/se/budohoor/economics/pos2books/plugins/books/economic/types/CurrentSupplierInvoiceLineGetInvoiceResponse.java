
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
 *         &lt;element name="CurrentSupplierInvoiceLine_GetInvoiceResult" type="{http://e-conomic.com}CurrentSupplierInvoiceHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceLineGetInvoiceResult"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_GetInvoiceResponse")
public class CurrentSupplierInvoiceLineGetInvoiceResponse {

    @XmlElement(name = "CurrentSupplierInvoiceLine_GetInvoiceResult")
    protected CurrentSupplierInvoiceHandle currentSupplierInvoiceLineGetInvoiceResult;

    /**
     * Gets the value of the currentSupplierInvoiceLineGetInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public CurrentSupplierInvoiceHandle getCurrentSupplierInvoiceLineGetInvoiceResult() {
        return currentSupplierInvoiceLineGetInvoiceResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceLineGetInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public void setCurrentSupplierInvoiceLineGetInvoiceResult(CurrentSupplierInvoiceHandle value) {
        this.currentSupplierInvoiceLineGetInvoiceResult = value;
    }

}
