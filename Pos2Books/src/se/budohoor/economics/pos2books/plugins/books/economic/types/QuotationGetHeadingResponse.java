
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
 *         &lt;element name="Quotation_GetHeadingResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "quotationGetHeadingResult"
})
@XmlRootElement(name = "Quotation_GetHeadingResponse")
public class QuotationGetHeadingResponse {

    @XmlElement(name = "Quotation_GetHeadingResult")
    protected String quotationGetHeadingResult;

    /**
     * Gets the value of the quotationGetHeadingResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationGetHeadingResult() {
        return quotationGetHeadingResult;
    }

    /**
     * Sets the value of the quotationGetHeadingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationGetHeadingResult(String value) {
        this.quotationGetHeadingResult = value;
    }

}
