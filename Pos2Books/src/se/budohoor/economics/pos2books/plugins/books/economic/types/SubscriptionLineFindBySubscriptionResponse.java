
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
 *         &lt;element name="SubscriptionLine_FindBySubscriptionResult" type="{http://e-conomic.com}ArrayOfSubscriptionLineHandle" minOccurs="0"/>
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
    "subscriptionLineFindBySubscriptionResult"
})
@XmlRootElement(name = "SubscriptionLine_FindBySubscriptionResponse")
public class SubscriptionLineFindBySubscriptionResponse {

    @XmlElement(name = "SubscriptionLine_FindBySubscriptionResult")
    protected ArrayOfSubscriptionLineHandle subscriptionLineFindBySubscriptionResult;

    /**
     * Gets the value of the subscriptionLineFindBySubscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionLineHandle }
     *     
     */
    public ArrayOfSubscriptionLineHandle getSubscriptionLineFindBySubscriptionResult() {
        return subscriptionLineFindBySubscriptionResult;
    }

    /**
     * Sets the value of the subscriptionLineFindBySubscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionLineHandle }
     *     
     */
    public void setSubscriptionLineFindBySubscriptionResult(ArrayOfSubscriptionLineHandle value) {
        this.subscriptionLineFindBySubscriptionResult = value;
    }

}
