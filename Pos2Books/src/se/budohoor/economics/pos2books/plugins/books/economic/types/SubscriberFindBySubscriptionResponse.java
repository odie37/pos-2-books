
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
 *         &lt;element name="Subscriber_FindBySubscriptionResult" type="{http://e-conomic.com}ArrayOfSubscriberHandle" minOccurs="0"/>
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
    "subscriberFindBySubscriptionResult"
})
@XmlRootElement(name = "Subscriber_FindBySubscriptionResponse")
public class SubscriberFindBySubscriptionResponse {

    @XmlElement(name = "Subscriber_FindBySubscriptionResult")
    protected ArrayOfSubscriberHandle subscriberFindBySubscriptionResult;

    /**
     * Gets the value of the subscriberFindBySubscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriberHandle }
     *     
     */
    public ArrayOfSubscriberHandle getSubscriberFindBySubscriptionResult() {
        return subscriberFindBySubscriptionResult;
    }

    /**
     * Sets the value of the subscriberFindBySubscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriberHandle }
     *     
     */
    public void setSubscriberFindBySubscriptionResult(ArrayOfSubscriberHandle value) {
        this.subscriberFindBySubscriptionResult = value;
    }

}
