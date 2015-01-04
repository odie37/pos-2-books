
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
 *         &lt;element name="Quotation_GetDeliveryCountyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "quotationGetDeliveryCountyResult"
})
@XmlRootElement(name = "Quotation_GetDeliveryCountyResponse")
public class QuotationGetDeliveryCountyResponse {

    @XmlElement(name = "Quotation_GetDeliveryCountyResult")
    protected String quotationGetDeliveryCountyResult;

    /**
     * Gets the value of the quotationGetDeliveryCountyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationGetDeliveryCountyResult() {
        return quotationGetDeliveryCountyResult;
    }

    /**
     * Sets the value of the quotationGetDeliveryCountyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationGetDeliveryCountyResult(String value) {
        this.quotationGetDeliveryCountyResult = value;
    }

}
