
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
 *         &lt;element name="Subscription_CreateFromDataResult" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
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
    "subscriptionCreateFromDataResult"
})
@XmlRootElement(name = "Subscription_CreateFromDataResponse")
public class SubscriptionCreateFromDataResponse {

    @XmlElement(name = "Subscription_CreateFromDataResult")
    protected SubscriptionHandle subscriptionCreateFromDataResult;

    /**
     * Gets the value of the subscriptionCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriptionCreateFromDataResult() {
        return subscriptionCreateFromDataResult;
    }

    /**
     * Sets the value of the subscriptionCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriptionCreateFromDataResult(SubscriptionHandle value) {
        this.subscriptionCreateFromDataResult = value;
    }

}
