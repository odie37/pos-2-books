
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
 *         &lt;element name="Subscription_GetSubscriptionIntervalResult" type="{http://e-conomic.com}SubscriptionInterval"/>
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
    "subscriptionGetSubscriptionIntervalResult"
})
@XmlRootElement(name = "Subscription_GetSubscriptionIntervalResponse")
public class SubscriptionGetSubscriptionIntervalResponse {

    @XmlElement(name = "Subscription_GetSubscriptionIntervalResult", required = true)
    protected SubscriptionInterval subscriptionGetSubscriptionIntervalResult;

    /**
     * Gets the value of the subscriptionGetSubscriptionIntervalResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionInterval }
     *     
     */
    public SubscriptionInterval getSubscriptionGetSubscriptionIntervalResult() {
        return subscriptionGetSubscriptionIntervalResult;
    }

    /**
     * Sets the value of the subscriptionGetSubscriptionIntervalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionInterval }
     *     
     */
    public void setSubscriptionGetSubscriptionIntervalResult(SubscriptionInterval value) {
        this.subscriptionGetSubscriptionIntervalResult = value;
    }

}
