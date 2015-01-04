
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
 *         &lt;element name="TermOfPayment_GetDistributionInPercentResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "termOfPaymentGetDistributionInPercentResult"
})
@XmlRootElement(name = "TermOfPayment_GetDistributionInPercentResponse")
public class TermOfPaymentGetDistributionInPercentResponse {

    @XmlElement(name = "TermOfPayment_GetDistributionInPercentResult", required = true, nillable = true)
    protected BigDecimal termOfPaymentGetDistributionInPercentResult;

    /**
     * Gets the value of the termOfPaymentGetDistributionInPercentResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTermOfPaymentGetDistributionInPercentResult() {
        return termOfPaymentGetDistributionInPercentResult;
    }

    /**
     * Sets the value of the termOfPaymentGetDistributionInPercentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTermOfPaymentGetDistributionInPercentResult(BigDecimal value) {
        this.termOfPaymentGetDistributionInPercentResult = value;
    }

}
