
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
 *         &lt;element name="Invoice_FindByOurReferenceResult" type="{http://e-conomic.com}ArrayOfInvoiceHandle" minOccurs="0"/>
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
    "invoiceFindByOurReferenceResult"
})
@XmlRootElement(name = "Invoice_FindByOurReferenceResponse")
public class InvoiceFindByOurReferenceResponse {

    @XmlElement(name = "Invoice_FindByOurReferenceResult")
    protected ArrayOfInvoiceHandle invoiceFindByOurReferenceResult;

    /**
     * Gets the value of the invoiceFindByOurReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceHandle }
     *     
     */
    public ArrayOfInvoiceHandle getInvoiceFindByOurReferenceResult() {
        return invoiceFindByOurReferenceResult;
    }

    /**
     * Sets the value of the invoiceFindByOurReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceHandle }
     *     
     */
    public void setInvoiceFindByOurReferenceResult(ArrayOfInvoiceHandle value) {
        this.invoiceFindByOurReferenceResult = value;
    }

}
