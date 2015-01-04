
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
 *         &lt;element name="Currency_GetAllResult" type="{http://e-conomic.com}ArrayOfCurrencyHandle" minOccurs="0"/>
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
    "currencyGetAllResult"
})
@XmlRootElement(name = "Currency_GetAllResponse")
public class CurrencyGetAllResponse {

    @XmlElement(name = "Currency_GetAllResult")
    protected ArrayOfCurrencyHandle currencyGetAllResult;

    /**
     * Gets the value of the currencyGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyHandle }
     *     
     */
    public ArrayOfCurrencyHandle getCurrencyGetAllResult() {
        return currencyGetAllResult;
    }

    /**
     * Sets the value of the currencyGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyHandle }
     *     
     */
    public void setCurrencyGetAllResult(ArrayOfCurrencyHandle value) {
        this.currencyGetAllResult = value;
    }

}
