
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
 *         &lt;element name="Order_GetAllCurrentResult" type="{http://e-conomic.com}ArrayOfOrderHandle" minOccurs="0"/>
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
    "orderGetAllCurrentResult"
})
@XmlRootElement(name = "Order_GetAllCurrentResponse")
public class OrderGetAllCurrentResponse {

    @XmlElement(name = "Order_GetAllCurrentResult")
    protected ArrayOfOrderHandle orderGetAllCurrentResult;

    /**
     * Gets the value of the orderGetAllCurrentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public ArrayOfOrderHandle getOrderGetAllCurrentResult() {
        return orderGetAllCurrentResult;
    }

    /**
     * Sets the value of the orderGetAllCurrentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public void setOrderGetAllCurrentResult(ArrayOfOrderHandle value) {
        this.orderGetAllCurrentResult = value;
    }

}
