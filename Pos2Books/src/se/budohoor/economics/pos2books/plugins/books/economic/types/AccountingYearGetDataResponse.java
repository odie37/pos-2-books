
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
 *         &lt;element name="AccountingYear_GetDataResult" type="{http://e-conomic.com}AccountingYearData" minOccurs="0"/>
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
    "accountingYearGetDataResult"
})
@XmlRootElement(name = "AccountingYear_GetDataResponse")
public class AccountingYearGetDataResponse {

    @XmlElement(name = "AccountingYear_GetDataResult")
    protected AccountingYearData accountingYearGetDataResult;

    /**
     * Gets the value of the accountingYearGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingYearData }
     *     
     */
    public AccountingYearData getAccountingYearGetDataResult() {
        return accountingYearGetDataResult;
    }

    /**
     * Sets the value of the accountingYearGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingYearData }
     *     
     */
    public void setAccountingYearGetDataResult(AccountingYearData value) {
        this.accountingYearGetDataResult = value;
    }

}
