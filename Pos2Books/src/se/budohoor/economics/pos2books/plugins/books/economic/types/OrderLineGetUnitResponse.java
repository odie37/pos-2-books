
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
 *         &lt;element name="OrderLine_GetUnitResult" type="{http://e-conomic.com}UnitHandle" minOccurs="0"/>
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
    "orderLineGetUnitResult"
})
@XmlRootElement(name = "OrderLine_GetUnitResponse")
public class OrderLineGetUnitResponse {

    @XmlElement(name = "OrderLine_GetUnitResult")
    protected UnitHandle orderLineGetUnitResult;

    /**
     * Gets the value of the orderLineGetUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnitHandle }
     *     
     */
    public UnitHandle getOrderLineGetUnitResult() {
        return orderLineGetUnitResult;
    }

    /**
     * Sets the value of the orderLineGetUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitHandle }
     *     
     */
    public void setOrderLineGetUnitResult(UnitHandle value) {
        this.orderLineGetUnitResult = value;
    }

}
