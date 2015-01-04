
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
 *         &lt;element name="OrderLine_GetInventoryLocationResult" type="{http://e-conomic.com}InventoryLocationHandle" minOccurs="0"/>
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
    "orderLineGetInventoryLocationResult"
})
@XmlRootElement(name = "OrderLine_GetInventoryLocationResponse")
public class OrderLineGetInventoryLocationResponse {

    @XmlElement(name = "OrderLine_GetInventoryLocationResult")
    protected InventoryLocationHandle orderLineGetInventoryLocationResult;

    /**
     * Gets the value of the orderLineGetInventoryLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationHandle }
     *     
     */
    public InventoryLocationHandle getOrderLineGetInventoryLocationResult() {
        return orderLineGetInventoryLocationResult;
    }

    /**
     * Sets the value of the orderLineGetInventoryLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationHandle }
     *     
     */
    public void setOrderLineGetInventoryLocationResult(InventoryLocationHandle value) {
        this.orderLineGetInventoryLocationResult = value;
    }

}
