
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
 *         &lt;element name="Quotation_GetDeliveryLocationResult" type="{http://e-conomic.com}DeliveryLocationHandle" minOccurs="0"/>
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
    "quotationGetDeliveryLocationResult"
})
@XmlRootElement(name = "Quotation_GetDeliveryLocationResponse")
public class QuotationGetDeliveryLocationResponse {

    @XmlElement(name = "Quotation_GetDeliveryLocationResult")
    protected DeliveryLocationHandle quotationGetDeliveryLocationResult;

    /**
     * Gets the value of the quotationGetDeliveryLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryLocationHandle }
     *     
     */
    public DeliveryLocationHandle getQuotationGetDeliveryLocationResult() {
        return quotationGetDeliveryLocationResult;
    }

    /**
     * Sets the value of the quotationGetDeliveryLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryLocationHandle }
     *     
     */
    public void setQuotationGetDeliveryLocationResult(DeliveryLocationHandle value) {
        this.quotationGetDeliveryLocationResult = value;
    }

}
