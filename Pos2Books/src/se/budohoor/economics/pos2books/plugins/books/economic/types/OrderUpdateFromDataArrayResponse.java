
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
 *         &lt;element name="Order_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfOrderHandle" minOccurs="0"/>
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
    "orderUpdateFromDataArrayResult"
})
@XmlRootElement(name = "Order_UpdateFromDataArrayResponse")
public class OrderUpdateFromDataArrayResponse {

    @XmlElement(name = "Order_UpdateFromDataArrayResult")
    protected ArrayOfOrderHandle orderUpdateFromDataArrayResult;

    /**
     * Gets the value of the orderUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public ArrayOfOrderHandle getOrderUpdateFromDataArrayResult() {
        return orderUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the orderUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public void setOrderUpdateFromDataArrayResult(ArrayOfOrderHandle value) {
        this.orderUpdateFromDataArrayResult = value;
    }

}
