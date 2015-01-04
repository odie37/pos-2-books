
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
 *         &lt;element name="SubscriptionLine_GetSubscriptionResult" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
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
    "subscriptionLineGetSubscriptionResult"
})
@XmlRootElement(name = "SubscriptionLine_GetSubscriptionResponse")
public class SubscriptionLineGetSubscriptionResponse {

    @XmlElement(name = "SubscriptionLine_GetSubscriptionResult")
    protected SubscriptionHandle subscriptionLineGetSubscriptionResult;

    /**
     * Gets the value of the subscriptionLineGetSubscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriptionLineGetSubscriptionResult() {
        return subscriptionLineGetSubscriptionResult;
    }

    /**
     * Sets the value of the subscriptionLineGetSubscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriptionLineGetSubscriptionResult(SubscriptionHandle value) {
        this.subscriptionLineGetSubscriptionResult = value;
    }

}
