
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
 *         &lt;element name="Debtor_GetCurrentInvoicesResult" type="{http://e-conomic.com}ArrayOfCurrentInvoiceHandle" minOccurs="0"/>
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
    "debtorGetCurrentInvoicesResult"
})
@XmlRootElement(name = "Debtor_GetCurrentInvoicesResponse")
public class DebtorGetCurrentInvoicesResponse {

    @XmlElement(name = "Debtor_GetCurrentInvoicesResult")
    protected ArrayOfCurrentInvoiceHandle debtorGetCurrentInvoicesResult;

    /**
     * Gets the value of the debtorGetCurrentInvoicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentInvoiceHandle }
     *     
     */
    public ArrayOfCurrentInvoiceHandle getDebtorGetCurrentInvoicesResult() {
        return debtorGetCurrentInvoicesResult;
    }

    /**
     * Sets the value of the debtorGetCurrentInvoicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentInvoiceHandle }
     *     
     */
    public void setDebtorGetCurrentInvoicesResult(ArrayOfCurrentInvoiceHandle value) {
        this.debtorGetCurrentInvoicesResult = value;
    }

}
