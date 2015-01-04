
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://e-conomic.com}AccountType"/>
 *         &lt;element name="DebitCredit" type="{http://e-conomic.com}DebitCredit"/>
 *         &lt;element name="IsAccessible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BlockDirectEntries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VatAccountHandle" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
 *         &lt;element name="ContraAccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="OpeningAccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="TotalFromHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DepartmentHandle" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
 *         &lt;element name="DistributionKeyHandle" type="{http://e-conomic.com}DistributionKeyHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountData", propOrder = {
    "handle",
    "number",
    "name",
    "type",
    "debitCredit",
    "isAccessible",
    "blockDirectEntries",
    "vatAccountHandle",
    "contraAccountHandle",
    "openingAccountHandle",
    "totalFromHandle",
    "balance",
    "departmentHandle",
    "distributionKeyHandle"
})
public class AccountData {

    @XmlElement(name = "Handle")
    protected AccountHandle handle;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type", required = true)
    protected AccountType type;
    @XmlElement(name = "DebitCredit", required = true)
    protected DebitCredit debitCredit;
    @XmlElement(name = "IsAccessible")
    protected boolean isAccessible;
    @XmlElement(name = "BlockDirectEntries")
    protected boolean blockDirectEntries;
    @XmlElement(name = "VatAccountHandle")
    protected VatAccountHandle vatAccountHandle;
    @XmlElement(name = "ContraAccountHandle")
    protected AccountHandle contraAccountHandle;
    @XmlElement(name = "OpeningAccountHandle")
    protected AccountHandle openingAccountHandle;
    @XmlElement(name = "TotalFromHandle")
    protected AccountHandle totalFromHandle;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElement(name = "DepartmentHandle")
    protected DepartmentHandle departmentHandle;
    @XmlElement(name = "DistributionKeyHandle")
    protected DistributionKeyHandle distributionKeyHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setHandle(AccountHandle value) {
        this.handle = value;
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
     *     {@link AccountType }
     *     
     */
    public AccountType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setType(AccountType value) {
        this.type = value;
    }

    /**
     * Gets the value of the debitCredit property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCredit }
     *     
     */
    public DebitCredit getDebitCredit() {
        return debitCredit;
    }

    /**
     * Sets the value of the debitCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCredit }
     *     
     */
    public void setDebitCredit(DebitCredit value) {
        this.debitCredit = value;
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
     * Gets the value of the blockDirectEntries property.
     * 
     */
    public boolean isBlockDirectEntries() {
        return blockDirectEntries;
    }

    /**
     * Sets the value of the blockDirectEntries property.
     * 
     */
    public void setBlockDirectEntries(boolean value) {
        this.blockDirectEntries = value;
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
     * Gets the value of the openingAccountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getOpeningAccountHandle() {
        return openingAccountHandle;
    }

    /**
     * Sets the value of the openingAccountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setOpeningAccountHandle(AccountHandle value) {
        this.openingAccountHandle = value;
    }

    /**
     * Gets the value of the totalFromHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getTotalFromHandle() {
        return totalFromHandle;
    }

    /**
     * Sets the value of the totalFromHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setTotalFromHandle(AccountHandle value) {
        this.totalFromHandle = value;
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

}
