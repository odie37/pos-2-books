
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
 *         &lt;element name="CreditorEntry_GetCurrencyResult" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
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
    "creditorEntryGetCurrencyResult"
})
@XmlRootElement(name = "CreditorEntry_GetCurrencyResponse")
public class CreditorEntryGetCurrencyResponse {

    @XmlElement(name = "CreditorEntry_GetCurrencyResult")
    protected CurrencyHandle creditorEntryGetCurrencyResult;

    /**
     * Gets the value of the creditorEntryGetCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getCreditorEntryGetCurrencyResult() {
        return creditorEntryGetCurrencyResult;
    }

    /**
     * Sets the value of the creditorEntryGetCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setCreditorEntryGetCurrencyResult(CurrencyHandle value) {
        this.creditorEntryGetCurrencyResult = value;
    }

}
