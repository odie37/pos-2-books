
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
 *         &lt;element name="accountingYearHandle" type="{http://e-conomic.com}AccountingYearHandle" minOccurs="0"/>
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
    "accountingYearHandle"
})
@XmlRootElement(name = "AccountingYear_GetYear")
public class AccountingYearGetYear {

    protected AccountingYearHandle accountingYearHandle;

    /**
     * Gets the value of the accountingYearHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingYearHandle }
     *     
     */
    public AccountingYearHandle getAccountingYearHandle() {
        return accountingYearHandle;
    }

    /**
     * Sets the value of the accountingYearHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingYearHandle }
     *     
     */
    public void setAccountingYearHandle(AccountingYearHandle value) {
        this.accountingYearHandle = value;
    }

}
