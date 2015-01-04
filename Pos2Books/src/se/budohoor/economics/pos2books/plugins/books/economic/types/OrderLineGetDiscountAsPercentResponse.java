
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
 *         &lt;element name="OrderLine_GetDiscountAsPercentResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "orderLineGetDiscountAsPercentResult"
})
@XmlRootElement(name = "OrderLine_GetDiscountAsPercentResponse")
public class OrderLineGetDiscountAsPercentResponse {

    @XmlElement(name = "OrderLine_GetDiscountAsPercentResult", required = true)
    protected BigDecimal orderLineGetDiscountAsPercentResult;

    /**
     * Gets the value of the orderLineGetDiscountAsPercentResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderLineGetDiscountAsPercentResult() {
        return orderLineGetDiscountAsPercentResult;
    }

    /**
     * Sets the value of the orderLineGetDiscountAsPercentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderLineGetDiscountAsPercentResult(BigDecimal value) {
        this.orderLineGetDiscountAsPercentResult = value;
    }

}
