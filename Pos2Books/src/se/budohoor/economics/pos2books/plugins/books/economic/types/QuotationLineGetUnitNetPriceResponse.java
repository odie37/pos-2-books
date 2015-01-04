
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
 *         &lt;element name="QuotationLine_GetUnitNetPriceResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "quotationLineGetUnitNetPriceResult"
})
@XmlRootElement(name = "QuotationLine_GetUnitNetPriceResponse")
public class QuotationLineGetUnitNetPriceResponse {

    @XmlElement(name = "QuotationLine_GetUnitNetPriceResult", required = true, nillable = true)
    protected BigDecimal quotationLineGetUnitNetPriceResult;

    /**
     * Gets the value of the quotationLineGetUnitNetPriceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotationLineGetUnitNetPriceResult() {
        return quotationLineGetUnitNetPriceResult;
    }

    /**
     * Sets the value of the quotationLineGetUnitNetPriceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotationLineGetUnitNetPriceResult(BigDecimal value) {
        this.quotationLineGetUnitNetPriceResult = value;
    }

}
