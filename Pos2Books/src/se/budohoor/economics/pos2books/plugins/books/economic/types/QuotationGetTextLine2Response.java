
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
 *         &lt;element name="Quotation_GetTextLine2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "quotationGetTextLine2Result"
})
@XmlRootElement(name = "Quotation_GetTextLine2Response")
public class QuotationGetTextLine2Response {

    @XmlElement(name = "Quotation_GetTextLine2Result")
    protected String quotationGetTextLine2Result;

    /**
     * Gets the value of the quotationGetTextLine2Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationGetTextLine2Result() {
        return quotationGetTextLine2Result;
    }

    /**
     * Sets the value of the quotationGetTextLine2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationGetTextLine2Result(String value) {
        this.quotationGetTextLine2Result = value;
    }

}
