
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
 *         &lt;element name="DeliveryLocation_CreateResult" type="{http://e-conomic.com}DeliveryLocationHandle" minOccurs="0"/>
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
    "deliveryLocationCreateResult"
})
@XmlRootElement(name = "DeliveryLocation_CreateResponse")
public class DeliveryLocationCreateResponse {

    @XmlElement(name = "DeliveryLocation_CreateResult")
    protected DeliveryLocationHandle deliveryLocationCreateResult;

    /**
     * Gets the value of the deliveryLocationCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryLocationHandle }
     *     
     */
    public DeliveryLocationHandle getDeliveryLocationCreateResult() {
        return deliveryLocationCreateResult;
    }

    /**
     * Sets the value of the deliveryLocationCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryLocationHandle }
     *     
     */
    public void setDeliveryLocationCreateResult(DeliveryLocationHandle value) {
        this.deliveryLocationCreateResult = value;
    }

}
