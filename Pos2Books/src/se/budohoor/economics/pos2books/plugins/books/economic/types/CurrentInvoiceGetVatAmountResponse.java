
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
 *         &lt;element name="CurrentInvoice_GetVatAmountResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "currentInvoiceGetVatAmountResult"
})
@XmlRootElement(name = "CurrentInvoice_GetVatAmountResponse")
public class CurrentInvoiceGetVatAmountResponse {

    @XmlElement(name = "CurrentInvoice_GetVatAmountResult", required = true)
    protected BigDecimal currentInvoiceGetVatAmountResult;

    /**
     * Gets the value of the currentInvoiceGetVatAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentInvoiceGetVatAmountResult() {
        return currentInvoiceGetVatAmountResult;
    }

    /**
     * Sets the value of the currentInvoiceGetVatAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentInvoiceGetVatAmountResult(BigDecimal value) {
        this.currentInvoiceGetVatAmountResult = value;
    }

}
