
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
 *         &lt;element name="CurrentSupplierInvoice_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentSupplierInvoiceHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceUpdateFromDataArrayResult"
})
@XmlRootElement(name = "CurrentSupplierInvoice_UpdateFromDataArrayResponse")
public class CurrentSupplierInvoiceUpdateFromDataArrayResponse {

    @XmlElement(name = "CurrentSupplierInvoice_UpdateFromDataArrayResult")
    protected ArrayOfCurrentSupplierInvoiceHandle currentSupplierInvoiceUpdateFromDataArrayResult;

    /**
     * Gets the value of the currentSupplierInvoiceUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentSupplierInvoiceHandle }
     *     
     */
    public ArrayOfCurrentSupplierInvoiceHandle getCurrentSupplierInvoiceUpdateFromDataArrayResult() {
        return currentSupplierInvoiceUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentSupplierInvoiceHandle }
     *     
     */
    public void setCurrentSupplierInvoiceUpdateFromDataArrayResult(ArrayOfCurrentSupplierInvoiceHandle value) {
        this.currentSupplierInvoiceUpdateFromDataArrayResult = value;
    }

}
