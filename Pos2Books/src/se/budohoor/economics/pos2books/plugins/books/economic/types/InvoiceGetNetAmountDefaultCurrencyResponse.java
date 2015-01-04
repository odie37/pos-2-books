
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
 *         &lt;element name="Invoice_GetNetAmountDefaultCurrencyResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "invoiceGetNetAmountDefaultCurrencyResult"
})
@XmlRootElement(name = "Invoice_GetNetAmountDefaultCurrencyResponse")
public class InvoiceGetNetAmountDefaultCurrencyResponse {

    @XmlElement(name = "Invoice_GetNetAmountDefaultCurrencyResult", required = true)
    protected BigDecimal invoiceGetNetAmountDefaultCurrencyResult;

    /**
     * Gets the value of the invoiceGetNetAmountDefaultCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceGetNetAmountDefaultCurrencyResult() {
        return invoiceGetNetAmountDefaultCurrencyResult;
    }

    /**
     * Sets the value of the invoiceGetNetAmountDefaultCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceGetNetAmountDefaultCurrencyResult(BigDecimal value) {
        this.invoiceGetNetAmountDefaultCurrencyResult = value;
    }

}
