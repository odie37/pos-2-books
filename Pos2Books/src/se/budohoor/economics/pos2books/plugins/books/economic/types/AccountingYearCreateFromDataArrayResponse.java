
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
 *         &lt;element name="AccountingYear_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfAccountingYearHandle" minOccurs="0"/>
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
    "accountingYearCreateFromDataArrayResult"
})
@XmlRootElement(name = "AccountingYear_CreateFromDataArrayResponse")
public class AccountingYearCreateFromDataArrayResponse {

    @XmlElement(name = "AccountingYear_CreateFromDataArrayResult")
    protected ArrayOfAccountingYearHandle accountingYearCreateFromDataArrayResult;

    /**
     * Gets the value of the accountingYearCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountingYearHandle }
     *     
     */
    public ArrayOfAccountingYearHandle getAccountingYearCreateFromDataArrayResult() {
        return accountingYearCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the accountingYearCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountingYearHandle }
     *     
     */
    public void setAccountingYearCreateFromDataArrayResult(ArrayOfAccountingYearHandle value) {
        this.accountingYearCreateFromDataArrayResult = value;
    }

}
