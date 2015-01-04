
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
 *         &lt;element name="Order_GetDeliveryCountyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "orderGetDeliveryCountyResult"
})
@XmlRootElement(name = "Order_GetDeliveryCountyResponse")
public class OrderGetDeliveryCountyResponse {

    @XmlElement(name = "Order_GetDeliveryCountyResult")
    protected String orderGetDeliveryCountyResult;

    /**
     * Gets the value of the orderGetDeliveryCountyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderGetDeliveryCountyResult() {
        return orderGetDeliveryCountyResult;
    }

    /**
     * Sets the value of the orderGetDeliveryCountyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderGetDeliveryCountyResult(String value) {
        this.orderGetDeliveryCountyResult = value;
    }

}
