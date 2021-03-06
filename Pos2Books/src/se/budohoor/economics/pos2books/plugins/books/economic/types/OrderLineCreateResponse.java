
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
 *         &lt;element name="OrderLine_CreateResult" type="{http://e-conomic.com}OrderLineHandle" minOccurs="0"/>
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
    "orderLineCreateResult"
})
@XmlRootElement(name = "OrderLine_CreateResponse")
public class OrderLineCreateResponse {

    @XmlElement(name = "OrderLine_CreateResult")
    protected OrderLineHandle orderLineCreateResult;

    /**
     * Gets the value of the orderLineCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineHandle }
     *     
     */
    public OrderLineHandle getOrderLineCreateResult() {
        return orderLineCreateResult;
    }

    /**
     * Sets the value of the orderLineCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineHandle }
     *     
     */
    public void setOrderLineCreateResult(OrderLineHandle value) {
        this.orderLineCreateResult = value;
    }

}
