
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
 *         &lt;element name="OrderLine_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfOrderLineData" minOccurs="0"/>
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
    "orderLineGetDataArrayResult"
})
@XmlRootElement(name = "OrderLine_GetDataArrayResponse")
public class OrderLineGetDataArrayResponse {

    @XmlElement(name = "OrderLine_GetDataArrayResult")
    protected ArrayOfOrderLineData orderLineGetDataArrayResult;

    /**
     * Gets the value of the orderLineGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderLineData }
     *     
     */
    public ArrayOfOrderLineData getOrderLineGetDataArrayResult() {
        return orderLineGetDataArrayResult;
    }

    /**
     * Sets the value of the orderLineGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderLineData }
     *     
     */
    public void setOrderLineGetDataArrayResult(ArrayOfOrderLineData value) {
        this.orderLineGetDataArrayResult = value;
    }

}
