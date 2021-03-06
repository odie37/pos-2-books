
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
 *         &lt;element name="accountHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "accountHandle",
    "first",
    "last"
})
@XmlRootElement(name = "Account_GetEntriesByDate")
public class AccountGetEntriesByDate {

    protected AccountHandle accountHandle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar first;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar last;

    /**
     * Gets the value of the accountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getAccountHandle() {
        return accountHandle;
    }

    /**
     * Sets the value of the accountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setAccountHandle(AccountHandle value) {
        this.accountHandle = value;
    }

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirst(XMLGregorianCalendar value) {
        this.first = value;
    }

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLast(XMLGregorianCalendar value) {
        this.last = value;
    }

}
