
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
 *         &lt;element name="CurrentInvoice_GetTermOfPaymentResult" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
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
    "currentInvoiceGetTermOfPaymentResult"
})
@XmlRootElement(name = "CurrentInvoice_GetTermOfPaymentResponse")
public class CurrentInvoiceGetTermOfPaymentResponse {

    @XmlElement(name = "CurrentInvoice_GetTermOfPaymentResult")
    protected TermOfPaymentHandle currentInvoiceGetTermOfPaymentResult;

    /**
     * Gets the value of the currentInvoiceGetTermOfPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public TermOfPaymentHandle getCurrentInvoiceGetTermOfPaymentResult() {
        return currentInvoiceGetTermOfPaymentResult;
    }

    /**
     * Sets the value of the currentInvoiceGetTermOfPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public void setCurrentInvoiceGetTermOfPaymentResult(TermOfPaymentHandle value) {
        this.currentInvoiceGetTermOfPaymentResult = value;
    }

}
