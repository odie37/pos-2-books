
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
 *         &lt;element name="AccountingPeriod_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfAccountingPeriodData" minOccurs="0"/>
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
    "accountingPeriodGetDataArrayResult"
})
@XmlRootElement(name = "AccountingPeriod_GetDataArrayResponse")
public class AccountingPeriodGetDataArrayResponse {

    @XmlElement(name = "AccountingPeriod_GetDataArrayResult")
    protected ArrayOfAccountingPeriodData accountingPeriodGetDataArrayResult;

    /**
     * Gets the value of the accountingPeriodGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountingPeriodData }
     *     
     */
    public ArrayOfAccountingPeriodData getAccountingPeriodGetDataArrayResult() {
        return accountingPeriodGetDataArrayResult;
    }

    /**
     * Sets the value of the accountingPeriodGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountingPeriodData }
     *     
     */
    public void setAccountingPeriodGetDataArrayResult(ArrayOfAccountingPeriodData value) {
        this.accountingPeriodGetDataArrayResult = value;
    }

}
