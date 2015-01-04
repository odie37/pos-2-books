
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
 *         &lt;element name="DeliveryLocation_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfDeliveryLocationData" minOccurs="0"/>
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
    "deliveryLocationGetDataArrayResult"
})
@XmlRootElement(name = "DeliveryLocation_GetDataArrayResponse")
public class DeliveryLocationGetDataArrayResponse {

    @XmlElement(name = "DeliveryLocation_GetDataArrayResult")
    protected ArrayOfDeliveryLocationData deliveryLocationGetDataArrayResult;

    /**
     * Gets the value of the deliveryLocationGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliveryLocationData }
     *     
     */
    public ArrayOfDeliveryLocationData getDeliveryLocationGetDataArrayResult() {
        return deliveryLocationGetDataArrayResult;
    }

    /**
     * Sets the value of the deliveryLocationGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliveryLocationData }
     *     
     */
    public void setDeliveryLocationGetDataArrayResult(ArrayOfDeliveryLocationData value) {
        this.deliveryLocationGetDataArrayResult = value;
    }

}
