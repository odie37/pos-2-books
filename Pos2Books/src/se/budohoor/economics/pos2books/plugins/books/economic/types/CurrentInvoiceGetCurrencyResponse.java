
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
 *         &lt;element name="CurrentInvoice_GetCurrencyResult" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
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
    "currentInvoiceGetCurrencyResult"
})
@XmlRootElement(name = "CurrentInvoice_GetCurrencyResponse")
public class CurrentInvoiceGetCurrencyResponse {

    @XmlElement(name = "CurrentInvoice_GetCurrencyResult")
    protected CurrencyHandle currentInvoiceGetCurrencyResult;

    /**
     * Gets the value of the currentInvoiceGetCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getCurrentInvoiceGetCurrencyResult() {
        return currentInvoiceGetCurrencyResult;
    }

    /**
     * Sets the value of the currentInvoiceGetCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setCurrentInvoiceGetCurrencyResult(CurrencyHandle value) {
        this.currentInvoiceGetCurrencyResult = value;
    }

}
