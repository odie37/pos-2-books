
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
 *         &lt;element name="Subscription_GetIncludeNameResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "subscriptionGetIncludeNameResult"
})
@XmlRootElement(name = "Subscription_GetIncludeNameResponse")
public class SubscriptionGetIncludeNameResponse {

    @XmlElement(name = "Subscription_GetIncludeNameResult")
    protected boolean subscriptionGetIncludeNameResult;

    /**
     * Gets the value of the subscriptionGetIncludeNameResult property.
     * 
     */
    public boolean isSubscriptionGetIncludeNameResult() {
        return subscriptionGetIncludeNameResult;
    }

    /**
     * Sets the value of the subscriptionGetIncludeNameResult property.
     * 
     */
    public void setSubscriptionGetIncludeNameResult(boolean value) {
        this.subscriptionGetIncludeNameResult = value;
    }

}
