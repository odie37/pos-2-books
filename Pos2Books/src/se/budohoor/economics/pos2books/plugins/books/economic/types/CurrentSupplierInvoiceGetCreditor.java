
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="currentSupplierInvoiceHandle" type="{http://e-conomic.com}CurrentSupplierInvoiceHandle" minOccurs="0"/>
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
    "currentSupplierInvoiceHandle"
})
@XmlRootElement(name = "CurrentSupplierInvoice_GetCreditor")
public class CurrentSupplierInvoiceGetCreditor {

    protected CurrentSupplierInvoiceHandle currentSupplierInvoiceHandle;

    /**
     * Gets the value of the currentSupplierInvoiceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public CurrentSupplierInvoiceHandle getCurrentSupplierInvoiceHandle() {
        return currentSupplierInvoiceHandle;
    }

    /**
     * Sets the value of the currentSupplierInvoiceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public void setCurrentSupplierInvoiceHandle(CurrentSupplierInvoiceHandle value) {
        this.currentSupplierInvoiceHandle = value;
    }

}
