
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
 *         &lt;element name="accountingPeriodHandle" type="{http://e-conomic.com}AccountingPeriodHandle" minOccurs="0"/>
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
    "accountingPeriodHandle"
})
@XmlRootElement(name = "AccountingPeriod_GetStatus")
public class AccountingPeriodGetStatus {

    protected AccountingPeriodHandle accountingPeriodHandle;

    /**
     * Gets the value of the accountingPeriodHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodHandle }
     *     
     */
    public AccountingPeriodHandle getAccountingPeriodHandle() {
        return accountingPeriodHandle;
    }

    /**
     * Sets the value of the accountingPeriodHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodHandle }
     *     
     */
    public void setAccountingPeriodHandle(AccountingPeriodHandle value) {
        this.accountingPeriodHandle = value;
    }

}
