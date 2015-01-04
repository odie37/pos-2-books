
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
 *         &lt;element name="OrderLine_GetDataResult" type="{http://e-conomic.com}OrderLineData" minOccurs="0"/>
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
    "orderLineGetDataResult"
})
@XmlRootElement(name = "OrderLine_GetDataResponse")
public class OrderLineGetDataResponse {

    @XmlElement(name = "OrderLine_GetDataResult")
    protected OrderLineData orderLineGetDataResult;

    /**
     * Gets the value of the orderLineGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineData }
     *     
     */
    public OrderLineData getOrderLineGetDataResult() {
        return orderLineGetDataResult;
    }

    /**
     * Sets the value of the orderLineGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineData }
     *     
     */
    public void setOrderLineGetDataResult(OrderLineData value) {
        this.orderLineGetDataResult = value;
    }

}
