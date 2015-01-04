
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="accountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="minNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "accountHandle",
    "minNumber",
    "maxNumber"
})
@XmlRootElement(name = "Account_GetEntriesByNumber")
public class AccountGetEntriesByNumber {

    protected AccountHandle accountHandle;
    protected int minNumber;
    protected int maxNumber;

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
     * Gets the value of the minNumber property.
     * 
     */
    public int getMinNumber() {
        return minNumber;
    }

    /**
     * Sets the value of the minNumber property.
     * 
     */
    public void setMinNumber(int value) {
        this.minNumber = value;
    }

    /**
     * Gets the value of the maxNumber property.
     * 
     */
    public int getMaxNumber() {
        return maxNumber;
    }

    /**
     * Sets the value of the maxNumber property.
     * 
     */
    public void setMaxNumber(int value) {
        this.maxNumber = value;
    }

}
