
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
 *         &lt;element name="invoiceLineHandle" type="{http://e-conomic.com}InvoiceLineHandle" minOccurs="0"/>
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
    "invoiceLineHandle"
})
@XmlRootElement(name = "InvoiceLine_GetQuantity")
public class InvoiceLineGetQuantity {

    protected InvoiceLineHandle invoiceLineHandle;

    /**
     * Gets the value of the invoiceLineHandle property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLineHandle }
     *     
     */
    public InvoiceLineHandle getInvoiceLineHandle() {
        return invoiceLineHandle;
    }

    /**
     * Sets the value of the invoiceLineHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLineHandle }
     *     
     */
    public void setInvoiceLineHandle(InvoiceLineHandle value) {
        this.invoiceLineHandle = value;
    }

}
