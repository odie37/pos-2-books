
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
 *         &lt;element name="ProductPrice_GetCurrencyResult" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
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
    "productPriceGetCurrencyResult"
})
@XmlRootElement(name = "ProductPrice_GetCurrencyResponse")
public class ProductPriceGetCurrencyResponse {

    @XmlElement(name = "ProductPrice_GetCurrencyResult")
    protected CurrencyHandle productPriceGetCurrencyResult;

    /**
     * Gets the value of the productPriceGetCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getProductPriceGetCurrencyResult() {
        return productPriceGetCurrencyResult;
    }

    /**
     * Sets the value of the productPriceGetCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setProductPriceGetCurrencyResult(CurrencyHandle value) {
        this.productPriceGetCurrencyResult = value;
    }

}
