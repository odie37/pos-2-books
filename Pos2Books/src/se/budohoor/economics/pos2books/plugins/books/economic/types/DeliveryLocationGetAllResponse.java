
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
 *         &lt;element name="DeliveryLocation_GetAllResult" type="{http://e-conomic.com}ArrayOfDeliveryLocationHandle" minOccurs="0"/>
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
    "deliveryLocationGetAllResult"
})
@XmlRootElement(name = "DeliveryLocation_GetAllResponse")
public class DeliveryLocationGetAllResponse {

    @XmlElement(name = "DeliveryLocation_GetAllResult")
    protected ArrayOfDeliveryLocationHandle deliveryLocationGetAllResult;

    /**
     * Gets the value of the deliveryLocationGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliveryLocationHandle }
     *     
     */
    public ArrayOfDeliveryLocationHandle getDeliveryLocationGetAllResult() {
        return deliveryLocationGetAllResult;
    }

    /**
     * Sets the value of the deliveryLocationGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliveryLocationHandle }
     *     
     */
    public void setDeliveryLocationGetAllResult(ArrayOfDeliveryLocationHandle value) {
        this.deliveryLocationGetAllResult = value;
    }

}
