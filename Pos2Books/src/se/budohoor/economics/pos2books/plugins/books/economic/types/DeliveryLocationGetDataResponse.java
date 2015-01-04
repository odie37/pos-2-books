
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
 *         &lt;element name="DeliveryLocation_GetDataResult" type="{http://e-conomic.com}DeliveryLocationData" minOccurs="0"/>
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
    "deliveryLocationGetDataResult"
})
@XmlRootElement(name = "DeliveryLocation_GetDataResponse")
public class DeliveryLocationGetDataResponse {

    @XmlElement(name = "DeliveryLocation_GetDataResult")
    protected DeliveryLocationData deliveryLocationGetDataResult;

    /**
     * Gets the value of the deliveryLocationGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryLocationData }
     *     
     */
    public DeliveryLocationData getDeliveryLocationGetDataResult() {
        return deliveryLocationGetDataResult;
    }

    /**
     * Sets the value of the deliveryLocationGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryLocationData }
     *     
     */
    public void setDeliveryLocationGetDataResult(DeliveryLocationData value) {
        this.deliveryLocationGetDataResult = value;
    }

}
