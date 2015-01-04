
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
 *         &lt;element name="CashBookEntry_CreateCreditorInvoiceResult" type="{http://e-conomic.com}CashBookEntryHandle" minOccurs="0"/>
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
    "cashBookEntryCreateCreditorInvoiceResult"
})
@XmlRootElement(name = "CashBookEntry_CreateCreditorInvoiceResponse")
public class CashBookEntryCreateCreditorInvoiceResponse {

    @XmlElement(name = "CashBookEntry_CreateCreditorInvoiceResult")
    protected CashBookEntryHandle cashBookEntryCreateCreditorInvoiceResult;

    /**
     * Gets the value of the cashBookEntryCreateCreditorInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public CashBookEntryHandle getCashBookEntryCreateCreditorInvoiceResult() {
        return cashBookEntryCreateCreditorInvoiceResult;
    }

    /**
     * Sets the value of the cashBookEntryCreateCreditorInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public void setCashBookEntryCreateCreditorInvoiceResult(CashBookEntryHandle value) {
        this.cashBookEntryCreateCreditorInvoiceResult = value;
    }

}
