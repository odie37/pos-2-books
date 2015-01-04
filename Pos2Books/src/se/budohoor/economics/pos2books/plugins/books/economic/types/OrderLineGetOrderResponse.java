
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
 *         &lt;element name="OrderLine_GetOrderResult" type="{http://e-conomic.com}OrderHandle" minOccurs="0"/>
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
    "orderLineGetOrderResult"
})
@XmlRootElement(name = "OrderLine_GetOrderResponse")
public class OrderLineGetOrderResponse {

    @XmlElement(name = "OrderLine_GetOrderResult")
    protected OrderHandle orderLineGetOrderResult;

    /**
     * Gets the value of the orderLineGetOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHandle }
     *     
     */
    public OrderHandle getOrderLineGetOrderResult() {
        return orderLineGetOrderResult;
    }

    /**
     * Sets the value of the orderLineGetOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHandle }
     *     
     */
    public void setOrderLineGetOrderResult(OrderHandle value) {
        this.orderLineGetOrderResult = value;
    }

}
