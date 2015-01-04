
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
 *         &lt;element name="InvoiceLine_GetUnitNetPriceResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "invoiceLineGetUnitNetPriceResult"
})
@XmlRootElement(name = "InvoiceLine_GetUnitNetPriceResponse")
public class InvoiceLineGetUnitNetPriceResponse {

    @XmlElement(name = "InvoiceLine_GetUnitNetPriceResult", required = true)
    protected BigDecimal invoiceLineGetUnitNetPriceResult;

    /**
     * Gets the value of the invoiceLineGetUnitNetPriceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceLineGetUnitNetPriceResult() {
        return invoiceLineGetUnitNetPriceResult;
    }

    /**
     * Sets the value of the invoiceLineGetUnitNetPriceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceLineGetUnitNetPriceResult(BigDecimal value) {
        this.invoiceLineGetUnitNetPriceResult = value;
    }

}
