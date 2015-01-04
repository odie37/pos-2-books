
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
 *         &lt;element name="Order_FindByNumberResult" type="{http://e-conomic.com}OrderHandle" minOccurs="0"/>
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
    "orderFindByNumberResult"
})
@XmlRootElement(name = "Order_FindByNumberResponse")
public class OrderFindByNumberResponse {

    @XmlElement(name = "Order_FindByNumberResult")
    protected OrderHandle orderFindByNumberResult;

    /**
     * Gets the value of the orderFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHandle }
     *     
     */
    public OrderHandle getOrderFindByNumberResult() {
        return orderFindByNumberResult;
    }

    /**
     * Sets the value of the orderFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHandle }
     *     
     */
    public void setOrderFindByNumberResult(OrderHandle value) {
        this.orderFindByNumberResult = value;
    }

}
