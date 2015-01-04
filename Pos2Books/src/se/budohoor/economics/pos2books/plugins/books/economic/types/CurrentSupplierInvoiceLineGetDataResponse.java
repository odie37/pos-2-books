
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
 *         &lt;element name="CurrentSupplierInvoiceLine_GetDataResult" type="{http://e-conomic.com}CurrentSupplierInvoiceLineData" minOccurs="0"/>
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
    "currentSupplierInvoiceLineGetDataResult"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_GetDataResponse")
public class CurrentSupplierInvoiceLineGetDataResponse {

    @XmlElement(name = "CurrentSupplierInvoiceLine_GetDataResult")
    protected CurrentSupplierInvoiceLineData currentSupplierInvoiceLineGetDataResult;

    /**
     * Gets the value of the currentSupplierInvoiceLineGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceLineData }
     *     
     */
    public CurrentSupplierInvoiceLineData getCurrentSupplierInvoiceLineGetDataResult() {
        return currentSupplierInvoiceLineGetDataResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceLineGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceLineData }
     *     
     */
    public void setCurrentSupplierInvoiceLineGetDataResult(CurrentSupplierInvoiceLineData value) {
        this.currentSupplierInvoiceLineGetDataResult = value;
    }

}
