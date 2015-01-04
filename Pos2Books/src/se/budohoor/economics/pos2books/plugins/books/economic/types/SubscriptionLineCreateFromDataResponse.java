
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
 *         &lt;element name="SubscriptionLine_CreateFromDataResult" type="{http://e-conomic.com}SubscriptionLineHandle" minOccurs="0"/>
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
    "subscriptionLineCreateFromDataResult"
})
@XmlRootElement(name = "SubscriptionLine_CreateFromDataResponse")
public class SubscriptionLineCreateFromDataResponse {

    @XmlElement(name = "SubscriptionLine_CreateFromDataResult")
    protected SubscriptionLineHandle subscriptionLineCreateFromDataResult;

    /**
     * Gets the value of the subscriptionLineCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionLineHandle }
     *     
     */
    public SubscriptionLineHandle getSubscriptionLineCreateFromDataResult() {
        return subscriptionLineCreateFromDataResult;
    }

    /**
     * Sets the value of the subscriptionLineCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionLineHandle }
     *     
     */
    public void setSubscriptionLineCreateFromDataResult(SubscriptionLineHandle value) {
        this.subscriptionLineCreateFromDataResult = value;
    }

}
