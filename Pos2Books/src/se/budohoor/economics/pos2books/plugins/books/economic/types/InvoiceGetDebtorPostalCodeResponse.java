
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
 *         &lt;element name="Invoice_GetDebtorPostalCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "invoiceGetDebtorPostalCodeResult"
})
@XmlRootElement(name = "Invoice_GetDebtorPostalCodeResponse")
public class InvoiceGetDebtorPostalCodeResponse {

    @XmlElement(name = "Invoice_GetDebtorPostalCodeResult")
    protected String invoiceGetDebtorPostalCodeResult;

    /**
     * Gets the value of the invoiceGetDebtorPostalCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceGetDebtorPostalCodeResult() {
        return invoiceGetDebtorPostalCodeResult;
    }

    /**
     * Sets the value of the invoiceGetDebtorPostalCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceGetDebtorPostalCodeResult(String value) {
        this.invoiceGetDebtorPostalCodeResult = value;
    }

}
