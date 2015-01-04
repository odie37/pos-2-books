
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
 *         &lt;element name="SubscriptionLine_FindByProductResult" type="{http://e-conomic.com}ArrayOfSubscriptionLineHandle" minOccurs="0"/>
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
    "subscriptionLineFindByProductResult"
})
@XmlRootElement(name = "SubscriptionLine_FindByProductResponse")
public class SubscriptionLineFindByProductResponse {

    @XmlElement(name = "SubscriptionLine_FindByProductResult")
    protected ArrayOfSubscriptionLineHandle subscriptionLineFindByProductResult;

    /**
     * Gets the value of the subscriptionLineFindByProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionLineHandle }
     *     
     */
    public ArrayOfSubscriptionLineHandle getSubscriptionLineFindByProductResult() {
        return subscriptionLineFindByProductResult;
    }

    /**
     * Sets the value of the subscriptionLineFindByProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionLineHandle }
     *     
     */
    public void setSubscriptionLineFindByProductResult(ArrayOfSubscriptionLineHandle value) {
        this.subscriptionLineFindByProductResult = value;
    }

}
