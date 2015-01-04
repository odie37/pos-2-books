
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
 *         &lt;element name="CurrentInvoiceLine_GetTotalNetAmountResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "currentInvoiceLineGetTotalNetAmountResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetTotalNetAmountResponse")
public class CurrentInvoiceLineGetTotalNetAmountResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetTotalNetAmountResult", required = true, nillable = true)
    protected BigDecimal currentInvoiceLineGetTotalNetAmountResult;

    /**
     * Gets the value of the currentInvoiceLineGetTotalNetAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentInvoiceLineGetTotalNetAmountResult() {
        return currentInvoiceLineGetTotalNetAmountResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetTotalNetAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentInvoiceLineGetTotalNetAmountResult(BigDecimal value) {
        this.currentInvoiceLineGetTotalNetAmountResult = value;
    }

}
