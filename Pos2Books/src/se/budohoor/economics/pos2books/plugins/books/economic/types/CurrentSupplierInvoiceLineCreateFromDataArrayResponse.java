
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
 *         &lt;element name="CurrentSupplierInvoiceLine_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentSupplierInvoiceLineHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceLineCreateFromDataArrayResult"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_CreateFromDataArrayResponse")
public class CurrentSupplierInvoiceLineCreateFromDataArrayResponse {

    @XmlElement(name = "CurrentSupplierInvoiceLine_CreateFromDataArrayResult")
    protected ArrayOfCurrentSupplierInvoiceLineHandle currentSupplierInvoiceLineCreateFromDataArrayResult;

    /**
     * Gets the value of the currentSupplierInvoiceLineCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentSupplierInvoiceLineHandle }
     *     
     */
    public ArrayOfCurrentSupplierInvoiceLineHandle getCurrentSupplierInvoiceLineCreateFromDataArrayResult() {
        return currentSupplierInvoiceLineCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceLineCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentSupplierInvoiceLineHandle }
     *     
     */
    public void setCurrentSupplierInvoiceLineCreateFromDataArrayResult(ArrayOfCurrentSupplierInvoiceLineHandle value) {
        this.currentSupplierInvoiceLineCreateFromDataArrayResult = value;
    }

}
