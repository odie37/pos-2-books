
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
 *         &lt;element name="DebtorEntry_FindByInvoiceNumberResult" type="{http://e-conomic.com}ArrayOfDebtorEntryHandle" minOccurs="0"/>
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
    "debtorEntryFindByInvoiceNumberResult"
})
@XmlRootElement(name = "DebtorEntry_FindByInvoiceNumberResponse")
public class DebtorEntryFindByInvoiceNumberResponse {

    @XmlElement(name = "DebtorEntry_FindByInvoiceNumberResult")
    protected ArrayOfDebtorEntryHandle debtorEntryFindByInvoiceNumberResult;

    /**
     * Gets the value of the debtorEntryFindByInvoiceNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorEntryHandle }
     *     
     */
    public ArrayOfDebtorEntryHandle getDebtorEntryFindByInvoiceNumberResult() {
        return debtorEntryFindByInvoiceNumberResult;
    }

    /**
     * Sets the value of the debtorEntryFindByInvoiceNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorEntryHandle }
     *     
     */
    public void setDebtorEntryFindByInvoiceNumberResult(ArrayOfDebtorEntryHandle value) {
        this.debtorEntryFindByInvoiceNumberResult = value;
    }

}
