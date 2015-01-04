
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="type" type="{http://e-conomic.com}CashBookEntryType"/>
 *         &lt;element name="cashBookHandle" type="{http://e-conomic.com}CashBookHandle" minOccurs="0"/>
 *         &lt;element name="debtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="creditorHandle" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
 *         &lt;element name="accountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="contraAccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "type",
    "cashBookHandle",
    "debtorHandle",
    "creditorHandle",
    "accountHandle",
    "contraAccountHandle"
})
@XmlRootElement(name = "CashBookEntry_Create")
public class CashBookEntryCreate {

    @XmlElement(required = true)
    protected CashBookEntryType type;
    protected CashBookHandle cashBookHandle;
    protected DebtorHandle debtorHandle;
    protected CreditorHandle creditorHandle;
    protected AccountHandle accountHandle;
    protected AccountHandle contraAccountHandle;

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

}
