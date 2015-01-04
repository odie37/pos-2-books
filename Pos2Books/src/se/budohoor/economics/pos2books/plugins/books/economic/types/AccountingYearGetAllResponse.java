
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
 *         &lt;element name="AccountingYear_GetAllResult" type="{http://e-conomic.com}ArrayOfAccountingYearHandle" minOccurs="0"/>
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
    "accountingYearGetAllResult"
})
@XmlRootElement(name = "AccountingYear_GetAllResponse")
public class AccountingYearGetAllResponse {

    @XmlElement(name = "AccountingYear_GetAllResult")
    protected ArrayOfAccountingYearHandle accountingYearGetAllResult;

    /**
     * Gets the value of the accountingYearGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountingYearHandle }
     *     
     */
    public ArrayOfAccountingYearHandle getAccountingYearGetAllResult() {
        return accountingYearGetAllResult;
    }

    /**
     * Sets the value of the accountingYearGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountingYearHandle }
     *     
     */
    public void setAccountingYearGetAllResult(ArrayOfAccountingYearHandle value) {
        this.accountingYearGetAllResult = value;
    }

}
