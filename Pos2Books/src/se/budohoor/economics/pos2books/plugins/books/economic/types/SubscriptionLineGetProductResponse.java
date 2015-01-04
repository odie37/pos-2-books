
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
 *         &lt;element name="SubscriptionLine_GetProductResult" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
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
    "subscriptionLineGetProductResult"
})
@XmlRootElement(name = "SubscriptionLine_GetProductResponse")
public class SubscriptionLineGetProductResponse {

    @XmlElement(name = "SubscriptionLine_GetProductResult")
    protected ProductHandle subscriptionLineGetProductResult;

    /**
     * Gets the value of the subscriptionLineGetProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductHandle }
     *     
     */
    public ProductHandle getSubscriptionLineGetProductResult() {
        return subscriptionLineGetProductResult;
    }

    /**
     * Sets the value of the subscriptionLineGetProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHandle }
     *     
     */
    public void setSubscriptionLineGetProductResult(ProductHandle value) {
        this.subscriptionLineGetProductResult = value;
    }

}
