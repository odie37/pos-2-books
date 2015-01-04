
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
 *         &lt;element name="CurrentSupplierInvoice_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentSupplierInvoiceData" minOccurs="0"/>
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
    "currentSupplierInvoiceGetDataArrayResult"
})
@XmlRootElement(name = "CurrentSupplierInvoice_GetDataArrayResponse")
public class CurrentSupplierInvoiceGetDataArrayResponse {

    @XmlElement(name = "CurrentSupplierInvoice_GetDataArrayResult")
    protected ArrayOfCurrentSupplierInvoiceData currentSupplierInvoiceGetDataArrayResult;

    /**
     * Gets the value of the currentSupplierInvoiceGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentSupplierInvoiceData }
     *     
     */
    public ArrayOfCurrentSupplierInvoiceData getCurrentSupplierInvoiceGetDataArrayResult() {
        return currentSupplierInvoiceGetDataArrayResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentSupplierInvoiceData }
     *     
     */
    public void setCurrentSupplierInvoiceGetDataArrayResult(ArrayOfCurrentSupplierInvoiceData value) {
        this.currentSupplierInvoiceGetDataArrayResult = value;
    }

}
