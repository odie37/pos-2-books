
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
 *         &lt;element name="CashBookEntry_GetTypeResult" type="{http://e-conomic.com}CashBookEntryType"/>
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
    "cashBookEntryGetTypeResult"
})
@XmlRootElement(name = "CashBookEntry_GetTypeResponse")
public class CashBookEntryGetTypeResponse {

    @XmlElement(name = "CashBookEntry_GetTypeResult", required = true)
    protected CashBookEntryType cashBookEntryGetTypeResult;

    /**
     * Gets the value of the cashBookEntryGetTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookEntryType }
     *     
     */
    public CashBookEntryType getCashBookEntryGetTypeResult() {
        return cashBookEntryGetTypeResult;
    }

    /**
     * Sets the value of the cashBookEntryGetTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookEntryType }
     *     
     */
    public void setCashBookEntryGetTypeResult(CashBookEntryType value) {
        this.cashBookEntryGetTypeResult = value;
    }

}
