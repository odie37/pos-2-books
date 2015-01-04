
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
 *         &lt;element name="CurrentInvoice_GetDeliveryLocationResult" type="{http://e-conomic.com}DeliveryLocationHandle" minOccurs="0"/>
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
    "currentInvoiceGetDeliveryLocationResult"
})
@XmlRootElement(name = "CurrentInvoice_GetDeliveryLocationResponse")
public class CurrentInvoiceGetDeliveryLocationResponse {

    @XmlElement(name = "CurrentInvoice_GetDeliveryLocationResult")
    protected DeliveryLocationHandle currentInvoiceGetDeliveryLocationResult;

    /**
     * Gets the value of the currentInvoiceGetDeliveryLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryLocationHandle }
     *     
     */
    public DeliveryLocationHandle getCurrentInvoiceGetDeliveryLocationResult() {
        return currentInvoiceGetDeliveryLocationResult;
    }

    /**
     * Sets the value of the currentInvoiceGetDeliveryLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryLocationHandle }
     *     
     */
    public void setCurrentInvoiceGetDeliveryLocationResult(DeliveryLocationHandle value) {
        this.currentInvoiceGetDeliveryLocationResult = value;
    }

}
