
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
 *         &lt;element name="AccountingYear_GetPeriodsResult" type="{http://e-conomic.com}ArrayOfAccountingPeriodHandle" minOccurs="0"/>
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
    "accountingYearGetPeriodsResult"
})
@XmlRootElement(name = "AccountingYear_GetPeriodsResponse")
public class AccountingYearGetPeriodsResponse {

    @XmlElement(name = "AccountingYear_GetPeriodsResult")
    protected ArrayOfAccountingPeriodHandle accountingYearGetPeriodsResult;

    /**
     * Gets the value of the accountingYearGetPeriodsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountingPeriodHandle }
     *     
     */
    public ArrayOfAccountingPeriodHandle getAccountingYearGetPeriodsResult() {
        return accountingYearGetPeriodsResult;
    }

    /**
     * Sets the value of the accountingYearGetPeriodsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountingPeriodHandle }
     *     
     */
    public void setAccountingYearGetPeriodsResult(ArrayOfAccountingPeriodHandle value) {
        this.accountingYearGetPeriodsResult = value;
    }

}
