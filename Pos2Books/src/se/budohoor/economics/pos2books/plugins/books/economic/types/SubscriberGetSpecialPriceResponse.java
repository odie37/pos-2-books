
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
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
 *         &lt;element name="Subscriber_GetSpecialPriceResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "subscriberGetSpecialPriceResult"
})
@XmlRootElement(name = "Subscriber_GetSpecialPriceResponse")
public class SubscriberGetSpecialPriceResponse {

    @XmlElement(name = "Subscriber_GetSpecialPriceResult", required = true, nillable = true)
    protected BigDecimal subscriberGetSpecialPriceResult;

    /**
     * Gets the value of the subscriberGetSpecialPriceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscriberGetSpecialPriceResult() {
        return subscriberGetSpecialPriceResult;
    }

    /**
     * Sets the value of the subscriberGetSpecialPriceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriberGetSpecialPriceResult(BigDecimal value) {
        this.subscriberGetSpecialPriceResult = value;
    }

}
