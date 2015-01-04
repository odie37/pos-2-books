
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
 *         &lt;element name="CashBookEntry_CreateCreditorPaymentResult" type="{http://e-conomic.com}CashBookEntryHandle" minOccurs="0"/>
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
    "cashBookEntryCreateCreditorPaymentResult"
})
@XmlRootElement(name = "CashBookEntry_CreateCreditorPaymentResponse")
public class CashBookEntryCreateCreditorPaymentResponse {

    @XmlElement(name = "CashBookEntry_CreateCreditorPaymentResult")
    protected CashBookEntryHandle cashBookEntryCreateCreditorPaymentResult;

    /**
     * Gets the value of the cashBookEntryCreateCreditorPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public CashBookEntryHandle getCashBookEntryCreateCreditorPaymentResult() {
        return cashBookEntryCreateCreditorPaymentResult;
    }

    /**
     * Sets the value of the cashBookEntryCreateCreditorPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public void setCashBookEntryCreateCreditorPaymentResult(CashBookEntryHandle value) {
        this.cashBookEntryCreateCreditorPaymentResult = value;
    }

}
