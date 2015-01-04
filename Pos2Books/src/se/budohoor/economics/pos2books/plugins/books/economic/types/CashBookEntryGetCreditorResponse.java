
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
 *         &lt;element name="CashBookEntry_GetCreditorResult" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
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
    "cashBookEntryGetCreditorResult"
})
@XmlRootElement(name = "CashBookEntry_GetCreditorResponse")
public class CashBookEntryGetCreditorResponse {

    @XmlElement(name = "CashBookEntry_GetCreditorResult")
    protected CreditorHandle cashBookEntryGetCreditorResult;

    /**
     * Gets the value of the cashBookEntryGetCreditorResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getCashBookEntryGetCreditorResult() {
        return cashBookEntryGetCreditorResult;
    }

    /**
     * Sets the value of the cashBookEntryGetCreditorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setCashBookEntryGetCreditorResult(CreditorHandle value) {
        this.cashBookEntryGetCreditorResult = value;
    }

}
