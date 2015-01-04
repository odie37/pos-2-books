
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
 *         &lt;element name="SubscriptionLine_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfSubscriptionLineData" minOccurs="0"/>
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
    "subscriptionLineGetDataArrayResult"
})
@XmlRootElement(name = "SubscriptionLine_GetDataArrayResponse")
public class SubscriptionLineGetDataArrayResponse {

    @XmlElement(name = "SubscriptionLine_GetDataArrayResult")
    protected ArrayOfSubscriptionLineData subscriptionLineGetDataArrayResult;

    /**
     * Gets the value of the subscriptionLineGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionLineData }
     *     
     */
    public ArrayOfSubscriptionLineData getSubscriptionLineGetDataArrayResult() {
        return subscriptionLineGetDataArrayResult;
    }

    /**
     * Sets the value of the subscriptionLineGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionLineData }
     *     
     */
    public void setSubscriptionLineGetDataArrayResult(ArrayOfSubscriptionLineData value) {
        this.subscriptionLineGetDataArrayResult = value;
    }

}
