
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
 *         &lt;element name="SubscriptionLine_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfSubscriptionLineHandle" minOccurs="0"/>
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
    "subscriptionLineCreateFromDataArrayResult"
})
@XmlRootElement(name = "SubscriptionLine_CreateFromDataArrayResponse")
public class SubscriptionLineCreateFromDataArrayResponse {

    @XmlElement(name = "SubscriptionLine_CreateFromDataArrayResult")
    protected ArrayOfSubscriptionLineHandle subscriptionLineCreateFromDataArrayResult;

    /**
     * Gets the value of the subscriptionLineCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionLineHandle }
     *     
     */
    public ArrayOfSubscriptionLineHandle getSubscriptionLineCreateFromDataArrayResult() {
        return subscriptionLineCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the subscriptionLineCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionLineHandle }
     *     
     */
    public void setSubscriptionLineCreateFromDataArrayResult(ArrayOfSubscriptionLineHandle value) {
        this.subscriptionLineCreateFromDataArrayResult = value;
    }

}
