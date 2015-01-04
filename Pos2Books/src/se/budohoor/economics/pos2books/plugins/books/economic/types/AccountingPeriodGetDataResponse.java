
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
 *         &lt;element name="AccountingPeriod_GetDataResult" type="{http://e-conomic.com}AccountingPeriodData" minOccurs="0"/>
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
    "accountingPeriodGetDataResult"
})
@XmlRootElement(name = "AccountingPeriod_GetDataResponse")
public class AccountingPeriodGetDataResponse {

    @XmlElement(name = "AccountingPeriod_GetDataResult")
    protected AccountingPeriodData accountingPeriodGetDataResult;

    /**
     * Gets the value of the accountingPeriodGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodData }
     *     
     */
    public AccountingPeriodData getAccountingPeriodGetDataResult() {
        return accountingPeriodGetDataResult;
    }

    /**
     * Sets the value of the accountingPeriodGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodData }
     *     
     */
    public void setAccountingPeriodGetDataResult(AccountingPeriodData value) {
        this.accountingPeriodGetDataResult = value;
    }

}
