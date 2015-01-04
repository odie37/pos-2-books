
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditorGroupHandle" type="{http://e-conomic.com}CreditorGroupHandle" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatZone" type="{http://e-conomic.com}VatZone"/>
 *         &lt;element name="CurrencyHandle" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
 *         &lt;element name="TermOfPaymentHandle" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
 *         &lt;element name="IsAccessible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CINumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttentionHandle" type="{http://e-conomic.com}CreditorContactHandle" minOccurs="0"/>
 *         &lt;element name="YourReferenceHandle" type="{http://e-conomic.com}CreditorContactHandle" minOccurs="0"/>
 *         &lt;element name="OurReferenceHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="DefaultPaymentTypeHandle" type="{http://e-conomic.com}BankPaymentTypeHandle" minOccurs="0"/>
 *         &lt;element name="DefaultPaymentCreditorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoContraAccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorData", propOrder = {
    "handle",
    "number",
    "creditorGroupHandle",
    "name",
    "vatZone",
    "currencyHandle",
    "termOfPaymentHandle",
    "isAccessible",
    "ciNumber",
    "email",
    "address",
    "postalCode",
    "city",
    "country",
    "bankAccount",
    "attentionHandle",
    "yourReferenceHandle",
    "ourReferenceHandle",
    "defaultPaymentTypeHandle",
    "defaultPaymentCreditorId",
    "county",
    "autoContraAccountHandle"
})
public class CreditorData {

    @XmlElement(name = "Handle")
    protected CreditorHandle handle;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "CreditorGroupHandle")
    protected CreditorGroupHandle creditorGroupHandle;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "VatZone", required = true)
    protected VatZone vatZone;
    @XmlElement(name = "CurrencyHandle")
    protected CurrencyHandle currencyHandle;
    @XmlElement(name = "TermOfPaymentHandle")
    protected TermOfPaymentHandle termOfPaymentHandle;
    @XmlElement(name = "IsAccessible")
    protected boolean isAccessible;
    @XmlElement(name = "CINumber")
    protected String ciNumber;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "BankAccount")
    protected String bankAccount;
    @XmlElement(name = "AttentionHandle")
    protected CreditorContactHandle attentionHandle;
    @XmlElement(name = "YourReferenceHandle")
    protected CreditorContactHandle yourReferenceHandle;
    @XmlElement(name = "OurReferenceHandle")
    protected EmployeeHandle ourReferenceHandle;
    @XmlElement(name = "DefaultPaymentTypeHandle")
    protected BankPaymentTypeHandle defaultPaymentTypeHandle;
    @XmlElement(name = "DefaultPaymentCreditorId")
    protected String defaultPaymentCreditorId;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "AutoContraAccountHandle")
    protected AccountHandle autoContraAccountHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setHandle(CreditorHandle value) {
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
     * Gets the value of the creditorGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorGroupHandle }
     *     
     */
    public CreditorGroupHandle getCreditorGroupHandle() {
        return creditorGroupHandle;
    }

    /**
     * Sets the value of the creditorGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorGroupHandle }
     *     
     */
    public void setCreditorGroupHandle(CreditorGroupHandle value) {
        this.creditorGroupHandle = value;
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
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the attentionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorContactHandle }
     *     
     */
    public CreditorContactHandle getAttentionHandle() {
        return attentionHandle;
    }

    /**
     * Sets the value of the attentionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorContactHandle }
     *     
     */
    public void setAttentionHandle(CreditorContactHandle value) {
        this.attentionHandle = value;
    }

    /**
     * Gets the value of the yourReferenceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorContactHandle }
     *     
     */
    public CreditorContactHandle getYourReferenceHandle() {
        return yourReferenceHandle;
    }

    /**
     * Sets the value of the yourReferenceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorContactHandle }
     *     
     */
    public void setYourReferenceHandle(CreditorContactHandle value) {
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
     * Gets the value of the defaultPaymentTypeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public BankPaymentTypeHandle getDefaultPaymentTypeHandle() {
        return defaultPaymentTypeHandle;
    }

    /**
     * Sets the value of the defaultPaymentTypeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public void setDefaultPaymentTypeHandle(BankPaymentTypeHandle value) {
        this.defaultPaymentTypeHandle = value;
    }

    /**
     * Gets the value of the defaultPaymentCreditorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPaymentCreditorId() {
        return defaultPaymentCreditorId;
    }

    /**
     * Sets the value of the defaultPaymentCreditorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPaymentCreditorId(String value) {
        this.defaultPaymentCreditorId = value;
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
     * Gets the value of the autoContraAccountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getAutoContraAccountHandle() {
        return autoContraAccountHandle;
    }

    /**
     * Sets the value of the autoContraAccountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setAutoContraAccountHandle(AccountHandle value) {
        this.autoContraAccountHandle = value;
    }

}
