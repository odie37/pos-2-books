
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
 *         &lt;element name="Quotation_GetDeliveryAddressResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "quotationGetDeliveryAddressResult"
})
@XmlRootElement(name = "Quotation_GetDeliveryAddressResponse")
public class QuotationGetDeliveryAddressResponse {

    @XmlElement(name = "Quotation_GetDeliveryAddressResult")
    protected String quotationGetDeliveryAddressResult;

    /**
     * Gets the value of the quotationGetDeliveryAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationGetDeliveryAddressResult() {
        return quotationGetDeliveryAddressResult;
    }

    /**
     * Sets the value of the quotationGetDeliveryAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationGetDeliveryAddressResult(String value) {
        this.quotationGetDeliveryAddressResult = value;
    }

}
