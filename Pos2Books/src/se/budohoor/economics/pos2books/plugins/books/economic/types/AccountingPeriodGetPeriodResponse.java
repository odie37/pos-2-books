
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
 *         &lt;element name="AccountingPeriod_GetPeriodResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "accountingPeriodGetPeriodResult"
})
@XmlRootElement(name = "AccountingPeriod_GetPeriodResponse")
public class AccountingPeriodGetPeriodResponse {

    @XmlElement(name = "AccountingPeriod_GetPeriodResult")
    protected int accountingPeriodGetPeriodResult;

    /**
     * Gets the value of the accountingPeriodGetPeriodResult property.
     * 
     */
    public int getAccountingPeriodGetPeriodResult() {
        return accountingPeriodGetPeriodResult;
    }

    /**
     * Sets the value of the accountingPeriodGetPeriodResult property.
     * 
     */
    public void setAccountingPeriodGetPeriodResult(int value) {
        this.accountingPeriodGetPeriodResult = value;
    }

}
