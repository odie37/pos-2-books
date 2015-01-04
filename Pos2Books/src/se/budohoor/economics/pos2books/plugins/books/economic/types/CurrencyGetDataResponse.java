
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
 *         &lt;element name="Currency_GetDataResult" type="{http://e-conomic.com}CurrencyData" minOccurs="0"/>
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
    "currencyGetDataResult"
})
@XmlRootElement(name = "Currency_GetDataResponse")
public class CurrencyGetDataResponse {

    @XmlElement(name = "Currency_GetDataResult")
    protected CurrencyData currencyGetDataResult;

    /**
     * Gets the value of the currencyGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyData }
     *     
     */
    public CurrencyData getCurrencyGetDataResult() {
        return currencyGetDataResult;
    }

    /**
     * Sets the value of the currencyGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyData }
     *     
     */
    public void setCurrencyGetDataResult(CurrencyData value) {
        this.currencyGetDataResult = value;
    }

}
