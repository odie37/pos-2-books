
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
 *         &lt;element name="OrderLine_CreateFromDataResult" type="{http://e-conomic.com}OrderLineHandle" minOccurs="0"/>
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
    "orderLineCreateFromDataResult"
})
@XmlRootElement(name = "OrderLine_CreateFromDataResponse")
public class OrderLineCreateFromDataResponse {

    @XmlElement(name = "OrderLine_CreateFromDataResult")
    protected OrderLineHandle orderLineCreateFromDataResult;

    /**
     * Gets the value of the orderLineCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineHandle }
     *     
     */
    public OrderLineHandle getOrderLineCreateFromDataResult() {
        return orderLineCreateFromDataResult;
    }

    /**
     * Sets the value of the orderLineCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineHandle }
     *     
     */
    public void setOrderLineCreateFromDataResult(OrderLineHandle value) {
        this.orderLineCreateFromDataResult = value;
    }

}
