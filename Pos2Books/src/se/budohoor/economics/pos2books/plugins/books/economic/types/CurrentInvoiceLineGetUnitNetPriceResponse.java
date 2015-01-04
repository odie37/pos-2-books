
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
 *         &lt;element name="CurrentInvoiceLine_GetUnitNetPriceResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "currentInvoiceLineGetUnitNetPriceResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetUnitNetPriceResponse")
public class CurrentInvoiceLineGetUnitNetPriceResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetUnitNetPriceResult", required = true, nillable = true)
    protected BigDecimal currentInvoiceLineGetUnitNetPriceResult;

    /**
     * Gets the value of the currentInvoiceLineGetUnitNetPriceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentInvoiceLineGetUnitNetPriceResult() {
        return currentInvoiceLineGetUnitNetPriceResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetUnitNetPriceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentInvoiceLineGetUnitNetPriceResult(BigDecimal value) {
        this.currentInvoiceLineGetUnitNetPriceResult = value;
    }

}
