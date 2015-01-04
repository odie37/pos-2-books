
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
 *         &lt;element name="TermOfPayment_GetDistributionInPercent2Result" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "termOfPaymentGetDistributionInPercent2Result"
})
@XmlRootElement(name = "TermOfPayment_GetDistributionInPercent2Response")
public class TermOfPaymentGetDistributionInPercent2Response {

    @XmlElement(name = "TermOfPayment_GetDistributionInPercent2Result", required = true, nillable = true)
    protected BigDecimal termOfPaymentGetDistributionInPercent2Result;

    /**
     * Gets the value of the termOfPaymentGetDistributionInPercent2Result property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTermOfPaymentGetDistributionInPercent2Result() {
        return termOfPaymentGetDistributionInPercent2Result;
    }

    /**
     * Sets the value of the termOfPaymentGetDistributionInPercent2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTermOfPaymentGetDistributionInPercent2Result(BigDecimal value) {
        this.termOfPaymentGetDistributionInPercent2Result = value;
    }

}
