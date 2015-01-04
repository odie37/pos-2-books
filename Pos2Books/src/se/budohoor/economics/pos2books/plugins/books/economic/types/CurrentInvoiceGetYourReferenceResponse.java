
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
 *         &lt;element name="CurrentInvoice_GetYourReferenceResult" type="{http://e-conomic.com}DebtorContactHandle" minOccurs="0"/>
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
    "currentInvoiceGetYourReferenceResult"
})
@XmlRootElement(name = "CurrentInvoice_GetYourReferenceResponse")
public class CurrentInvoiceGetYourReferenceResponse {

    @XmlElement(name = "CurrentInvoice_GetYourReferenceResult")
    protected DebtorContactHandle currentInvoiceGetYourReferenceResult;

    /**
     * Gets the value of the currentInvoiceGetYourReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorContactHandle }
     *     
     */
    public DebtorContactHandle getCurrentInvoiceGetYourReferenceResult() {
        return currentInvoiceGetYourReferenceResult;
    }

    /**
     * Sets the value of the currentInvoiceGetYourReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorContactHandle }
     *     
     */
    public void setCurrentInvoiceGetYourReferenceResult(DebtorContactHandle value) {
        this.currentInvoiceGetYourReferenceResult = value;
    }

}
