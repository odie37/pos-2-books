
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QuotationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}QuotationHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DebtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DebtorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebtorAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebtorPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebtorCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebtorCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebtorEan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicEntryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttentionHandle" type="{http://e-conomic.com}DebtorContactHandle" minOccurs="0"/>
 *         &lt;element name="YourReferenceHandle" type="{http://e-conomic.com}DebtorContactHandle" minOccurs="0"/>
 *         &lt;element name="OurReferenceHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="OurReference2Handle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TermOfPaymentHandle" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CurrencyHandle" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IsVatIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LayoutHandle" type="{http://e-conomic.com}TemplateCollectionHandle" minOccurs="0"/>
 *         &lt;element name="DeliveryLocationHandle" type="{http://e-conomic.com}DeliveryLocationHandle" minOccurs="0"/>
 *         &lt;element name="DeliveryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsOfDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Heading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsArchived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GrossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MarginAsPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RoundingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DebtorCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotationData", propOrder = {
    "handle",
    "id",
    "debtorHandle",
    "number",
    "debtorName",
    "debtorAddress",
    "debtorPostalCode",
    "debtorCity",
    "debtorCountry",
    "debtorEan",
    "publicEntryNumber",
    "attentionHandle",
    "yourReferenceHandle",
    "ourReferenceHandle",
    "ourReference2Handle",
    "date",
    "termOfPaymentHandle",
    "dueDate",
    "currencyHandle",
    "exchangeRate",
    "isVatIncluded",
    "layoutHandle",
    "deliveryLocationHandle",
    "deliveryAddress",
    "deliveryPostalCode",
    "deliveryCity",
    "deliveryCountry",
    "termsOfDelivery",
    "deliveryDate",
    "heading",
    "textLine1",
    "textLine2",
    "otherReference",
    "isArchived",
    "isSent",
    "netAmount",
    "vatAmount",
    "grossAmount",
    "margin",
    "marginAsPercent",
    "roundingAmount",
    "debtorCounty",
    "deliveryCounty"
})
public class QuotationData {

    @XmlElement(name = "Handle")
    protected QuotationHandle handle;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "DebtorHandle")
    protected DebtorHandle debtorHandle;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "DebtorName")
    protected String debtorName;
    @XmlElement(name = "DebtorAddress")
    protected String debtorAddress;
    @XmlElement(name = "DebtorPostalCode")
    protected String debtorPostalCode;
    @XmlElement(name = "DebtorCity")
    protected String debtorCity;
    @XmlElement(name = "DebtorCountry")
    protected String debtorCountry;
    @XmlElement(name = "DebtorEan")
    protected String debtorEan;
    @XmlElement(name = "PublicEntryNumber")
    protected String publicEntryNumber;
    @XmlElement(name = "AttentionHandle")
    protected DebtorContactHandle attentionHandle;
    @XmlElement(name = "YourReferenceHandle")
    protected DebtorContactHandle yourReferenceHandle;
    @XmlElement(name = "OurReferenceHandle")
    protected EmployeeHandle ourReferenceHandle;
    @XmlElement(name = "OurReference2Handle")
    protected EmployeeHandle ourReference2Handle;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "TermOfPaymentHandle")
    protected TermOfPaymentHandle termOfPaymentHandle;
    @XmlElement(name = "DueDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "CurrencyHandle")
    protected CurrencyHandle currencyHandle;
    @XmlElement(name = "ExchangeRate", required = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "IsVatIncluded")
    protected boolean isVatIncluded;
    @XmlElement(name = "LayoutHandle")
    protected TemplateCollectionHandle layoutHandle;
    @XmlElement(name = "DeliveryLocationHandle")
    protected DeliveryLocationHandle deliveryLocationHandle;
    @XmlElement(name = "DeliveryAddress")
    protected String deliveryAddress;
    @XmlElement(name = "DeliveryPostalCode")
    protected String deliveryPostalCode;
    @XmlElement(name = "DeliveryCity")
    protected String deliveryCity;
    @XmlElement(name = "DeliveryCountry")
    protected String deliveryCountry;
    @XmlElement(name = "TermsOfDelivery")
    protected String termsOfDelivery;
    @XmlElement(name = "DeliveryDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "Heading")
    protected String heading;
    @XmlElement(name = "TextLine1")
    protected String textLine1;
    @XmlElement(name = "TextLine2")
    protected String textLine2;
    @XmlElement(name = "OtherReference")
    protected String otherReference;
    @XmlElement(name = "IsArchived")
    protected boolean isArchived;
    @XmlElement(name = "IsSent")
    protected boolean isSent;
    @XmlElement(name = "NetAmount", required = true)
    protected BigDecimal netAmount;
    @XmlElement(name = "VatAmount", required = true)
    protected BigDecimal vatAmount;
    @XmlElement(name = "GrossAmount", required = true)
    protected BigDecimal grossAmount;
    @XmlElement(name = "Margin", required = true)
    protected BigDecimal margin;
    @XmlElement(name = "MarginAsPercent", required = true)
    protected BigDecimal marginAsPercent;
    @XmlElement(name = "RoundingAmount", required = true)
    protected BigDecimal roundingAmount;
    @XmlElement(name = "DebtorCounty")
    protected String debtorCounty;
    @XmlElement(name = "DeliveryCounty")
    protected String deliveryCounty;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationHandle }
     *     
     */
    public QuotationHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationHandle }
     *     
     */
    public void setHandle(QuotationHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the debtorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorName() {
        return debtorName;
    }

    /**
     * Sets the value of the debtorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorName(String value) {
        this.debtorName = value;
    }

    /**
     * Gets the value of the debtorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorAddress() {
        return debtorAddress;
    }

    /**
     * Sets the value of the debtorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorAddress(String value) {
        this.debtorAddress = value;
    }

    /**
     * Gets the value of the debtorPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorPostalCode() {
        return debtorPostalCode;
    }

    /**
     * Sets the value of the debtorPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorPostalCode(String value) {
        this.debtorPostalCode = value;
    }

    /**
     * Gets the value of the debtorCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorCity() {
        return debtorCity;
    }

    /**
     * Sets the value of the debtorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorCity(String value) {
        this.debtorCity = value;
    }

    /**
     * Gets the value of the debtorCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorCountry() {
        return debtorCountry;
    }

    /**
     * Sets the value of the debtorCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorCountry(String value) {
        this.debtorCountry = value;
    }

    /**
     * Gets the value of the debtorEan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorEan() {
        return debtorEan;
    }

    /**
     * Sets the value of the debtorEan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorEan(String value) {
        this.debtorEan = value;
    }

    /**
     * Gets the value of the publicEntryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicEntryNumber() {
        return publicEntryNumber;
    }

    /**
     * Sets the value of the publicEntryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicEntryNumber(String value) {
        this.publicEntryNumber = value;
    }

    /**
     * Gets the value of the attentionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorContactHandle }
     *     
     */
    public DebtorContactHandle getAttentionHandle() {
        return attentionHandle;
    }

    /**
     * Sets the value of the attentionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorContactHandle }
     *     
     */
    public void setAttentionHandle(DebtorContactHandle value) {
        this.attentionHandle = value;
    }

    /**
     * Gets the value of the yourReferenceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorContactHandle }
     *     
     */
    public DebtorContactHandle getYourReferenceHandle() {
        return yourReferenceHandle;
    }

    /**
     * Sets the value of the yourReferenceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorContactHandle }
     *     
     */
    public void setYourReferenceHandle(DebtorContactHandle value) {
        this.yourReferenceHandle = value;
    }

    /**
     * Gets the value of the ourReferenceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getOurReferenceHandle() {
        return ourReferenceHandle;
    }

    /**
     * Sets the value of the ourReferenceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setOurReferenceHandle(EmployeeHandle value) {
        this.ourReferenceHandle = value;
    }

    /**
     * Gets the value of the ourReference2Handle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getOurReference2Handle() {
        return ourReference2Handle;
    }

    /**
     * Sets the value of the ourReference2Handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setOurReference2Handle(EmployeeHandle value) {
        this.ourReference2Handle = value;
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
     * Gets the value of the termOfPaymentHandle property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public TermOfPaymentHandle getTermOfPaymentHandle() {
        return termOfPaymentHandle;
    }

    /**
     * Sets the value of the termOfPaymentHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public void setTermOfPaymentHandle(TermOfPaymentHandle value) {
        this.termOfPaymentHandle = value;
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
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the isVatIncluded property.
     * 
     */
    public boolean isIsVatIncluded() {
        return isVatIncluded;
    }

    /**
     * Sets the value of the isVatIncluded property.
     * 
     */
    public void setIsVatIncluded(boolean value) {
        this.isVatIncluded = value;
    }

    /**
     * Gets the value of the layoutHandle property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public TemplateCollectionHandle getLayoutHandle() {
        return layoutHandle;
    }

    /**
     * Sets the value of the layoutHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public void setLayoutHandle(TemplateCollectionHandle value) {
        this.layoutHandle = value;
    }

    /**
     * Gets the value of the deliveryLocationHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryLocationHandle }
     *     
     */
    public DeliveryLocationHandle getDeliveryLocationHandle() {
        return deliveryLocationHandle;
    }

    /**
     * Sets the value of the deliveryLocationHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryLocationHandle }
     *     
     */
    public void setDeliveryLocationHandle(DeliveryLocationHandle value) {
        this.deliveryLocationHandle = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAddress(String value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPostalCode() {
        return deliveryPostalCode;
    }

    /**
     * Sets the value of the deliveryPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPostalCode(String value) {
        this.deliveryPostalCode = value;
    }

    /**
     * Gets the value of the deliveryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCity() {
        return deliveryCity;
    }

    /**
     * Sets the value of the deliveryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCity(String value) {
        this.deliveryCity = value;
    }

    /**
     * Gets the value of the deliveryCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    /**
     * Sets the value of the deliveryCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCountry(String value) {
        this.deliveryCountry = value;
    }

    /**
     * Gets the value of the termsOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfDelivery() {
        return termsOfDelivery;
    }

    /**
     * Sets the value of the termsOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfDelivery(String value) {
        this.termsOfDelivery = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeading(String value) {
        this.heading = value;
    }

    /**
     * Gets the value of the textLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLine1() {
        return textLine1;
    }

    /**
     * Sets the value of the textLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLine1(String value) {
        this.textLine1 = value;
    }

    /**
     * Gets the value of the textLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLine2() {
        return textLine2;
    }

    /**
     * Sets the value of the textLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLine2(String value) {
        this.textLine2 = value;
    }

    /**
     * Gets the value of the otherReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherReference() {
        return otherReference;
    }

    /**
     * Sets the value of the otherReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherReference(String value) {
        this.otherReference = value;
    }

    /**
     * Gets the value of the isArchived property.
     * 
     */
    public boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     */
    public void setIsArchived(boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the isSent property.
     * 
     */
    public boolean isIsSent() {
        return isSent;
    }

    /**
     * Sets the value of the isSent property.
     * 
     */
    public void setIsSent(boolean value) {
        this.isSent = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the vatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatAmount() {
        return vatAmount;
    }

    /**
     * Sets the value of the vatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatAmount(BigDecimal value) {
        this.vatAmount = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmount(BigDecimal value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargin() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMargin(BigDecimal value) {
        this.margin = value;
    }

    /**
     * Gets the value of the marginAsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarginAsPercent() {
        return marginAsPercent;
    }

    /**
     * Sets the value of the marginAsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarginAsPercent(BigDecimal value) {
        this.marginAsPercent = value;
    }

    /**
     * Gets the value of the roundingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundingAmount() {
        return roundingAmount;
    }

    /**
     * Sets the value of the roundingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundingAmount(BigDecimal value) {
        this.roundingAmount = value;
    }

    /**
     * Gets the value of the debtorCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorCounty() {
        return debtorCounty;
    }

    /**
     * Sets the value of the debtorCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorCounty(String value) {
        this.debtorCounty = value;
    }

    /**
     * Gets the value of the deliveryCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCounty() {
        return deliveryCounty;
    }

    /**
     * Sets the value of the deliveryCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCounty(String value) {
        this.deliveryCounty = value;
    }

}
