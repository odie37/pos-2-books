
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
 *         &lt;element name="AccountingYear_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfAccountingYearData" minOccurs="0"/>
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
    "accountingYearGetDataArrayResult"
})
@XmlRootElement(name = "AccountingYear_GetDataArrayResponse")
public class AccountingYearGetDataArrayResponse {

    @XmlElement(name = "AccountingYear_GetDataArrayResult")
    protected ArrayOfAccountingYearData accountingYearGetDataArrayResult;

    /**
     * Gets the value of the accountingYearGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountingYearData }
     *     
     */
    public ArrayOfAccountingYearData getAccountingYearGetDataArrayResult() {
        return accountingYearGetDataArrayResult;
    }

    /**
     * Sets the value of the accountingYearGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountingYearData }
     *     
     */
    public void setAccountingYearGetDataArrayResult(ArrayOfAccountingYearData value) {
        this.accountingYearGetDataArrayResult = value;
    }

}
