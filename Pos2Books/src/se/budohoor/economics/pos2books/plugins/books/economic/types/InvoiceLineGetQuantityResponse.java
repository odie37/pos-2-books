
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
 *         &lt;element name="InvoiceLine_GetQuantityResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "invoiceLineGetQuantityResult"
})
@XmlRootElement(name = "InvoiceLine_GetQuantityResponse")
public class InvoiceLineGetQuantityResponse {

    @XmlElement(name = "InvoiceLine_GetQuantityResult", required = true)
    protected BigDecimal invoiceLineGetQuantityResult;

    /**
     * Gets the value of the invoiceLineGetQuantityResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceLineGetQuantityResult() {
        return invoiceLineGetQuantityResult;
    }

    /**
     * Sets the value of the invoiceLineGetQuantityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceLineGetQuantityResult(BigDecimal value) {
        this.invoiceLineGetQuantityResult = value;
    }

}
