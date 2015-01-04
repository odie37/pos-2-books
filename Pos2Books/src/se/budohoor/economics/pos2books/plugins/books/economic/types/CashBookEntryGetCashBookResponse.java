
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
 *         &lt;element name="CashBookEntry_GetCashBookResult" type="{http://e-conomic.com}CashBookHandle" minOccurs="0"/>
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
    "cashBookEntryGetCashBookResult"
})
@XmlRootElement(name = "CashBookEntry_GetCashBookResponse")
public class CashBookEntryGetCashBookResponse {

    @XmlElement(name = "CashBookEntry_GetCashBookResult")
    protected CashBookHandle cashBookEntryGetCashBookResult;

    /**
     * Gets the value of the cashBookEntryGetCashBookResult property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookHandle }
     *     
     */
    public CashBookHandle getCashBookEntryGetCashBookResult() {
        return cashBookEntryGetCashBookResult;
    }

    /**
     * Sets the value of the cashBookEntryGetCashBookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookHandle }
     *     
     */
    public void setCashBookEntryGetCashBookResult(CashBookHandle value) {
        this.cashBookEntryGetCashBookResult = value;
    }

}
