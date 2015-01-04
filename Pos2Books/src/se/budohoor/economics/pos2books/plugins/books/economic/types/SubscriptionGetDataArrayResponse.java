
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
 *         &lt;element name="Subscription_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfSubscriptionData" minOccurs="0"/>
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
    "subscriptionGetDataArrayResult"
})
@XmlRootElement(name = "Subscription_GetDataArrayResponse")
public class SubscriptionGetDataArrayResponse {

    @XmlElement(name = "Subscription_GetDataArrayResult")
    protected ArrayOfSubscriptionData subscriptionGetDataArrayResult;

    /**
     * Gets the value of the subscriptionGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionData }
     *     
     */
    public ArrayOfSubscriptionData getSubscriptionGetDataArrayResult() {
        return subscriptionGetDataArrayResult;
    }

    /**
     * Sets the value of the subscriptionGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionData }
     *     
     */
    public void setSubscriptionGetDataArrayResult(ArrayOfSubscriptionData value) {
        this.subscriptionGetDataArrayResult = value;
    }

}
