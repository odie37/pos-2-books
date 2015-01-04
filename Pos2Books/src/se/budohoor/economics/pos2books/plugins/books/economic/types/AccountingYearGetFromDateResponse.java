
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="AccountingYear_GetFromDateResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "accountingYearGetFromDateResult"
})
@XmlRootElement(name = "AccountingYear_GetFromDateResponse")
public class AccountingYearGetFromDateResponse {

    @XmlElement(name = "AccountingYear_GetFromDateResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accountingYearGetFromDateResult;

    /**
     * Gets the value of the accountingYearGetFromDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountingYearGetFromDateResult() {
        return accountingYearGetFromDateResult;
    }

    /**
     * Sets the value of the accountingYearGetFromDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountingYearGetFromDateResult(XMLGregorianCalendar value) {
        this.accountingYearGetFromDateResult = value;
    }

}
