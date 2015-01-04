
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
 *         &lt;element name="InvoiceLine_FindByInvoiceNumberIntervalResult" type="{http://e-conomic.com}ArrayOfInvoiceLineHandle" minOccurs="0"/>
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
    "invoiceLineFindByInvoiceNumberIntervalResult"
})
@XmlRootElement(name = "InvoiceLine_FindByInvoiceNumberIntervalResponse")
public class InvoiceLineFindByInvoiceNumberIntervalResponse {

    @XmlElement(name = "InvoiceLine_FindByInvoiceNumberIntervalResult")
    protected ArrayOfInvoiceLineHandle invoiceLineFindByInvoiceNumberIntervalResult;

    /**
     * Gets the value of the invoiceLineFindByInvoiceNumberIntervalResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceLineHandle }
     *     
     */
    public ArrayOfInvoiceLineHandle getInvoiceLineFindByInvoiceNumberIntervalResult() {
        return invoiceLineFindByInvoiceNumberIntervalResult;
    }

    /**
     * Sets the value of the invoiceLineFindByInvoiceNumberIntervalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceLineHandle }
     *     
     */
    public void setInvoiceLineFindByInvoiceNumberIntervalResult(ArrayOfInvoiceLineHandle value) {
        this.invoiceLineFindByInvoiceNumberIntervalResult = value;
    }

}
