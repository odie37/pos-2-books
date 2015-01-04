
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
 *         &lt;element name="DeliveryLocation_GetCountyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "deliveryLocationGetCountyResult"
})
@XmlRootElement(name = "DeliveryLocation_GetCountyResponse")
public class DeliveryLocationGetCountyResponse {

    @XmlElement(name = "DeliveryLocation_GetCountyResult")
    protected String deliveryLocationGetCountyResult;

    /**
     * Gets the value of the deliveryLocationGetCountyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryLocationGetCountyResult() {
        return deliveryLocationGetCountyResult;
    }

    /**
     * Sets the value of the deliveryLocationGetCountyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryLocationGetCountyResult(String value) {
        this.deliveryLocationGetCountyResult = value;
    }

}
