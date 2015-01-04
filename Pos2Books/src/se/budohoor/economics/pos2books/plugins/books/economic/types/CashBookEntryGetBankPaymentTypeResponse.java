
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
 *         &lt;element name="CashBookEntry_GetBankPaymentTypeResult" type="{http://e-conomic.com}BankPaymentTypeHandle" minOccurs="0"/>
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
    "cashBookEntryGetBankPaymentTypeResult"
})
@XmlRootElement(name = "CashBookEntry_GetBankPaymentTypeResponse")
public class CashBookEntryGetBankPaymentTypeResponse {

    @XmlElement(name = "CashBookEntry_GetBankPaymentTypeResult")
    protected BankPaymentTypeHandle cashBookEntryGetBankPaymentTypeResult;

    /**
     * Gets the value of the cashBookEntryGetBankPaymentTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public BankPaymentTypeHandle getCashBookEntryGetBankPaymentTypeResult() {
        return cashBookEntryGetBankPaymentTypeResult;
    }

    /**
     * Sets the value of the cashBookEntryGetBankPaymentTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public void setCashBookEntryGetBankPaymentTypeResult(BankPaymentTypeHandle value) {
        this.cashBookEntryGetBankPaymentTypeResult = value;
    }

}
