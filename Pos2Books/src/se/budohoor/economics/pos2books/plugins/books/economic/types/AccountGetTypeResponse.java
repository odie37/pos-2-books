
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
 *         &lt;element name="Account_GetTypeResult" type="{http://e-conomic.com}AccountType"/>
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
    "accountGetTypeResult"
})
@XmlRootElement(name = "Account_GetTypeResponse")
public class AccountGetTypeResponse {

    @XmlElement(name = "Account_GetTypeResult", required = true)
    protected AccountType accountGetTypeResult;

    /**
     * Gets the value of the accountGetTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountGetTypeResult() {
        return accountGetTypeResult;
    }

    /**
     * Sets the value of the accountGetTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountGetTypeResult(AccountType value) {
        this.accountGetTypeResult = value;
    }

}
