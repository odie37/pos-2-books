
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
 *         &lt;element name="OrderLine_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfOrderLineHandle" minOccurs="0"/>
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
    "orderLineCreateFromDataArrayResult"
})
@XmlRootElement(name = "OrderLine_CreateFromDataArrayResponse")
public class OrderLineCreateFromDataArrayResponse {

    @XmlElement(name = "OrderLine_CreateFromDataArrayResult")
    protected ArrayOfOrderLineHandle orderLineCreateFromDataArrayResult;

    /**
     * Gets the value of the orderLineCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderLineHandle }
     *     
     */
    public ArrayOfOrderLineHandle getOrderLineCreateFromDataArrayResult() {
        return orderLineCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the orderLineCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderLineHandle }
     *     
     */
    public void setOrderLineCreateFromDataArrayResult(ArrayOfOrderLineHandle value) {
        this.orderLineCreateFromDataArrayResult = value;
    }

}
