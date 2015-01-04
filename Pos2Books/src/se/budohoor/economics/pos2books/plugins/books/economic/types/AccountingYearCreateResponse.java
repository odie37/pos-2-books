
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
 *         &lt;element name="AccountingYear_CreateResult" type="{http://e-conomic.com}AccountingYearHandle" minOccurs="0"/>
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
    "accountingYearCreateResult"
})
@XmlRootElement(name = "AccountingYear_CreateResponse")
public class AccountingYearCreateResponse {

    @XmlElement(name = "AccountingYear_CreateResult")
    protected AccountingYearHandle accountingYearCreateResult;

    /**
     * Gets the value of the accountingYearCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingYearHandle }
     *     
     */
    public AccountingYearHandle getAccountingYearCreateResult() {
        return accountingYearCreateResult;
    }

    /**
     * Sets the value of the accountingYearCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingYearHandle }
     *     
     */
    public void setAccountingYearCreateResult(AccountingYearHandle value) {
        this.accountingYearCreateResult = value;
    }

}
