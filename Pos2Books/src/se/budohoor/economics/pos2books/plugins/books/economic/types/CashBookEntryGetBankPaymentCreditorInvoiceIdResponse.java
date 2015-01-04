
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
 *         &lt;element name="CashBookEntry_GetBankPaymentCreditorInvoiceIdResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cashBookEntryGetBankPaymentCreditorInvoiceIdResult"
})
@XmlRootElement(name = "CashBookEntry_GetBankPaymentCreditorInvoiceIdResponse")
public class CashBookEntryGetBankPaymentCreditorInvoiceIdResponse {

    @XmlElement(name = "CashBookEntry_GetBankPaymentCreditorInvoiceIdResult")
    protected String cashBookEntryGetBankPaymentCreditorInvoiceIdResult;

    /**
     * Gets the value of the cashBookEntryGetBankPaymentCreditorInvoiceIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashBookEntryGetBankPaymentCreditorInvoiceIdResult() {
        return cashBookEntryGetBankPaymentCreditorInvoiceIdResult;
    }

    /**
     * Sets the value of the cashBookEntryGetBankPaymentCreditorInvoiceIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashBookEntryGetBankPaymentCreditorInvoiceIdResult(String value) {
        this.cashBookEntryGetBankPaymentCreditorInvoiceIdResult = value;
    }

}
