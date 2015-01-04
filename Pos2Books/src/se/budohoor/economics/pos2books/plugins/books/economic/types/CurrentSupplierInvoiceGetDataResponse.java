
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
 *         &lt;element name="CurrentSupplierInvoice_GetDataResult" type="{http://e-conomic.com}CurrentSupplierInvoiceData" minOccurs="0"/>
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
    "currentSupplierInvoiceGetDataResult"
})
@XmlRootElement(name = "CurrentSupplierInvoice_GetDataResponse")
public class CurrentSupplierInvoiceGetDataResponse {

    @XmlElement(name = "CurrentSupplierInvoice_GetDataResult")
    protected CurrentSupplierInvoiceData currentSupplierInvoiceGetDataResult;

    /**
     * Gets the value of the currentSupplierInvoiceGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceData }
     *     
     */
    public CurrentSupplierInvoiceData getCurrentSupplierInvoiceGetDataResult() {
        return currentSupplierInvoiceGetDataResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceData }
     *     
     */
    public void setCurrentSupplierInvoiceGetDataResult(CurrentSupplierInvoiceData value) {
        this.currentSupplierInvoiceGetDataResult = value;
    }

}
