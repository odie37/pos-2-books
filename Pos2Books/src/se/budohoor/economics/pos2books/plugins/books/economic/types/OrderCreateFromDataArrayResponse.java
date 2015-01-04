
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
 *         &lt;element name="Order_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfOrderHandle" minOccurs="0"/>
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
    "orderCreateFromDataArrayResult"
})
@XmlRootElement(name = "Order_CreateFromDataArrayResponse")
public class OrderCreateFromDataArrayResponse {

    @XmlElement(name = "Order_CreateFromDataArrayResult")
    protected ArrayOfOrderHandle orderCreateFromDataArrayResult;

    /**
     * Gets the value of the orderCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public ArrayOfOrderHandle getOrderCreateFromDataArrayResult() {
        return orderCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the orderCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public void setOrderCreateFromDataArrayResult(ArrayOfOrderHandle value) {
        this.orderCreateFromDataArrayResult = value;
    }

}
