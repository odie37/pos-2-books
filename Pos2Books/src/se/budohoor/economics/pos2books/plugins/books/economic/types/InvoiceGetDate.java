
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
 *         &lt;element name="invoiceHandle" type="{http://e-conomic.com}InvoiceHandle" minOccurs="0"/>
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
    "invoiceHandle"
})
@XmlRootElement(name = "Invoice_GetDate")
public class InvoiceGetDate {

    protected InvoiceHandle invoiceHandle;

    /**
     * Gets the value of the invoiceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHandle }
     *     
     */
    public InvoiceHandle getInvoiceHandle() {
        return invoiceHandle;
    }

    /**
     * Sets the value of the invoiceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHandle }
     *     
     */
    public void setInvoiceHandle(InvoiceHandle value) {
        this.invoiceHandle = value;
    }

}
