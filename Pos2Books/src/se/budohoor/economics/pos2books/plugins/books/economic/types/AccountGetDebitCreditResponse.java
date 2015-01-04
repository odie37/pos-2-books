
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
 *         &lt;element name="Account_GetDebitCreditResult" type="{http://e-conomic.com}DebitCredit"/>
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
    "accountGetDebitCreditResult"
})
@XmlRootElement(name = "Account_GetDebitCreditResponse")
public class AccountGetDebitCreditResponse {

    @XmlElement(name = "Account_GetDebitCreditResult", required = true)
    protected DebitCredit accountGetDebitCreditResult;

    /**
     * Gets the value of the accountGetDebitCreditResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCredit }
     *     
     */
    public DebitCredit getAccountGetDebitCreditResult() {
        return accountGetDebitCreditResult;
    }

    /**
     * Sets the value of the accountGetDebitCreditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCredit }
     *     
     */
    public void setAccountGetDebitCreditResult(DebitCredit value) {
        this.accountGetDebitCreditResult = value;
    }

}
