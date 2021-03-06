
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
 *         &lt;element name="CurrentSupplierInvoiceLine_GetQuantityResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "currentSupplierInvoiceLineGetQuantityResult"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_GetQuantityResponse")
public class CurrentSupplierInvoiceLineGetQuantityResponse {

    @XmlElement(name = "CurrentSupplierInvoiceLine_GetQuantityResult", required = true, nillable = true)
    protected BigDecimal currentSupplierInvoiceLineGetQuantityResult;

    /**
     * Gets the value of the currentSupplierInvoiceLineGetQuantityResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentSupplierInvoiceLineGetQuantityResult() {
        return currentSupplierInvoiceLineGetQuantityResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceLineGetQuantityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentSupplierInvoiceLineGetQuantityResult(BigDecimal value) {
        this.currentSupplierInvoiceLineGetQuantityResult = value;
    }

}
