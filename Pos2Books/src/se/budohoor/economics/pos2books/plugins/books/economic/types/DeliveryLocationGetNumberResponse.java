
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
 *         &lt;element name="DeliveryLocation_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "deliveryLocationGetNumberResult"
})
@XmlRootElement(name = "DeliveryLocation_GetNumberResponse")
public class DeliveryLocationGetNumberResponse {

    @XmlElement(name = "DeliveryLocation_GetNumberResult")
    protected int deliveryLocationGetNumberResult;

    /**
     * Gets the value of the deliveryLocationGetNumberResult property.
     * 
     */
    public int getDeliveryLocationGetNumberResult() {
        return deliveryLocationGetNumberResult;
    }

    /**
     * Sets the value of the deliveryLocationGetNumberResult property.
     * 
     */
    public void setDeliveryLocationGetNumberResult(int value) {
        this.deliveryLocationGetNumberResult = value;
    }

}
