
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
 *         &lt;element name="CashBookEntry_GetVatAccountResult" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
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
    "cashBookEntryGetVatAccountResult"
})
@XmlRootElement(name = "CashBookEntry_GetVatAccountResponse")
public class CashBookEntryGetVatAccountResponse {

    @XmlElement(name = "CashBookEntry_GetVatAccountResult")
    protected VatAccountHandle cashBookEntryGetVatAccountResult;

    /**
     * Gets the value of the cashBookEntryGetVatAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountHandle }
     *     
     */
    public VatAccountHandle getCashBookEntryGetVatAccountResult() {
        return cashBookEntryGetVatAccountResult;
    }

    /**
     * Sets the value of the cashBookEntryGetVatAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountHandle }
     *     
     */
    public void setCashBookEntryGetVatAccountResult(VatAccountHandle value) {
        this.cashBookEntryGetVatAccountResult = value;
    }

}
