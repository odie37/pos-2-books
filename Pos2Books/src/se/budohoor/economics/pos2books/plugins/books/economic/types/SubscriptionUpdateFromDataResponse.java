
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
 *         &lt;element name="Subscription_UpdateFromDataResult" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
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
    "subscriptionUpdateFromDataResult"
})
@XmlRootElement(name = "Subscription_UpdateFromDataResponse")
public class SubscriptionUpdateFromDataResponse {

    @XmlElement(name = "Subscription_UpdateFromDataResult")
    protected SubscriptionHandle subscriptionUpdateFromDataResult;

    /**
     * Gets the value of the subscriptionUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriptionUpdateFromDataResult() {
        return subscriptionUpdateFromDataResult;
    }

    /**
     * Sets the value of the subscriptionUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriptionUpdateFromDataResult(SubscriptionHandle value) {
        this.subscriptionUpdateFromDataResult = value;
    }

}
