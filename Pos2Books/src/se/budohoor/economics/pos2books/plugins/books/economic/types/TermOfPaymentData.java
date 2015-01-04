
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermOfPaymentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermOfPaymentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://e-conomic.com}TermOfPaymentType"/>
 *         &lt;element name="Days" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContraAccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="ContraAccount2Handle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="DebtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="DistributionInPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DistributionInPercent2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermOfPaymentData", propOrder = {
    "handle",
    "id",
    "name",
    "type",
    "days",
    "description",
    "contraAccountHandle",
    "contraAccount2Handle",
    "debtorHandle",
    "distributionInPercent",
    "distributionInPercent2"
})
public class TermOfPaymentData {

    @XmlElement(name = "Handle")
    protected TermOfPaymentHandle handle;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type", required = true)
    protected TermOfPaymentType type;
    @XmlElement(name = "Days", required = true, type = Integer.class, nillable = true)
    protected Integer days;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ContraAccountHandle")
    protected AccountHandle contraAccountHandle;
    @XmlElement(name = "ContraAccount2Handle")
    protected AccountHandle contraAccount2Handle;
    @XmlElement(name = "DebtorHandle")
    protected DebtorHandle debtorHandle;
    @XmlElement(name = "DistributionInPercent", required = true, nillable = true)
    protected BigDecimal distributionInPercent;
    @XmlElement(name = "DistributionInPercent2", required = true, nillable = true)
    protected BigDecimal distributionInPercent2;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public TermOfPaymentHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public void setHandle(TermOfPaymentHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
     *     {@link TermOfPaymentType }
     *     
     */
    public TermOfPaymentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentType }
     *     
     */
    public void setType(TermOfPaymentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDays(Integer value) {
        this.days = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the contraAccount2Handle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getContraAccount2Handle() {
        return contraAccount2Handle;
    }

    /**
     * Sets the value of the contraAccount2Handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setContraAccount2Handle(AccountHandle value) {
        this.contraAccount2Handle = value;
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
     * Gets the value of the distributionInPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistributionInPercent() {
        return distributionInPercent;
    }

    /**
     * Sets the value of the distributionInPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistributionInPercent(BigDecimal value) {
        this.distributionInPercent = value;
    }

    /**
     * Gets the value of the distributionInPercent2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistributionInPercent2() {
        return distributionInPercent2;
    }

    /**
     * Sets the value of the distributionInPercent2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistributionInPercent2(BigDecimal value) {
        this.distributionInPercent2 = value;
    }

}
