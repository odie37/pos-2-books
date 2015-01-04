
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
 *         &lt;element name="CurrentSupplierInvoice_CreateFromDataResult" type="{http://e-conomic.com}CurrentSupplierInvoiceHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceCreateFromDataResult"
})
@XmlRootElement(name = "CurrentSupplierInvoice_CreateFromDataResponse")
public class CurrentSupplierInvoiceCreateFromDataResponse {

    @XmlElement(name = "CurrentSupplierInvoice_CreateFromDataResult")
    protected CurrentSupplierInvoiceHandle currentSupplierInvoiceCreateFromDataResult;

    /**
     * Gets the value of the currentSupplierInvoiceCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public CurrentSupplierInvoiceHandle getCurrentSupplierInvoiceCreateFromDataResult() {
        return currentSupplierInvoiceCreateFromDataResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public void setCurrentSupplierInvoiceCreateFromDataResult(CurrentSupplierInvoiceHandle value) {
        this.currentSupplierInvoiceCreateFromDataResult = value;
    }

}
