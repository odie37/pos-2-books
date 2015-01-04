
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
 *         &lt;element name="Entry_GetAmountDefaultCurrencyResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "entryGetAmountDefaultCurrencyResult"
})
@XmlRootElement(name = "Entry_GetAmountDefaultCurrencyResponse")
public class EntryGetAmountDefaultCurrencyResponse {

    @XmlElement(name = "Entry_GetAmountDefaultCurrencyResult", required = true)
    protected BigDecimal entryGetAmountDefaultCurrencyResult;

    /**
     * Gets the value of the entryGetAmountDefaultCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntryGetAmountDefaultCurrencyResult() {
        return entryGetAmountDefaultCurrencyResult;
    }

    /**
     * Sets the value of the entryGetAmountDefaultCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntryGetAmountDefaultCurrencyResult(BigDecimal value) {
        this.entryGetAmountDefaultCurrencyResult = value;
    }

}
