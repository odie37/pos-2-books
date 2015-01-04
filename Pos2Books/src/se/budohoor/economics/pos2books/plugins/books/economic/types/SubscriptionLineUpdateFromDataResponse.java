
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
 *         &lt;element name="SubscriptionLine_UpdateFromDataResult" type="{http://e-conomic.com}SubscriptionLineHandle" minOccurs="0"/>
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
    "subscriptionLineUpdateFromDataResult"
})
@XmlRootElement(name = "SubscriptionLine_UpdateFromDataResponse")
public class SubscriptionLineUpdateFromDataResponse {

    @XmlElement(name = "SubscriptionLine_UpdateFromDataResult")
    protected SubscriptionLineHandle subscriptionLineUpdateFromDataResult;

    /**
     * Gets the value of the subscriptionLineUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionLineHandle }
     *     
     */
    public SubscriptionLineHandle getSubscriptionLineUpdateFromDataResult() {
        return subscriptionLineUpdateFromDataResult;
    }

    /**
     * Sets the value of the subscriptionLineUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionLineHandle }
     *     
     */
    public void setSubscriptionLineUpdateFromDataResult(SubscriptionLineHandle value) {
        this.subscriptionLineUpdateFromDataResult = value;
    }

}
