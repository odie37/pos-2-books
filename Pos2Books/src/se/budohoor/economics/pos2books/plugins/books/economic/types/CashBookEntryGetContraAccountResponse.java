
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
 *         &lt;element name="CashBookEntry_GetContraAccountResult" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "cashBookEntryGetContraAccountResult"
})
@XmlRootElement(name = "CashBookEntry_GetContraAccountResponse")
public class CashBookEntryGetContraAccountResponse {

    @XmlElement(name = "CashBookEntry_GetContraAccountResult")
    protected AccountHandle cashBookEntryGetContraAccountResult;

    /**
     * Gets the value of the cashBookEntryGetContraAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getCashBookEntryGetContraAccountResult() {
        return cashBookEntryGetContraAccountResult;
    }

    /**
     * Sets the value of the cashBookEntryGetContraAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setCashBookEntryGetContraAccountResult(AccountHandle value) {
        this.cashBookEntryGetContraAccountResult = value;
    }

}
