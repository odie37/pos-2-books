
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DebtorEntryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtorEntryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}DebtorEntryHandle" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://e-conomic.com}EntryType"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DebtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="AccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountDefaultCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyHandle" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Remainder" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RemainderDefaultCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorEntryData", propOrder = {
    "handle",
    "serialNumber",
    "type",
    "date",
    "debtorHandle",
    "accountHandle",
    "voucherNumber",
    "text",
    "amountDefaultCurrency",
    "currencyHandle",
    "amount",
    "invoiceNumber",
    "dueDate",
    "remainder",
    "remainderDefaultCurrency"
})
public class DebtorEntryData {

    @XmlElement(name = "Handle")
    protected DebtorEntryHandle handle;
    @XmlElement(name = "SerialNumber")
    protected int serialNumber;
    @XmlElement(name = "Type", required = true)
    protected EntryType type;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DebtorHandle")
    protected DebtorHandle debtorHandle;
    @XmlElement(name = "AccountHandle")
    protected AccountHandle accountHandle;
    @XmlElement(name = "VoucherNumber")
    protected int voucherNumber;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "AmountDefaultCurrency", required = true)
    protected BigDecimal amountDefaultCurrency;
    @XmlElement(name = "CurrencyHandle")
    protected CurrencyHandle currencyHandle;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "InvoiceNumber")
    protected int invoiceNumber;
    @XmlElement(name = "DueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "Remainder", required = true)
    protected BigDecimal remainder;
    @XmlElement(name = "RemainderDefaultCurrency", required = true)
    protected BigDecimal remainderDefaultCurrency;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorEntryHandle }
     *     
     */
    public DebtorEntryHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorEntryHandle }
     *     
     */
    public void setHandle(DebtorEntryHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     */
    public void setSerialNumber(int value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntryType }
     *     
     */
    public EntryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryType }
     *     
     */
    public void setType(EntryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the debtorHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getDebtorHandle() {
        return debtorHandle;
    }

    /**
     * Sets the value of the debtorHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setDebtorHandle(DebtorHandle value) {
        this.debtorHandle = value;
    }

    /**
     * Gets the value of the accountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getAccountHandle() {
        return accountHandle;
    }

    /**
     * Sets the value of the accountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setAccountHandle(AccountHandle value) {
        this.accountHandle = value;
    }

    /**
     * Gets the value of the voucherNumber property.
     * 
     */
    public int getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Sets the value of the voucherNumber property.
     * 
     */
    public void setVoucherNumber(int value) {
        this.voucherNumber = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the amountDefaultCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountDefaultCurrency() {
        return amountDefaultCurrency;
    }

    /**
     * Sets the value of the amountDefaultCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountDefaultCurrency(BigDecimal value) {
        this.amountDefaultCurrency = value;
    }

    /**
     * Gets the value of the currencyHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getCurrencyHandle() {
        return currencyHandle;
    }

    /**
     * Sets the value of the currencyHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setCurrencyHandle(CurrencyHandle value) {
        this.currencyHandle = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     */
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     */
    public void setInvoiceNumber(int value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the remainder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainder() {
        return remainder;
    }

    /**
     * Sets the value of the remainder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainder(BigDecimal value) {
        this.remainder = value;
    }

    /**
     * Gets the value of the remainderDefaultCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderDefaultCurrency() {
        return remainderDefaultCurrency;
    }

    /**
     * Sets the value of the remainderDefaultCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderDefaultCurrency(BigDecimal value) {
        this.remainderDefaultCurrency = value;
    }

}
