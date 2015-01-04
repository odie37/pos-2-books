
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
 *         &lt;element name="Account_GetTotalFromResult" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "accountGetTotalFromResult"
})
@XmlRootElement(name = "Account_GetTotalFromResponse")
public class AccountGetTotalFromResponse {

    @XmlElement(name = "Account_GetTotalFromResult")
    protected AccountHandle accountGetTotalFromResult;

    /**
     * Gets the value of the accountGetTotalFromResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getAccountGetTotalFromResult() {
        return accountGetTotalFromResult;
    }

    /**
     * Sets the value of the accountGetTotalFromResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setAccountGetTotalFromResult(AccountHandle value) {
        this.accountGetTotalFromResult = value;
    }

}
