
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
 *         &lt;element name="AccountingPeriod_GetStatusResult" type="{http://e-conomic.com}AccountingPeriodStatus"/>
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
    "accountingPeriodGetStatusResult"
})
@XmlRootElement(name = "AccountingPeriod_GetStatusResponse")
public class AccountingPeriodGetStatusResponse {

    @XmlElement(name = "AccountingPeriod_GetStatusResult", required = true)
    protected AccountingPeriodStatus accountingPeriodGetStatusResult;

    /**
     * Gets the value of the accountingPeriodGetStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodStatus }
     *     
     */
    public AccountingPeriodStatus getAccountingPeriodGetStatusResult() {
        return accountingPeriodGetStatusResult;
    }

    /**
     * Sets the value of the accountingPeriodGetStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodStatus }
     *     
     */
    public void setAccountingPeriodGetStatusResult(AccountingPeriodStatus value) {
        this.accountingPeriodGetStatusResult = value;
    }

}
