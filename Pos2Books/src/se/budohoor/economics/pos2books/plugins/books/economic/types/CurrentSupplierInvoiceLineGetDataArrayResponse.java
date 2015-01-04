
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
 *         &lt;element name="CurrentSupplierInvoiceLine_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentSupplierInvoiceLineData" minOccurs="0"/>
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
    "currentSupplierInvoiceLineGetDataArrayResult"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_GetDataArrayResponse")
public class CurrentSupplierInvoiceLineGetDataArrayResponse {

    @XmlElement(name = "CurrentSupplierInvoiceLine_GetDataArrayResult")
    protected ArrayOfCurrentSupplierInvoiceLineData currentSupplierInvoiceLineGetDataArrayResult;

    /**
     * Gets the value of the currentSupplierInvoiceLineGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentSupplierInvoiceLineData }
     *     
     */
    public ArrayOfCurrentSupplierInvoiceLineData getCurrentSupplierInvoiceLineGetDataArrayResult() {
        return currentSupplierInvoiceLineGetDataArrayResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceLineGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentSupplierInvoiceLineData }
     *     
     */
    public void setCurrentSupplierInvoiceLineGetDataArrayResult(ArrayOfCurrentSupplierInvoiceLineData value) {
        this.currentSupplierInvoiceLineGetDataArrayResult = value;
    }

}
