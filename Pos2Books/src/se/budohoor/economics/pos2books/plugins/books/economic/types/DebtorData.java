
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebtorGroupHandle" type="{http://e-conomic.com}DebtorGroupHandle" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatZone" type="{http://e-conomic.com}VatZone"/>
 *         &lt;element name="ExtendedVatZone" type="{http://e-conomic.com}ExtendedVatZoneHandle" minOccurs="0"/>
 *         &lt;element name="CurrencyHandle" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
 *         &lt;element name="PriceGroupHandle" type="{http://e-conomic.com}PriceGroupHandle" minOccurs="0"/>
 *         &lt;element name="IsAccessible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Ean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicEntryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneAndFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditMaximum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CINumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermOfPaymentHandle" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
 *         &lt;element name="LayoutHandle" type="{http://e-conomic.com}TemplateCollectionHandle" minOccurs="0"/>
 *         &lt;element name="AttentionHandle" type="{http://e-conomic.com}DebtorContactHandle" minOccurs="0"/>
 *         &lt;element name="YourReferenceHandle" type="{http://e-conomic.com}DebtorContactHandle" minOccurs="0"/>
 *         &lt;element name="OurReferenceHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorData", propOrder = {
    "handle",
    "number",
    "debtorGroupHandle",
    "name",
    "vatZone",
    "extendedVatZone",
    "currencyHandle",
    "priceGroupHandle",
    "isAccessible",
    "ean",
    "publicEntryNumber",
    "email",
    "telephoneAndFaxNumber",
    "website",
    "address",
    "postalCode",
    "city",
    "country",
    "creditMaximum",
    "vatNumber",
    "county",
    "ciNumber",
    "termOfPaymentHandle",
    "layoutHandle",
    "attentionHandle",
    "yourReferenceHandle",
    "ourReferenceHandle",
    "balance"
})
public class DebtorData {

    @XmlElement(name = "Handle")
    protected DebtorHandle handle;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "DebtorGroupHandle")
    protected DebtorGroupHandle debtorGroupHandle;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "VatZone", required = true)
    protected VatZone vatZone;
    @XmlElement(name = "ExtendedVatZone")
    protected ExtendedVatZoneHandle extendedVatZone;
    @XmlElement(name = "CurrencyHandle")
    protected CurrencyHandle currencyHandle;
    @XmlElement(name = "PriceGroupHandle")
    protected PriceGroupHandle priceGroupHandle;
    @XmlElement(name = "IsAccessible")
    protected boolean isAccessible;
    @XmlElement(name = "Ean")
    protected String ean;
    @XmlElement(name = "PublicEntryNumber")
    protected String publicEntryNumber;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "TelephoneAndFaxNumber")
    protected String telephoneAndFaxNumber;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElementRef(name = "CreditMaximum", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> creditMaximum;
    @XmlElement(name = "VatNumber")
    protected String vatNumber;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "CINumber")
    protected String ciNumber;
    @XmlElement(name = "TermOfPaymentHandle")
    protected TermOfPaymentHandle termOfPaymentHandle;
    @XmlElement(name = "LayoutHandle")
    protected TemplateCollectionHandle layoutHandle;
    @XmlElement(name = "AttentionHandle")
    protected DebtorContactHandle attentionHandle;
    @XmlElement(name = "YourReferenceHandle")
    protected DebtorContactHandle yourReferenceHandle;
    @XmlElement(name = "OurReferenceHandle")
    protected EmployeeHandle ourReferenceHandle;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setHandle(DebtorHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the debtorGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public DebtorGroupHandle getDebtorGroupHandle() {
        return debtorGroupHandle;
    }

    /**
     * Sets the value of the debtorGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public void setDebtorGroupHandle(DebtorGroupHandle value) {
        this.debtorGroupHandle = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vatZone property.
     * 
     * @return
     *     possible object is
     *     {@link VatZone }
     *     
     */
    public VatZone getVatZone() {
        return vatZone;
    }

    /**
     * Sets the value of the vatZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatZone }
     *     
     */
    public void setVatZone(VatZone value) {
        this.vatZone = value;
    }

    /**
     * Gets the value of the extendedVatZone property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public ExtendedVatZoneHandle getExtendedVatZone() {
        return extendedVatZone;
    }

    /**
     * Sets the value of the extendedVatZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public void setExtendedVatZone(ExtendedVatZoneHandle value) {
        this.extendedVatZone = value;
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
     * Gets the value of the priceGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupHandle }
     *     
     */
    public PriceGroupHandle getPriceGroupHandle() {
        return priceGroupHandle;
    }

    /**
     * Sets the value of the priceGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupHandle }
     *     
     */
    public void setPriceGroupHandle(PriceGroupHandle value) {
        this.priceGroupHandle = value;
    }

    /**
     * Gets the value of the isAccessible property.
     * 
     */
    public boolean isIsAccessible() {
        return isAccessible;
    }

    /**
     * Sets the value of the isAccessible property.
     * 
     */
    public void setIsAccessible(boolean value) {
        this.isAccessible = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEan() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEan(String value) {
        this.ean = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephoneAndFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneAndFaxNumber() {
        return telephoneAndFaxNumber;
    }

    /**
     * Sets the value of the telephoneAndFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneAndFaxNumber(String value) {
        this.telephoneAndFaxNumber = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the creditMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreditMaximum() {
        return creditMaximum;
    }

    /**
     * Sets the value of the creditMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreditMaximum(JAXBElement<BigDecimal> value) {
        this.creditMaximum = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the ciNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCINumber() {
        return ciNumber;
    }

    /**
     * Sets the value of the ciNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCINumber(String value) {
        this.ciNumber = value;
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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

}
