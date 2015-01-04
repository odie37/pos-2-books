
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
 *         &lt;element name="CurrentSupplierInvoice_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentSupplierInvoiceHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceCreateFromDataArrayResult"
})
@XmlRootElement(name = "CurrentSupplierInvoice_CreateFromDataArrayResponse")
public class CurrentSupplierInvoiceCreateFromDataArrayResponse {

    @XmlElement(name = "CurrentSupplierInvoice_CreateFromDataArrayResult")
    protected ArrayOfCurrentSupplierInvoiceHandle currentSupplierInvoiceCreateFromDataArrayResult;

    /**
     * Gets the value of the currentSupplierInvoiceCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentSupplierInvoiceHandle }
     *     
     */
    public ArrayOfCurrentSupplierInvoiceHandle getCurrentSupplierInvoiceCreateFromDataArrayResult() {
        return currentSupplierInvoiceCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentSupplierInvoiceHandle }
     *     
     */
    public void setCurrentSupplierInvoiceCreateFromDataArrayResult(ArrayOfCurrentSupplierInvoiceHandle value) {
        this.currentSupplierInvoiceCreateFromDataArrayResult = value;
    }

}
