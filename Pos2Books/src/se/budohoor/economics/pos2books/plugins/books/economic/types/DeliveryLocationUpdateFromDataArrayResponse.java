
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
 *         &lt;element name="DeliveryLocation_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDeliveryLocationHandle" minOccurs="0"/>
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
    "deliveryLocationUpdateFromDataArrayResult"
})
@XmlRootElement(name = "DeliveryLocation_UpdateFromDataArrayResponse")
public class DeliveryLocationUpdateFromDataArrayResponse {

    @XmlElement(name = "DeliveryLocation_UpdateFromDataArrayResult")
    protected ArrayOfDeliveryLocationHandle deliveryLocationUpdateFromDataArrayResult;

    /**
     * Gets the value of the deliveryLocationUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliveryLocationHandle }
     *     
     */
    public ArrayOfDeliveryLocationHandle getDeliveryLocationUpdateFromDataArrayResult() {
        return deliveryLocationUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the deliveryLocationUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliveryLocationHandle }
     *     
     */
    public void setDeliveryLocationUpdateFromDataArrayResult(ArrayOfDeliveryLocationHandle value) {
        this.deliveryLocationUpdateFromDataArrayResult = value;
    }

}
