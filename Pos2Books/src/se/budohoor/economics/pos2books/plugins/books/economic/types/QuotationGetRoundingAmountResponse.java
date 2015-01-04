
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
 *         &lt;element name="Quotation_GetRoundingAmountResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "quotationGetRoundingAmountResult"
})
@XmlRootElement(name = "Quotation_GetRoundingAmountResponse")
public class QuotationGetRoundingAmountResponse {

    @XmlElement(name = "Quotation_GetRoundingAmountResult", required = true)
    protected BigDecimal quotationGetRoundingAmountResult;

    /**
     * Gets the value of the quotationGetRoundingAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotationGetRoundingAmountResult() {
        return quotationGetRoundingAmountResult;
    }

    /**
     * Sets the value of the quotationGetRoundingAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotationGetRoundingAmountResult(BigDecimal value) {
        this.quotationGetRoundingAmountResult = value;
    }

}
