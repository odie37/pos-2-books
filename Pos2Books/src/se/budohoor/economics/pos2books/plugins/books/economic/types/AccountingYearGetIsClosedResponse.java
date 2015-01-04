
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
 *         &lt;element name="AccountingYear_GetIsClosedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "accountingYearGetIsClosedResult"
})
@XmlRootElement(name = "AccountingYear_GetIsClosedResponse")
public class AccountingYearGetIsClosedResponse {

    @XmlElement(name = "AccountingYear_GetIsClosedResult")
    protected boolean accountingYearGetIsClosedResult;

    /**
     * Gets the value of the accountingYearGetIsClosedResult property.
     * 
     */
    public boolean isAccountingYearGetIsClosedResult() {
        return accountingYearGetIsClosedResult;
    }

    /**
     * Sets the value of the accountingYearGetIsClosedResult property.
     * 
     */
    public void setAccountingYearGetIsClosedResult(boolean value) {
        this.accountingYearGetIsClosedResult = value;
    }

}
