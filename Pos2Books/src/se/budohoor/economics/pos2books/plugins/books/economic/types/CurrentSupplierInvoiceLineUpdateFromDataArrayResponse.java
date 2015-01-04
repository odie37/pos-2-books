
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
 *         &lt;element name="CurrentSupplierInvoiceLine_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentSupplierInvoiceLineHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceLineUpdateFromDataArrayResult"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_UpdateFromDataArrayResponse")
public class CurrentSupplierInvoiceLineUpdateFromDataArrayResponse {

    @XmlElement(name = "CurrentSupplierInvoiceLine_UpdateFromDataArrayResult")
    protected ArrayOfCurrentSupplierInvoiceLineHandle currentSupplierInvoiceLineUpdateFromDataArrayResult;

    /**
     * Gets the value of the currentSupplierInvoiceLineUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentSupplierInvoiceLineHandle }
     *     
     */
    public ArrayOfCurrentSupplierInvoiceLineHandle getCurrentSupplierInvoiceLineUpdateFromDataArrayResult() {
        return currentSupplierInvoiceLineUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceLineUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentSupplierInvoiceLineHandle }
     *     
     */
    public void setCurrentSupplierInvoiceLineUpdateFromDataArrayResult(ArrayOfCurrentSupplierInvoiceLineHandle value) {
        this.currentSupplierInvoiceLineUpdateFromDataArrayResult = value;
    }

}
