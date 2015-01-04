
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
 *         &lt;element name="CashBookEntry_GetDebtorInvoiceNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cashBookEntryGetDebtorInvoiceNumberResult"
})
@XmlRootElement(name = "CashBookEntry_GetDebtorInvoiceNumberResponse")
public class CashBookEntryGetDebtorInvoiceNumberResponse {

    @XmlElement(name = "CashBookEntry_GetDebtorInvoiceNumberResult", required = true, type = Integer.class, nillable = true)
    protected Integer cashBookEntryGetDebtorInvoiceNumberResult;

    /**
     * Gets the value of the cashBookEntryGetDebtorInvoiceNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCashBookEntryGetDebtorInvoiceNumberResult() {
        return cashBookEntryGetDebtorInvoiceNumberResult;
    }

    /**
     * Sets the value of the cashBookEntryGetDebtorInvoiceNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCashBookEntryGetDebtorInvoiceNumberResult(Integer value) {
        this.cashBookEntryGetDebtorInvoiceNumberResult = value;
    }

}
