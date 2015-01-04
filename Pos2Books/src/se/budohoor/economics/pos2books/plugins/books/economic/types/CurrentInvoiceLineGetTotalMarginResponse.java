
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
 *         &lt;element name="CurrentInvoiceLine_GetTotalMarginResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "currentInvoiceLineGetTotalMarginResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetTotalMarginResponse")
public class CurrentInvoiceLineGetTotalMarginResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetTotalMarginResult", required = true)
    protected BigDecimal currentInvoiceLineGetTotalMarginResult;

    /**
     * Gets the value of the currentInvoiceLineGetTotalMarginResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentInvoiceLineGetTotalMarginResult() {
        return currentInvoiceLineGetTotalMarginResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetTotalMarginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentInvoiceLineGetTotalMarginResult(BigDecimal value) {
        this.currentInvoiceLineGetTotalMarginResult = value;
    }

}
