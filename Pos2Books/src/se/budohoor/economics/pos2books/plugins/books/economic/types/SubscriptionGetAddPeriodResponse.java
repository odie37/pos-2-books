
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
 *         &lt;element name="Subscription_GetAddPeriodResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "subscriptionGetAddPeriodResult"
})
@XmlRootElement(name = "Subscription_GetAddPeriodResponse")
public class SubscriptionGetAddPeriodResponse {

    @XmlElement(name = "Subscription_GetAddPeriodResult")
    protected boolean subscriptionGetAddPeriodResult;

    /**
     * Gets the value of the subscriptionGetAddPeriodResult property.
     * 
     */
    public boolean isSubscriptionGetAddPeriodResult() {
        return subscriptionGetAddPeriodResult;
    }

    /**
     * Sets the value of the subscriptionGetAddPeriodResult property.
     * 
     */
    public void setSubscriptionGetAddPeriodResult(boolean value) {
        this.subscriptionGetAddPeriodResult = value;
    }

}
