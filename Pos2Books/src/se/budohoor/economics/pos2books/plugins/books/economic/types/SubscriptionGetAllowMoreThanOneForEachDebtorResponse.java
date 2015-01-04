
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
 *         &lt;element name="Subscription_GetAllowMoreThanOneForEachDebtorResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "subscriptionGetAllowMoreThanOneForEachDebtorResult"
})
@XmlRootElement(name = "Subscription_GetAllowMoreThanOneForEachDebtorResponse")
public class SubscriptionGetAllowMoreThanOneForEachDebtorResponse {

    @XmlElement(name = "Subscription_GetAllowMoreThanOneForEachDebtorResult")
    protected boolean subscriptionGetAllowMoreThanOneForEachDebtorResult;

    /**
     * Gets the value of the subscriptionGetAllowMoreThanOneForEachDebtorResult property.
     * 
     */
    public boolean isSubscriptionGetAllowMoreThanOneForEachDebtorResult() {
        return subscriptionGetAllowMoreThanOneForEachDebtorResult;
    }

    /**
     * Sets the value of the subscriptionGetAllowMoreThanOneForEachDebtorResult property.
     * 
     */
    public void setSubscriptionGetAllowMoreThanOneForEachDebtorResult(boolean value) {
        this.subscriptionGetAllowMoreThanOneForEachDebtorResult = value;
    }

}
