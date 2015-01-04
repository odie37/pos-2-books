
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
 *         &lt;element name="SubscriptionLine_FindBySubscriptonListResult" type="{http://e-conomic.com}ArrayOfSubscriptionLineHandle" minOccurs="0"/>
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
    "subscriptionLineFindBySubscriptonListResult"
})
@XmlRootElement(name = "SubscriptionLine_FindBySubscriptonListResponse")
public class SubscriptionLineFindBySubscriptonListResponse {

    @XmlElement(name = "SubscriptionLine_FindBySubscriptonListResult")
    protected ArrayOfSubscriptionLineHandle subscriptionLineFindBySubscriptonListResult;

    /**
     * Gets the value of the subscriptionLineFindBySubscriptonListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionLineHandle }
     *     
     */
    public ArrayOfSubscriptionLineHandle getSubscriptionLineFindBySubscriptonListResult() {
        return subscriptionLineFindBySubscriptonListResult;
    }

    /**
     * Sets the value of the subscriptionLineFindBySubscriptonListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionLineHandle }
     *     
     */
    public void setSubscriptionLineFindBySubscriptonListResult(ArrayOfSubscriptionLineHandle value) {
        this.subscriptionLineFindBySubscriptonListResult = value;
    }

}
