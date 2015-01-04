
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
 *         &lt;element name="Subscription_GetAllResult" type="{http://e-conomic.com}ArrayOfSubscriptionHandle" minOccurs="0"/>
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
    "subscriptionGetAllResult"
})
@XmlRootElement(name = "Subscription_GetAllResponse")
public class SubscriptionGetAllResponse {

    @XmlElement(name = "Subscription_GetAllResult")
    protected ArrayOfSubscriptionHandle subscriptionGetAllResult;

    /**
     * Gets the value of the subscriptionGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionHandle }
     *     
     */
    public ArrayOfSubscriptionHandle getSubscriptionGetAllResult() {
        return subscriptionGetAllResult;
    }

    /**
     * Sets the value of the subscriptionGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionHandle }
     *     
     */
    public void setSubscriptionGetAllResult(ArrayOfSubscriptionHandle value) {
        this.subscriptionGetAllResult = value;
    }

}
