
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
 *         &lt;element name="Subscription_GetCollectionResult" type="{http://e-conomic.com}SubscriptionCollection"/>
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
    "subscriptionGetCollectionResult"
})
@XmlRootElement(name = "Subscription_GetCollectionResponse")
public class SubscriptionGetCollectionResponse {

    @XmlElement(name = "Subscription_GetCollectionResult", required = true)
    protected SubscriptionCollection subscriptionGetCollectionResult;

    /**
     * Gets the value of the subscriptionGetCollectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionCollection }
     *     
     */
    public SubscriptionCollection getSubscriptionGetCollectionResult() {
        return subscriptionGetCollectionResult;
    }

    /**
     * Sets the value of the subscriptionGetCollectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionCollection }
     *     
     */
    public void setSubscriptionGetCollectionResult(SubscriptionCollection value) {
        this.subscriptionGetCollectionResult = value;
    }

}
