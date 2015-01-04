
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
 *         &lt;element name="OrderLine_GetTotalNetAmountResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "orderLineGetTotalNetAmountResult"
})
@XmlRootElement(name = "OrderLine_GetTotalNetAmountResponse")
public class OrderLineGetTotalNetAmountResponse {

    @XmlElement(name = "OrderLine_GetTotalNetAmountResult", required = true, nillable = true)
    protected BigDecimal orderLineGetTotalNetAmountResult;

    /**
     * Gets the value of the orderLineGetTotalNetAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderLineGetTotalNetAmountResult() {
        return orderLineGetTotalNetAmountResult;
    }

    /**
     * Sets the value of the orderLineGetTotalNetAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderLineGetTotalNetAmountResult(BigDecimal value) {
        this.orderLineGetTotalNetAmountResult = value;
    }

}
