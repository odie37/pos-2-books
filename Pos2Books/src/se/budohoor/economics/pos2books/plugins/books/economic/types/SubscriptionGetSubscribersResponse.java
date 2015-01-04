
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
 *         &lt;element name="Subscription_GetSubscribersResult" type="{http://e-conomic.com}ArrayOfSubscriberHandle" minOccurs="0"/>
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
    "subscriptionGetSubscribersResult"
})
@XmlRootElement(name = "Subscription_GetSubscribersResponse")
public class SubscriptionGetSubscribersResponse {

    @XmlElement(name = "Subscription_GetSubscribersResult")
    protected ArrayOfSubscriberHandle subscriptionGetSubscribersResult;

    /**
     * Gets the value of the subscriptionGetSubscribersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriberHandle }
     *     
     */
    public ArrayOfSubscriberHandle getSubscriptionGetSubscribersResult() {
        return subscriptionGetSubscribersResult;
    }

    /**
     * Sets the value of the subscriptionGetSubscribersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriberHandle }
     *     
     */
    public void setSubscriptionGetSubscribersResult(ArrayOfSubscriberHandle value) {
        this.subscriptionGetSubscribersResult = value;
    }

}
