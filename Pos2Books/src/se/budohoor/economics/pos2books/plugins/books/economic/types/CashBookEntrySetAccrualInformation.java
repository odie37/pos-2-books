
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
 *         &lt;element name="cashBookEntryHandle" type="{http://e-conomic.com}CashBookEntryHandle" minOccurs="0"/>
 *         &lt;element name="capitaliseAccountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="capitaliseStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="capitaliseEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "cashBookEntryHandle",
    "capitaliseAccountHandle",
    "capitaliseStartDate",
    "capitaliseEndDate"
})
@XmlRootElement(name = "CashBookEntry_SetAccrualInformation")
public class CashBookEntrySetAccrualInformation {

    protected CashBookEntryHandle cashBookEntryHandle;
    protected AccountHandle capitaliseAccountHandle;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar capitaliseStartDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar capitaliseEndDate;

    /**
     * Gets the value of the cashBookEntryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public CashBookEntryHandle getCashBookEntryHandle() {
        return cashBookEntryHandle;
    }

    /**
     * Sets the value of the cashBookEntryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookEntryHandle }
     *     
     */
    public void setCashBookEntryHandle(CashBookEntryHandle value) {
        this.cashBookEntryHandle = value;
    }

    /**
     * Gets the value of the capitaliseAccountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getCapitaliseAccountHandle() {
        return capitaliseAccountHandle;
    }

    /**
     * Sets the value of the capitaliseAccountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setCapitaliseAccountHandle(AccountHandle value) {
        this.capitaliseAccountHandle = value;
    }

    /**
     * Gets the value of the capitaliseStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCapitaliseStartDate() {
        return capitaliseStartDate;
    }

    /**
     * Sets the value of the capitaliseStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCapitaliseStartDate(XMLGregorianCalendar value) {
        this.capitaliseStartDate = value;
    }

    /**
     * Gets the value of the capitaliseEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCapitaliseEndDate() {
        return capitaliseEndDate;
    }

    /**
     * Sets the value of the capitaliseEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCapitaliseEndDate(XMLGregorianCalendar value) {
        this.capitaliseEndDate = value;
    }

}
