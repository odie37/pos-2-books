
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
 *         &lt;element name="QuotationLine_GetMarginAsPercentResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "quotationLineGetMarginAsPercentResult"
})
@XmlRootElement(name = "QuotationLine_GetMarginAsPercentResponse")
public class QuotationLineGetMarginAsPercentResponse {

    @XmlElement(name = "QuotationLine_GetMarginAsPercentResult", required = true)
    protected BigDecimal quotationLineGetMarginAsPercentResult;

    /**
     * Gets the value of the quotationLineGetMarginAsPercentResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotationLineGetMarginAsPercentResult() {
        return quotationLineGetMarginAsPercentResult;
    }

    /**
     * Sets the value of the quotationLineGetMarginAsPercentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotationLineGetMarginAsPercentResult(BigDecimal value) {
        this.quotationLineGetMarginAsPercentResult = value;
    }

}
