
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
 *         &lt;element name="Subscriber_GetSubscriptionResult" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
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
    "subscriberGetSubscriptionResult"
})
@XmlRootElement(name = "Subscriber_GetSubscriptionResponse")
public class SubscriberGetSubscriptionResponse {

    @XmlElement(name = "Subscriber_GetSubscriptionResult")
    protected SubscriptionHandle subscriberGetSubscriptionResult;

    /**
     * Gets the value of the subscriberGetSubscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriberGetSubscriptionResult() {
        return subscriberGetSubscriptionResult;
    }

    /**
     * Sets the value of the subscriberGetSubscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriberGetSubscriptionResult(SubscriptionHandle value) {
        this.subscriberGetSubscriptionResult = value;
    }

}
