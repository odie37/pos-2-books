
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
 *         &lt;element name="Quotation_GetDeliveryCountryResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "quotationGetDeliveryCountryResult"
})
@XmlRootElement(name = "Quotation_GetDeliveryCountryResponse")
public class QuotationGetDeliveryCountryResponse {

    @XmlElement(name = "Quotation_GetDeliveryCountryResult")
    protected String quotationGetDeliveryCountryResult;

    /**
     * Gets the value of the quotationGetDeliveryCountryResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationGetDeliveryCountryResult() {
        return quotationGetDeliveryCountryResult;
    }

    /**
     * Sets the value of the quotationGetDeliveryCountryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationGetDeliveryCountryResult(String value) {
        this.quotationGetDeliveryCountryResult = value;
    }

}
