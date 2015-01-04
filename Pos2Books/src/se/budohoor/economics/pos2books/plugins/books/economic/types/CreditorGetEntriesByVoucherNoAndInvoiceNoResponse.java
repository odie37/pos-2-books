
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
 *         &lt;element name="Creditor_GetEntriesByVoucherNoAndInvoiceNoResult" type="{http://e-conomic.com}ArrayOfCreditorEntryHandle" minOccurs="0"/>
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
    "creditorGetEntriesByVoucherNoAndInvoiceNoResult"
})
@XmlRootElement(name = "Creditor_GetEntriesByVoucherNoAndInvoiceNoResponse")
public class CreditorGetEntriesByVoucherNoAndInvoiceNoResponse {

    @XmlElement(name = "Creditor_GetEntriesByVoucherNoAndInvoiceNoResult")
    protected ArrayOfCreditorEntryHandle creditorGetEntriesByVoucherNoAndInvoiceNoResult;

    /**
     * Gets the value of the creditorGetEntriesByVoucherNoAndInvoiceNoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public ArrayOfCreditorEntryHandle getCreditorGetEntriesByVoucherNoAndInvoiceNoResult() {
        return creditorGetEntriesByVoucherNoAndInvoiceNoResult;
    }

    /**
     * Sets the value of the creditorGetEntriesByVoucherNoAndInvoiceNoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public void setCreditorGetEntriesByVoucherNoAndInvoiceNoResult(ArrayOfCreditorEntryHandle value) {
        this.creditorGetEntriesByVoucherNoAndInvoiceNoResult = value;
    }

}
