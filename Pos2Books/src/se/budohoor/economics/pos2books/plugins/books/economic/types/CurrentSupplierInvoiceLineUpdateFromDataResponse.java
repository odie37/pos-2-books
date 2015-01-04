
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
 *         &lt;element name="CurrentSupplierInvoiceLine_UpdateFromDataResult" type="{http://e-conomic.com}CurrentSupplierInvoiceLineHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceLineUpdateFromDataResult"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_UpdateFromDataResponse")
public class CurrentSupplierInvoiceLineUpdateFromDataResponse {

    @XmlElement(name = "CurrentSupplierInvoiceLine_UpdateFromDataResult")
    protected CurrentSupplierInvoiceLineHandle currentSupplierInvoiceLineUpdateFromDataResult;

    /**
     * Gets the value of the currentSupplierInvoiceLineUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceLineHandle }
     *     
     */
    public CurrentSupplierInvoiceLineHandle getCurrentSupplierInvoiceLineUpdateFromDataResult() {
        return currentSupplierInvoiceLineUpdateFromDataResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceLineUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceLineHandle }
     *     
     */
    public void setCurrentSupplierInvoiceLineUpdateFromDataResult(CurrentSupplierInvoiceLineHandle value) {
        this.currentSupplierInvoiceLineUpdateFromDataResult = value;
    }

}
