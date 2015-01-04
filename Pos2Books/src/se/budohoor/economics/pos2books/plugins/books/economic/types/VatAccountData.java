
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VatAccountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VatAccountData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
 *         &lt;element name="VatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://e-conomic.com}VatAccountType"/>
 *         &lt;element name="RateAsPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="ContraAccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VatAccountData", propOrder = {
    "handle",
    "vatCode",
    "name",
    "type",
    "rateAsPercent",
    "accountHandle",
    "contraAccountHandle"
})
public class VatAccountData {

    @XmlElement(name = "Handle")
    protected VatAccountHandle handle;
    @XmlElement(name = "VatCode")
    protected String vatCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type", required = true)
    protected VatAccountType type;
    @XmlElement(name = "RateAsPercent", required = true)
    protected BigDecimal rateAsPercent;
    @XmlElement(name = "AccountHandle")
    protected AccountHandle accountHandle;
    @XmlElement(name = "ContraAccountHandle")
    protected AccountHandle contraAccountHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountHandle }
     *     
     */
    public VatAccountHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountHandle }
     *     
     */
    public void setHandle(VatAccountHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the vatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatCode() {
        return vatCode;
    }

    /**
     * Sets the value of the vatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatCode(String value) {
        this.vatCode = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountType }
     *     
     */
    public VatAccountType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountType }
     *     
     */
    public void setType(VatAccountType value) {
        this.type = value;
    }

    /**
     * Gets the value of the rateAsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateAsPercent() {
        return rateAsPercent;
    }

    /**
     * Sets the value of the rateAsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateAsPercent(BigDecimal value) {
        this.rateAsPercent = value;
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

}
