
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
 *         &lt;element name="Subscription_FindByNumberResult" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
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
    "subscriptionFindByNumberResult"
})
@XmlRootElement(name = "Subscription_FindByNumberResponse")
public class SubscriptionFindByNumberResponse {

    @XmlElement(name = "Subscription_FindByNumberResult")
    protected SubscriptionHandle subscriptionFindByNumberResult;

    /**
     * Gets the value of the subscriptionFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriptionFindByNumberResult() {
        return subscriptionFindByNumberResult;
    }

    /**
     * Sets the value of the subscriptionFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriptionFindByNumberResult(SubscriptionHandle value) {
        this.subscriptionFindByNumberResult = value;
    }

}
