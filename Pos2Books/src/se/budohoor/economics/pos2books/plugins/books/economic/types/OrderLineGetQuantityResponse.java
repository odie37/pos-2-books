
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
 *         &lt;element name="OrderLine_GetQuantityResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "orderLineGetQuantityResult"
})
@XmlRootElement(name = "OrderLine_GetQuantityResponse")
public class OrderLineGetQuantityResponse {

    @XmlElement(name = "OrderLine_GetQuantityResult", required = true, nillable = true)
    protected BigDecimal orderLineGetQuantityResult;

    /**
     * Gets the value of the orderLineGetQuantityResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderLineGetQuantityResult() {
        return orderLineGetQuantityResult;
    }

    /**
     * Sets the value of the orderLineGetQuantityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderLineGetQuantityResult(BigDecimal value) {
        this.orderLineGetQuantityResult = value;
    }

}
