
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
 *         &lt;element name="Order_FindByDateIntervalResult" type="{http://e-conomic.com}ArrayOfOrderHandle" minOccurs="0"/>
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
    "orderFindByDateIntervalResult"
})
@XmlRootElement(name = "Order_FindByDateIntervalResponse")
public class OrderFindByDateIntervalResponse {

    @XmlElement(name = "Order_FindByDateIntervalResult")
    protected ArrayOfOrderHandle orderFindByDateIntervalResult;

    /**
     * Gets the value of the orderFindByDateIntervalResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public ArrayOfOrderHandle getOrderFindByDateIntervalResult() {
        return orderFindByDateIntervalResult;
    }

    /**
     * Sets the value of the orderFindByDateIntervalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public void setOrderFindByDateIntervalResult(ArrayOfOrderHandle value) {
        this.orderFindByDateIntervalResult = value;
    }

}
