
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
 *         &lt;element name="Subscription_CreateResult" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
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
    "subscriptionCreateResult"
})
@XmlRootElement(name = "Subscription_CreateResponse")
public class SubscriptionCreateResponse {

    @XmlElement(name = "Subscription_CreateResult")
    protected SubscriptionHandle subscriptionCreateResult;

    /**
     * Gets the value of the subscriptionCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriptionCreateResult() {
        return subscriptionCreateResult;
    }

    /**
     * Sets the value of the subscriptionCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriptionCreateResult(SubscriptionHandle value) {
        this.subscriptionCreateResult = value;
    }

}
