
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
 *         &lt;element name="Order_GetCurrencyResult" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
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
    "orderGetCurrencyResult"
})
@XmlRootElement(name = "Order_GetCurrencyResponse")
public class OrderGetCurrencyResponse {

    @XmlElement(name = "Order_GetCurrencyResult")
    protected CurrencyHandle orderGetCurrencyResult;

    /**
     * Gets the value of the orderGetCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getOrderGetCurrencyResult() {
        return orderGetCurrencyResult;
    }

    /**
     * Sets the value of the orderGetCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setOrderGetCurrencyResult(CurrencyHandle value) {
        this.orderGetCurrencyResult = value;
    }

}
