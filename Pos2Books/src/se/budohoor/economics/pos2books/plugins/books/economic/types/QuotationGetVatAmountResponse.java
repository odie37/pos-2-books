
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
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
 *         &lt;element name="Quotation_GetVatAmountResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "quotationGetVatAmountResult"
})
@XmlRootElement(name = "Quotation_GetVatAmountResponse")
public class QuotationGetVatAmountResponse {

    @XmlElement(name = "Quotation_GetVatAmountResult", required = true)
    protected BigDecimal quotationGetVatAmountResult;

    /**
     * Gets the value of the quotationGetVatAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotationGetVatAmountResult() {
        return quotationGetVatAmountResult;
    }

    /**
     * Sets the value of the quotationGetVatAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotationGetVatAmountResult(BigDecimal value) {
        this.quotationGetVatAmountResult = value;
    }

}
