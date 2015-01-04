
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
 *         &lt;element name="Subscriber_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfSubscriberHandle" minOccurs="0"/>
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
    "subscriberCreateFromDataArrayResult"
})
@XmlRootElement(name = "Subscriber_CreateFromDataArrayResponse")
public class SubscriberCreateFromDataArrayResponse {

    @XmlElement(name = "Subscriber_CreateFromDataArrayResult")
    protected ArrayOfSubscriberHandle subscriberCreateFromDataArrayResult;

    /**
     * Gets the value of the subscriberCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriberHandle }
     *     
     */
    public ArrayOfSubscriberHandle getSubscriberCreateFromDataArrayResult() {
        return subscriberCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the subscriberCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriberHandle }
     *     
     */
    public void setSubscriberCreateFromDataArrayResult(ArrayOfSubscriberHandle value) {
        this.subscriberCreateFromDataArrayResult = value;
    }

}
