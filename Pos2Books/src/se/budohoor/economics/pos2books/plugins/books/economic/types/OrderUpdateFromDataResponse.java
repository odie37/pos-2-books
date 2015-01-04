
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
 *         &lt;element name="Order_UpdateFromDataResult" type="{http://e-conomic.com}OrderHandle" minOccurs="0"/>
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
    "orderUpdateFromDataResult"
})
@XmlRootElement(name = "Order_UpdateFromDataResponse")
public class OrderUpdateFromDataResponse {

    @XmlElement(name = "Order_UpdateFromDataResult")
    protected OrderHandle orderUpdateFromDataResult;

    /**
     * Gets the value of the orderUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHandle }
     *     
     */
    public OrderHandle getOrderUpdateFromDataResult() {
        return orderUpdateFromDataResult;
    }

    /**
     * Sets the value of the orderUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHandle }
     *     
     */
    public void setOrderUpdateFromDataResult(OrderHandle value) {
        this.orderUpdateFromDataResult = value;
    }

}
