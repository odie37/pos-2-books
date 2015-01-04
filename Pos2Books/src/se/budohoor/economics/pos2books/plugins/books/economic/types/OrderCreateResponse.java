
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
 *         &lt;element name="Order_CreateResult" type="{http://e-conomic.com}OrderHandle" minOccurs="0"/>
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
    "orderCreateResult"
})
@XmlRootElement(name = "Order_CreateResponse")
public class OrderCreateResponse {

    @XmlElement(name = "Order_CreateResult")
    protected OrderHandle orderCreateResult;

    /**
     * Gets the value of the orderCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHandle }
     *     
     */
    public OrderHandle getOrderCreateResult() {
        return orderCreateResult;
    }

    /**
     * Sets the value of the orderCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHandle }
     *     
     */
    public void setOrderCreateResult(OrderHandle value) {
        this.orderCreateResult = value;
    }

}
