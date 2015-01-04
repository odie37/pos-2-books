
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
 *         &lt;element name="CurrentInvoice_GetDebtorResult" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
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
    "currentInvoiceGetDebtorResult"
})
@XmlRootElement(name = "CurrentInvoice_GetDebtorResponse")
public class CurrentInvoiceGetDebtorResponse {

    @XmlElement(name = "CurrentInvoice_GetDebtorResult")
    protected DebtorHandle currentInvoiceGetDebtorResult;

    /**
     * Gets the value of the currentInvoiceGetDebtorResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getCurrentInvoiceGetDebtorResult() {
        return currentInvoiceGetDebtorResult;
    }

    /**
     * Sets the value of the currentInvoiceGetDebtorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setCurrentInvoiceGetDebtorResult(DebtorHandle value) {
        this.currentInvoiceGetDebtorResult = value;
    }

}
