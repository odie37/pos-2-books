
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
 *         &lt;element name="DebtorEntry_GetAmountDefaultCurrencyResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "debtorEntryGetAmountDefaultCurrencyResult"
})
@XmlRootElement(name = "DebtorEntry_GetAmountDefaultCurrencyResponse")
public class DebtorEntryGetAmountDefaultCurrencyResponse {

    @XmlElement(name = "DebtorEntry_GetAmountDefaultCurrencyResult", required = true)
    protected BigDecimal debtorEntryGetAmountDefaultCurrencyResult;

    /**
     * Gets the value of the debtorEntryGetAmountDefaultCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtorEntryGetAmountDefaultCurrencyResult() {
        return debtorEntryGetAmountDefaultCurrencyResult;
    }

    /**
     * Sets the value of the debtorEntryGetAmountDefaultCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtorEntryGetAmountDefaultCurrencyResult(BigDecimal value) {
        this.debtorEntryGetAmountDefaultCurrencyResult = value;
    }

}
