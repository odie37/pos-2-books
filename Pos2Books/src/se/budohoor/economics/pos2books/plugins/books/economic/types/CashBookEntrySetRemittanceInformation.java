
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="cashBookEntryHandle" type="{http://e-conomic.com}CashBookEntryHandle" minOccurs="0"/>
 *         &lt;element name="bankPaymentTypeHandle" type="{http://e-conomic.com}BankPaymentTypeHandle" minOccurs="0"/>
 *         &lt;element name="bankPaymentCreditorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankPaymentCreditorInvoiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cashBookEntryHandle",
    "bankPaymentTypeHandle",
    "bankPaymentCreditorId",
    "bankPaymentCreditorInvoiceId"
})
@XmlRootElement(name = "CashBookEntry_SetRemittanceInformation")
public class CashBookEntrySetRemittanceInformation {

    protected CashBookEntryHandle cashBookEntryHandle;
    protected BankPaymentTypeHandle bankPaymentTypeHandle;
    protected String bankPaymentCreditorId;
    protected String bankPaymentCreditorInvoiceId;

    /**
     * Gets the value of the cashBookEntryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public CashBookEntryHandle getCashBookEntryHandle() {
        return cashBookEntryHandle;
    }

    /**
     * Sets the value of the cashBookEntryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public void setCashBookEntryHandle(CashBookEntryHandle value) {
        this.cashBookEntryHandle = value;
    }

    /**
     * Gets the value of the bankPaymentTypeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public BankPaymentTypeHandle getBankPaymentTypeHandle() {
        return bankPaymentTypeHandle;
    }

    /**
     * Sets the value of the bankPaymentTypeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public void setBankPaymentTypeHandle(BankPaymentTypeHandle value) {
        this.bankPaymentTypeHandle = value;
    }

    /**
     * Gets the value of the bankPaymentCreditorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPaymentCreditorId() {
        return bankPaymentCreditorId;
    }

    /**
     * Sets the value of the bankPaymentCreditorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPaymentCreditorId(String value) {
        this.bankPaymentCreditorId = value;
    }

    /**
     * Gets the value of the bankPaymentCreditorInvoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPaymentCreditorInvoiceId() {
        return bankPaymentCreditorInvoiceId;
    }

    /**
     * Sets the value of the bankPaymentCreditorInvoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPaymentCreditorInvoiceId(String value) {
        this.bankPaymentCreditorInvoiceId = value;
    }

}
