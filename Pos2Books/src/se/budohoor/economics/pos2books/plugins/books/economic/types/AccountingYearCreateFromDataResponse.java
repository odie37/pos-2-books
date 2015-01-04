
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
 *         &lt;element name="AccountingYear_CreateFromDataResult" type="{http://e-conomic.com}AccountingYearHandle" minOccurs="0"/>
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
    "accountingYearCreateFromDataResult"
})
@XmlRootElement(name = "AccountingYear_CreateFromDataResponse")
public class AccountingYearCreateFromDataResponse {

    @XmlElement(name = "AccountingYear_CreateFromDataResult")
    protected AccountingYearHandle accountingYearCreateFromDataResult;

    /**
     * Gets the value of the accountingYearCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingYearHandle }
     *     
     */
    public AccountingYearHandle getAccountingYearCreateFromDataResult() {
        return accountingYearCreateFromDataResult;
    }

    /**
     * Sets the value of the accountingYearCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingYearHandle }
     *     
     */
    public void setAccountingYearCreateFromDataResult(AccountingYearHandle value) {
        this.accountingYearCreateFromDataResult = value;
    }

}
