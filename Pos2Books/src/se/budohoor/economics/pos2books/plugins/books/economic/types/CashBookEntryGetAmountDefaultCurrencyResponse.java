
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
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
 *         &lt;element name="CashBookEntry_GetAmountDefaultCurrencyResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "cashBookEntryGetAmountDefaultCurrencyResult"
})
@XmlRootElement(name = "CashBookEntry_GetAmountDefaultCurrencyResponse")
public class CashBookEntryGetAmountDefaultCurrencyResponse {

    @XmlElement(name = "CashBookEntry_GetAmountDefaultCurrencyResult", required = true)
    protected BigDecimal cashBookEntryGetAmountDefaultCurrencyResult;

    /**
     * Gets the value of the cashBookEntryGetAmountDefaultCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashBookEntryGetAmountDefaultCurrencyResult() {
        return cashBookEntryGetAmountDefaultCurrencyResult;
    }

    /**
     * Sets the value of the cashBookEntryGetAmountDefaultCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashBookEntryGetAmountDefaultCurrencyResult(BigDecimal value) {
        this.cashBookEntryGetAmountDefaultCurrencyResult = value;
    }

}
