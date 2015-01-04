
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
 *         &lt;element name="QuotationLine_GetDiscountAsPercentResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "quotationLineGetDiscountAsPercentResult"
})
@XmlRootElement(name = "QuotationLine_GetDiscountAsPercentResponse")
public class QuotationLineGetDiscountAsPercentResponse {

    @XmlElement(name = "QuotationLine_GetDiscountAsPercentResult", required = true)
    protected BigDecimal quotationLineGetDiscountAsPercentResult;

    /**
     * Gets the value of the quotationLineGetDiscountAsPercentResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotationLineGetDiscountAsPercentResult() {
        return quotationLineGetDiscountAsPercentResult;
    }

    /**
     * Sets the value of the quotationLineGetDiscountAsPercentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotationLineGetDiscountAsPercentResult(BigDecimal value) {
        this.quotationLineGetDiscountAsPercentResult = value;
    }

}
