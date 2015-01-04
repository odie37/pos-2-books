
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
 *         &lt;element name="Subscription_GetNextAvailableNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "subscriptionGetNextAvailableNumberResult"
})
@XmlRootElement(name = "Subscription_GetNextAvailableNumberResponse")
public class SubscriptionGetNextAvailableNumberResponse {

    @XmlElement(name = "Subscription_GetNextAvailableNumberResult")
    protected int subscriptionGetNextAvailableNumberResult;

    /**
     * Gets the value of the subscriptionGetNextAvailableNumberResult property.
     * 
     */
    public int getSubscriptionGetNextAvailableNumberResult() {
        return subscriptionGetNextAvailableNumberResult;
    }

    /**
     * Sets the value of the subscriptionGetNextAvailableNumberResult property.
     * 
     */
    public void setSubscriptionGetNextAvailableNumberResult(int value) {
        this.subscriptionGetNextAvailableNumberResult = value;
    }

}
