
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
 *         &lt;element name="Invoice_GetDeductionAmountResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "invoiceGetDeductionAmountResult"
})
@XmlRootElement(name = "Invoice_GetDeductionAmountResponse")
public class InvoiceGetDeductionAmountResponse {

    @XmlElement(name = "Invoice_GetDeductionAmountResult", required = true)
    protected BigDecimal invoiceGetDeductionAmountResult;

    /**
     * Gets the value of the invoiceGetDeductionAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceGetDeductionAmountResult() {
        return invoiceGetDeductionAmountResult;
    }

    /**
     * Sets the value of the invoiceGetDeductionAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceGetDeductionAmountResult(BigDecimal value) {
        this.invoiceGetDeductionAmountResult = value;
    }

}
