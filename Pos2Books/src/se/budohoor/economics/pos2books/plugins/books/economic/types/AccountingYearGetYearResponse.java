
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
 *         &lt;element name="AccountingYear_GetYearResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "accountingYearGetYearResult"
})
@XmlRootElement(name = "AccountingYear_GetYearResponse")
public class AccountingYearGetYearResponse {

    @XmlElement(name = "AccountingYear_GetYearResult")
    protected String accountingYearGetYearResult;

    /**
     * Gets the value of the accountingYearGetYearResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingYearGetYearResult() {
        return accountingYearGetYearResult;
    }

    /**
     * Sets the value of the accountingYearGetYearResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingYearGetYearResult(String value) {
        this.accountingYearGetYearResult = value;
    }

}
