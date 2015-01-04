
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EntryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}EntryHandle" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AmountDefaultCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyHandle" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://e-conomic.com}EntryType"/>
 *         &lt;element name="DepartmentHandle" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
 *         &lt;element name="DistributionKeyHandle" type="{http://e-conomic.com}DistributionKeyHandle" minOccurs="0"/>
 *         &lt;element name="VatAccountHandle" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProjectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="DocumentHandle" type="{http://e-conomic.com}ScannedDocumentHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryData", propOrder = {
    "handle",
    "serialNumber",
    "accountHandle",
    "amount",
    "amountDefaultCurrency",
    "currencyHandle",
    "date",
    "text",
    "type",
    "departmentHandle",
    "distributionKeyHandle",
    "vatAccountHandle",
    "voucherNumber",
    "projectHandle",
    "documentHandle"
})
public class EntryData {

    @XmlElement(name = "Handle")
    protected EntryHandle handle;
    @XmlElement(name = "SerialNumber")
    protected int serialNumber;
    @XmlElement(name = "AccountHandle")
    protected AccountHandle accountHandle;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "AmountDefaultCurrency", required = true)
    protected BigDecimal amountDefaultCurrency;
    @XmlElement(name = "CurrencyHandle")
    protected CurrencyHandle currencyHandle;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Type", required = true)
    protected EntryType type;
    @XmlElement(name = "DepartmentHandle")
    protected DepartmentHandle departmentHandle;
    @XmlElement(name = "DistributionKeyHandle")
    protected DistributionKeyHandle distributionKeyHandle;
    @XmlElement(name = "VatAccountHandle")
    protected VatAccountHandle vatAccountHandle;
    @XmlElement(name = "VoucherNumber")
    protected int voucherNumber;
    @XmlElement(name = "ProjectHandle")
    protected ProjectHandle projectHandle;
    @XmlElement(name = "DocumentHandle")
    protected ScannedDocumentHandle documentHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link EntryHandle }
     *     
     */
    public EntryHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryHandle }
     *     
     */
    public void setHandle(EntryHandle value) {
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
     * Gets the value of the documentHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public ScannedDocumentHandle getDocumentHandle() {
        return documentHandle;
    }

    /**
     * Sets the value of the documentHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public void setDocumentHandle(ScannedDocumentHandle value) {
        this.documentHandle = value;
    }

}
