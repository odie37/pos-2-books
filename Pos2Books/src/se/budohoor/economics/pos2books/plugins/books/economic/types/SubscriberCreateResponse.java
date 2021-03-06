
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
 *         &lt;element name="Subscriber_CreateResult" type="{http://e-conomic.com}SubscriberHandle" minOccurs="0"/>
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
    "subscriberCreateResult"
})
@XmlRootElement(name = "Subscriber_CreateResponse")
public class SubscriberCreateResponse {

    @XmlElement(name = "Subscriber_CreateResult")
    protected SubscriberHandle subscriberCreateResult;

    /**
     * Gets the value of the subscriberCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberHandle }
     *     
     */
    public SubscriberHandle getSubscriberCreateResult() {
        return subscriberCreateResult;
    }

    /**
     * Sets the value of the subscriberCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberHandle }
     *     
     */
    public void setSubscriberCreateResult(SubscriberHandle value) {
        this.subscriberCreateResult = value;
    }

}
