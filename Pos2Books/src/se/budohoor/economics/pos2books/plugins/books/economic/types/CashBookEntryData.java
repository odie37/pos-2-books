
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CashBookEntryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashBookEntryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}CashBookEntryHandle" minOccurs="0"/>
 *         &lt;element name="Id1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://e-conomic.com}CashBookEntryType"/>
 *         &lt;element name="CashBookHandle" type="{http://e-conomic.com}CashBookHandle" minOccurs="0"/>
 *         &lt;element name="DebtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="CreditorHandle" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
 *         &lt;element name="AccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="ContraAccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountDefaultCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyHandle" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VatAccountHandle" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
 *         &lt;element name="ContraVatAccountHandle" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
 *         &lt;element name="DebtorInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditorInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepartmentHandle" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
 *         &lt;element name="DistributionKeyHandle" type="{http://e-conomic.com}DistributionKeyHandle" minOccurs="0"/>
 *         &lt;element name="ProjectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="CostTypeHandle" type="{http://e-conomic.com}CostTypeHandle" minOccurs="0"/>
 *         &lt;element name="BankPaymentTypeHandle" type="{http://e-conomic.com}BankPaymentTypeHandle" minOccurs="0"/>
 *         &lt;element name="BankPaymentCreditorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankPaymentCreditorInvoiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapitaliseHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmployeeHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBookEntryData", propOrder = {
    "handle",
    "id1",
    "id2",
    "type",
    "cashBookHandle",
    "debtorHandle",
    "creditorHandle",
    "accountHandle",
    "contraAccountHandle",
    "date",
    "voucherNumber",
    "text",
    "amountDefaultCurrency",
    "currencyHandle",
    "amount",
    "vatAccountHandle",
    "contraVatAccountHandle",
    "debtorInvoiceNumber",
    "creditorInvoiceNumber",
    "dueDate",
    "departmentHandle",
    "distributionKeyHandle",
    "projectHandle",
    "costTypeHandle",
    "bankPaymentTypeHandle",
    "bankPaymentCreditorId",
    "bankPaymentCreditorInvoiceId",
    "capitaliseHandle",
    "startDate",
    "endDate",
    "employeeHandle"
})
public class CashBookEntryData {

    @XmlElement(name = "Handle")
    protected CashBookEntryHandle handle;
    @XmlElement(name = "Id1")
    protected Integer id1;
    @XmlElement(name = "Id2")
    protected Integer id2;
    @XmlElement(name = "Type", required = true)
    protected CashBookEntryType type;
    @XmlElement(name = "CashBookHandle")
    protected CashBookHandle cashBookHandle;
    @XmlElement(name = "DebtorHandle")
    protected DebtorHandle debtorHandle;
    @XmlElement(name = "CreditorHandle")
    protected CreditorHandle creditorHandle;
    @XmlElement(name = "AccountHandle")
    protected AccountHandle accountHandle;
    @XmlElement(name = "ContraAccountHandle")
    protected AccountHandle contraAccountHandle;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
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
    @XmlElement(name = "VatAccountHandle")
    protected VatAccountHandle vatAccountHandle;
    @XmlElement(name = "ContraVatAccountHandle")
    protected VatAccountHandle contraVatAccountHandle;
    @XmlElementRef(name = "DebtorInvoiceNumber", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<Integer> debtorInvoiceNumber;
    @XmlElement(name = "CreditorInvoiceNumber")
    protected String creditorInvoiceNumber;
    @XmlElementRef(name = "DueDate", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElement(name = "DepartmentHandle")
    protected DepartmentHandle departmentHandle;
    @XmlElement(name = "DistributionKeyHandle")
    protected DistributionKeyHandle distributionKeyHandle;
    @XmlElement(name = "ProjectHandle")
    protected ProjectHandle projectHandle;
    @XmlElement(name = "CostTypeHandle")
    protected CostTypeHandle costTypeHandle;
    @XmlElement(name = "BankPaymentTypeHandle")
    protected BankPaymentTypeHandle bankPaymentTypeHandle;
    @XmlElement(name = "BankPaymentCreditorId")
    protected String bankPaymentCreditorId;
    @XmlElement(name = "BankPaymentCreditorInvoiceId")
    protected String bankPaymentCreditorInvoiceId;
    @XmlElement(name = "CapitaliseHandle")
    protected AccountHandle capitaliseHandle;
    @XmlElementRef(name = "StartDate", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "EndDate", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElement(name = "EmployeeHandle")
    protected EmployeeHandle employeeHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public CashBookEntryHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public void setHandle(CashBookEntryHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the id1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId1() {
        return id1;
    }

    /**
     * Sets the value of the id1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId1(Integer value) {
        this.id1 = value;
    }

    /**
     * Gets the value of the id2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId2(Integer value) {
        this.id2 = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookEntryType }
     *     
     */
    public CashBookEntryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookEntryType }
     *     
     */
    public void setType(CashBookEntryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the cashBookHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookHandle }
     *     
     */
    public CashBookHandle getCashBookHandle() {
        return cashBookHandle;
    }

    /**
     * Sets the value of the cashBookHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookHandle }
     *     
     */
    public void setCashBookHandle(CashBookHandle value) {
        this.cashBookHandle = value;
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
     * Gets the value of the creditorHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getCreditorHandle() {
        return creditorHandle;
    }

    /**
     * Sets the value of the creditorHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setCreditorHandle(CreditorHandle value) {
        this.creditorHandle = value;
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
     * Gets the value of the contraAccountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getContraAccountHandle() {
        return contraAccountHandle;
    }

    /**
     * Sets the value of the contraAccountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setContraAccountHandle(AccountHandle value) {
        this.contraAccountHandle = value;
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
     * Gets the value of the vatAccountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountHandle }
     *     
     */
    public VatAccountHandle getVatAccountHandle() {
        return vatAccountHandle;
    }

    /**
     * Sets the value of the vatAccountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountHandle }
     *     
     */
    public void setVatAccountHandle(VatAccountHandle value) {
        this.vatAccountHandle = value;
    }

    /**
     * Gets the value of the contraVatAccountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountHandle }
     *     
     */
    public VatAccountHandle getContraVatAccountHandle() {
        return contraVatAccountHandle;
    }

    /**
     * Sets the value of the contraVatAccountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountHandle }
     *     
     */
    public void setContraVatAccountHandle(VatAccountHandle value) {
        this.contraVatAccountHandle = value;
    }

    /**
     * Gets the value of the debtorInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDebtorInvoiceNumber() {
        return debtorInvoiceNumber;
    }

    /**
     * Sets the value of the debtorInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDebtorInvoiceNumber(JAXBElement<Integer> value) {
        this.debtorInvoiceNumber = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the creditorInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorInvoiceNumber() {
        return creditorInvoiceNumber;
    }

    /**
     * Sets the value of the creditorInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorInvoiceNumber(String value) {
        this.creditorInvoiceNumber = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the departmentHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentHandle }
     *     
     */
    public DepartmentHandle getDepartmentHandle() {
        return departmentHandle;
    }

    /**
     * Sets the value of the departmentHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentHandle }
     *     
     */
    public void setDepartmentHandle(DepartmentHandle value) {
        this.departmentHandle = value;
    }

    /**
     * Gets the value of the distributionKeyHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public DistributionKeyHandle getDistributionKeyHandle() {
        return distributionKeyHandle;
    }

    /**
     * Sets the value of the distributionKeyHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public void setDistributionKeyHandle(DistributionKeyHandle value) {
        this.distributionKeyHandle = value;
    }

    /**
     * Gets the value of the projectHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHandle }
     *     
     */
    public ProjectHandle getProjectHandle() {
        return projectHandle;
    }

    /**
     * Sets the value of the projectHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHandle }
     *     
     */
    public void setProjectHandle(ProjectHandle value) {
        this.projectHandle = value;
    }

    /**
     * Gets the value of the costTypeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeHandle }
     *     
     */
    public CostTypeHandle getCostTypeHandle() {
        return costTypeHandle;
    }

    /**
     * Sets the value of the costTypeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeHandle }
     *     
     */
    public void setCostTypeHandle(CostTypeHandle value) {
        this.costTypeHandle = value;
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

    /**
     * Gets the value of the capitaliseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getCapitaliseHandle() {
        return capitaliseHandle;
    }

    /**
     * Sets the value of the capitaliseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setCapitaliseHandle(AccountHandle value) {
        this.capitaliseHandle = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the employeeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getEmployeeHandle() {
        return employeeHandle;
    }

    /**
     * Sets the value of the employeeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setEmployeeHandle(EmployeeHandle value) {
        this.employeeHandle = value;
    }

}
