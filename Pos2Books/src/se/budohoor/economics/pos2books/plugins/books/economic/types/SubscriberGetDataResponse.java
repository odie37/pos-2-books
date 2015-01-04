
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
 *         &lt;element name="Subscriber_GetDataResult" type="{http://e-conomic.com}SubscriberData" minOccurs="0"/>
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
    "subscriberGetDataResult"
})
@XmlRootElement(name = "Subscriber_GetDataResponse")
public class SubscriberGetDataResponse {

    @XmlElement(name = "Subscriber_GetDataResult")
    protected SubscriberData subscriberGetDataResult;

    /**
     * Gets the value of the subscriberGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberData }
     *     
     */
    public SubscriberData getSubscriberGetDataResult() {
        return subscriberGetDataResult;
    }

    /**
     * Sets the value of the subscriberGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberData }
     *     
     */
    public void setSubscriberGetDataResult(SubscriberData value) {
        this.subscriberGetDataResult = value;
    }

}
