
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
 *         &lt;element name="Invoice_GetAttentionResult" type="{http://e-conomic.com}DebtorContactHandle" minOccurs="0"/>
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
    "invoiceGetAttentionResult"
})
@XmlRootElement(name = "Invoice_GetAttentionResponse")
public class InvoiceGetAttentionResponse {

    @XmlElement(name = "Invoice_GetAttentionResult")
    protected DebtorContactHandle invoiceGetAttentionResult;

    /**
     * Gets the value of the invoiceGetAttentionResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorContactHandle }
     *     
     */
    public DebtorContactHandle getInvoiceGetAttentionResult() {
        return invoiceGetAttentionResult;
    }

    /**
     * Sets the value of the invoiceGetAttentionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorContactHandle }
     *     
     */
    public void setInvoiceGetAttentionResult(DebtorContactHandle value) {
        this.invoiceGetAttentionResult = value;
    }

}
