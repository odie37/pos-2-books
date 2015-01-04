
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
 *         &lt;element name="Order_GetMarginAsPercentResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "orderGetMarginAsPercentResult"
})
@XmlRootElement(name = "Order_GetMarginAsPercentResponse")
public class OrderGetMarginAsPercentResponse {

    @XmlElement(name = "Order_GetMarginAsPercentResult", required = true)
    protected BigDecimal orderGetMarginAsPercentResult;

    /**
     * Gets the value of the orderGetMarginAsPercentResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderGetMarginAsPercentResult() {
        return orderGetMarginAsPercentResult;
    }

    /**
     * Sets the value of the orderGetMarginAsPercentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderGetMarginAsPercentResult(BigDecimal value) {
        this.orderGetMarginAsPercentResult = value;
    }

}
