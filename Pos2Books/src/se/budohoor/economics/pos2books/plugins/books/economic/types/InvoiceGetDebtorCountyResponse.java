
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
 *         &lt;element name="Invoice_GetDebtorCountyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "invoiceGetDebtorCountyResult"
})
@XmlRootElement(name = "Invoice_GetDebtorCountyResponse")
public class InvoiceGetDebtorCountyResponse {

    @XmlElement(name = "Invoice_GetDebtorCountyResult")
    protected String invoiceGetDebtorCountyResult;

    /**
     * Gets the value of the invoiceGetDebtorCountyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceGetDebtorCountyResult() {
        return invoiceGetDebtorCountyResult;
    }

    /**
     * Sets the value of the invoiceGetDebtorCountyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceGetDebtorCountyResult(String value) {
        this.invoiceGetDebtorCountyResult = value;
    }

}
