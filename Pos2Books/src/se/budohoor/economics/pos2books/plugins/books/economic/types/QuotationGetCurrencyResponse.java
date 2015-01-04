
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
 *         &lt;element name="Quotation_GetCurrencyResult" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
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
    "quotationGetCurrencyResult"
})
@XmlRootElement(name = "Quotation_GetCurrencyResponse")
public class QuotationGetCurrencyResponse {

    @XmlElement(name = "Quotation_GetCurrencyResult")
    protected CurrencyHandle quotationGetCurrencyResult;

    /**
     * Gets the value of the quotationGetCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getQuotationGetCurrencyResult() {
        return quotationGetCurrencyResult;
    }

    /**
     * Sets the value of the quotationGetCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setQuotationGetCurrencyResult(CurrencyHandle value) {
        this.quotationGetCurrencyResult = value;
    }

}
