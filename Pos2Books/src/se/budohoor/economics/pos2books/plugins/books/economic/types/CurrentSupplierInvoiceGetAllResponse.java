
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
 *         &lt;element name="CurrentSupplierInvoice_GetAllResult" type="{http://e-conomic.com}ArrayOfCurrentSupplierInvoiceHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceGetAllResult"
})
@XmlRootElement(name = "CurrentSupplierInvoice_GetAllResponse")
public class CurrentSupplierInvoiceGetAllResponse {

    @XmlElement(name = "CurrentSupplierInvoice_GetAllResult")
    protected ArrayOfCurrentSupplierInvoiceHandle currentSupplierInvoiceGetAllResult;

    /**
     * Gets the value of the currentSupplierInvoiceGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentSupplierInvoiceHandle }
     *     
     */
    public ArrayOfCurrentSupplierInvoiceHandle getCurrentSupplierInvoiceGetAllResult() {
        return currentSupplierInvoiceGetAllResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentSupplierInvoiceHandle }
     *     
     */
    public void setCurrentSupplierInvoiceGetAllResult(ArrayOfCurrentSupplierInvoiceHandle value) {
        this.currentSupplierInvoiceGetAllResult = value;
    }

}
