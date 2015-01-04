
package se.budohoor.economics.pos2books.plugins.books.economic.types;

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
 *         &lt;element name="InvoiceLine_GetDistributionKeyResult" type="{http://e-conomic.com}DistributionKeyHandle" minOccurs="0"/>
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
    "invoiceLineGetDistributionKeyResult"
})
@XmlRootElement(name = "InvoiceLine_GetDistributionKeyResponse")
public class InvoiceLineGetDistributionKeyResponse {

    @XmlElement(name = "InvoiceLine_GetDistributionKeyResult")
    protected DistributionKeyHandle invoiceLineGetDistributionKeyResult;

    /**
     * Gets the value of the invoiceLineGetDistributionKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public DistributionKeyHandle getInvoiceLineGetDistributionKeyResult() {
        return invoiceLineGetDistributionKeyResult;
    }

    /**
     * Sets the value of the invoiceLineGetDistributionKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public void setInvoiceLineGetDistributionKeyResult(DistributionKeyHandle value) {
        this.invoiceLineGetDistributionKeyResult = value;
    }

}
