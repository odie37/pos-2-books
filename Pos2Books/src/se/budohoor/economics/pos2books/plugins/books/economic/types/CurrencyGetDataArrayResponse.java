
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
 *         &lt;element name="Currency_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrencyData" minOccurs="0"/>
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
    "currencyGetDataArrayResult"
})
@XmlRootElement(name = "Currency_GetDataArrayResponse")
public class CurrencyGetDataArrayResponse {

    @XmlElement(name = "Currency_GetDataArrayResult")
    protected ArrayOfCurrencyData currencyGetDataArrayResult;

    /**
     * Gets the value of the currencyGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyData }
     *     
     */
    public ArrayOfCurrencyData getCurrencyGetDataArrayResult() {
        return currencyGetDataArrayResult;
    }

    /**
     * Sets the value of the currencyGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyData }
     *     
     */
    public void setCurrencyGetDataArrayResult(ArrayOfCurrencyData value) {
        this.currencyGetDataArrayResult = value;
    }

}
