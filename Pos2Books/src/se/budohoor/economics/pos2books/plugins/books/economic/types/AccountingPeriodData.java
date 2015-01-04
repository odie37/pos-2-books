
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountingPeriodData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingPeriodData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}AccountingPeriodHandle" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountingYearHandle" type="{http://e-conomic.com}AccountingYearHandle" minOccurs="0"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Status" type="{http://e-conomic.com}AccountingPeriodStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingPeriodData", propOrder = {
    "handle",
    "period",
    "accountingYearHandle",
    "fromDate",
    "toDate",
    "status"
})
public class AccountingPeriodData {

    @XmlElement(name = "Handle")
    protected AccountingPeriodHandle handle;
    @XmlElement(name = "Period")
    protected int period;
    @XmlElement(name = "AccountingYearHandle")
    protected AccountingYearHandle accountingYearHandle;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "Status", required = true)
    protected AccountingPeriodStatus status;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodHandle }
     *     
     */
    public AccountingPeriodHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodHandle }
     *     
     */
    public void setHandle(AccountingPeriodHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
    }

    /**
     * Gets the value of the accountingYearHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingYearHandle }
     *     
     */
    public AccountingYearHandle getAccountingYearHandle() {
        return accountingYearHandle;
    }

    /**
     * Sets the value of the accountingYearHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingYearHandle }
     *     
     */
    public void setAccountingYearHandle(AccountingYearHandle value) {
        this.accountingYearHandle = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodStatus }
     *     
     */
    public AccountingPeriodStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodStatus }
     *     
     */
    public void setStatus(AccountingPeriodStatus value) {
        this.status = value;
    }

}
