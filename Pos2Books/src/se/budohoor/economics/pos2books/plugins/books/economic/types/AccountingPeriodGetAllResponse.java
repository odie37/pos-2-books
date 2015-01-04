
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
 *         &lt;element name="AccountingPeriod_GetAllResult" type="{http://e-conomic.com}ArrayOfAccountingPeriodHandle" minOccurs="0"/>
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
    "accountingPeriodGetAllResult"
})
@XmlRootElement(name = "AccountingPeriod_GetAllResponse")
public class AccountingPeriodGetAllResponse {

    @XmlElement(name = "AccountingPeriod_GetAllResult")
    protected ArrayOfAccountingPeriodHandle accountingPeriodGetAllResult;

    /**
     * Gets the value of the accountingPeriodGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountingPeriodHandle }
     *     
     */
    public ArrayOfAccountingPeriodHandle getAccountingPeriodGetAllResult() {
        return accountingPeriodGetAllResult;
    }

    /**
     * Sets the value of the accountingPeriodGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountingPeriodHandle }
     *     
     */
    public void setAccountingPeriodGetAllResult(ArrayOfAccountingPeriodHandle value) {
        this.accountingPeriodGetAllResult = value;
    }

}
