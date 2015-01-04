
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
 *         &lt;element name="Invoice_GetDeliveryPostalCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "invoiceGetDeliveryPostalCodeResult"
})
@XmlRootElement(name = "Invoice_GetDeliveryPostalCodeResponse")
public class InvoiceGetDeliveryPostalCodeResponse {

    @XmlElement(name = "Invoice_GetDeliveryPostalCodeResult")
    protected String invoiceGetDeliveryPostalCodeResult;

    /**
     * Gets the value of the invoiceGetDeliveryPostalCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceGetDeliveryPostalCodeResult() {
        return invoiceGetDeliveryPostalCodeResult;
    }

    /**
     * Sets the value of the invoiceGetDeliveryPostalCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceGetDeliveryPostalCodeResult(String value) {
        this.invoiceGetDeliveryPostalCodeResult = value;
    }

}
