
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SumIntervalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SumIntervalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}SumIntervalHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="FromAccount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ToAccount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumIntervalData", propOrder = {
    "handle",
    "id",
    "number",
    "accountHandle",
    "fromAccount",
    "toAccount"
})
public class SumIntervalData {

    @XmlElement(name = "Handle")
    protected SumIntervalHandle handle;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "AccountHandle")
    protected AccountHandle accountHandle;
    @XmlElement(name = "FromAccount")
    protected int fromAccount;
    @XmlElement(name = "ToAccount")
    protected int toAccount;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link SumIntervalHandle }
     *     
     */
    public SumIntervalHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumIntervalHandle }
     *     
     */
    public void setHandle(SumIntervalHandle value) {
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
     * Gets the value of the fromAccount property.
     * 
     */
    public int getFromAccount() {
        return fromAccount;
    }

    /**
     * Sets the value of the fromAccount property.
     * 
     */
    public void setFromAccount(int value) {
        this.fromAccount = value;
    }

    /**
     * Gets the value of the toAccount property.
     * 
     */
    public int getToAccount() {
        return toAccount;
    }

    /**
     * Sets the value of the toAccount property.
     * 
     */
    public void setToAccount(int value) {
        this.toAccount = value;
    }

}
