
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
 *         &lt;element name="Order_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfOrderData" minOccurs="0"/>
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
    "orderGetDataArrayResult"
})
@XmlRootElement(name = "Order_GetDataArrayResponse")
public class OrderGetDataArrayResponse {

    @XmlElement(name = "Order_GetDataArrayResult")
    protected ArrayOfOrderData orderGetDataArrayResult;

    /**
     * Gets the value of the orderGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderData }
     *     
     */
    public ArrayOfOrderData getOrderGetDataArrayResult() {
        return orderGetDataArrayResult;
    }

    /**
     * Sets the value of the orderGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderData }
     *     
     */
    public void setOrderGetDataArrayResult(ArrayOfOrderData value) {
        this.orderGetDataArrayResult = value;
    }

}
