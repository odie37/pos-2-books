
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
 *         &lt;element name="subscriptionHandle" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
 *         &lt;element name="value" type="{http://e-conomic.com}SubscriptionInterval"/>
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
    "subscriptionHandle",
    "value"
})
@XmlRootElement(name = "Subscription_SetSubscriptionInterval")
public class SubscriptionSetSubscriptionInterval {

    protected SubscriptionHandle subscriptionHandle;
    @XmlElement(required = true)
    protected SubscriptionInterval value;

    /**
     * Gets the value of the subscriptionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriptionHandle() {
        return subscriptionHandle;
    }

    /**
     * Sets the value of the subscriptionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriptionHandle(SubscriptionHandle value) {
        this.subscriptionHandle = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionInterval }
     *     
     */
    public SubscriptionInterval getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionInterval }
     *     
     */
    public void setValue(SubscriptionInterval value) {
        this.value = value;
    }

}
