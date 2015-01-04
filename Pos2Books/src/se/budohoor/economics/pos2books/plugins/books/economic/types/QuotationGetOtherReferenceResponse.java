
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
 *         &lt;element name="Quotation_GetOtherReferenceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "quotationGetOtherReferenceResult"
})
@XmlRootElement(name = "Quotation_GetOtherReferenceResponse")
public class QuotationGetOtherReferenceResponse {

    @XmlElement(name = "Quotation_GetOtherReferenceResult")
    protected String quotationGetOtherReferenceResult;

    /**
     * Gets the value of the quotationGetOtherReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationGetOtherReferenceResult() {
        return quotationGetOtherReferenceResult;
    }

    /**
     * Sets the value of the quotationGetOtherReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationGetOtherReferenceResult(String value) {
        this.quotationGetOtherReferenceResult = value;
    }

}
