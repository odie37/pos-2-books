
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
 *         &lt;element name="OrderLine_GetMarginAsPercentResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "orderLineGetMarginAsPercentResult"
})
@XmlRootElement(name = "OrderLine_GetMarginAsPercentResponse")
public class OrderLineGetMarginAsPercentResponse {

    @XmlElement(name = "OrderLine_GetMarginAsPercentResult", required = true)
    protected BigDecimal orderLineGetMarginAsPercentResult;

    /**
     * Gets the value of the orderLineGetMarginAsPercentResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderLineGetMarginAsPercentResult() {
        return orderLineGetMarginAsPercentResult;
    }

    /**
     * Sets the value of the orderLineGetMarginAsPercentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderLineGetMarginAsPercentResult(BigDecimal value) {
        this.orderLineGetMarginAsPercentResult = value;
    }

}
