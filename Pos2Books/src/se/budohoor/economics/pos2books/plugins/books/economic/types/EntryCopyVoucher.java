
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
 *         &lt;element name="entryHandle" type="{http://e-conomic.com}EntryHandle" minOccurs="0"/>
 *         &lt;element name="newVoucherNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newVoucherDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="newText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCashBook" type="{http://e-conomic.com}CashBookHandle" minOccurs="0"/>
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
    "entryHandle",
    "newVoucherNumber",
    "newVoucherDate",
    "newText",
    "newCashBook"
})
@XmlRootElement(name = "Entry_CopyVoucher")
public class EntryCopyVoucher {

    protected EntryHandle entryHandle;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer newVoucherNumber;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newVoucherDate;
    protected String newText;
    protected CashBookHandle newCashBook;

    /**
     * Gets the value of the entryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EntryHandle }
     *     
     */
    public EntryHandle getEntryHandle() {
        return entryHandle;
    }

    /**
     * Sets the value of the entryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryHandle }
     *     
     */
    public void setEntryHandle(EntryHandle value) {
        this.entryHandle = value;
    }

    /**
     * Gets the value of the newVoucherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewVoucherNumber() {
        return newVoucherNumber;
    }

    /**
     * Sets the value of the newVoucherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewVoucherNumber(Integer value) {
        this.newVoucherNumber = value;
    }

    /**
     * Gets the value of the newVoucherDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewVoucherDate() {
        return newVoucherDate;
    }

    /**
     * Sets the value of the newVoucherDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewVoucherDate(XMLGregorianCalendar value) {
        this.newVoucherDate = value;
    }

    /**
     * Gets the value of the newText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewText() {
        return newText;
    }

    /**
     * Sets the value of the newText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewText(String value) {
        this.newText = value;
    }

    /**
     * Gets the value of the newCashBook property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookHandle }
     *     
     */
    public CashBookHandle getNewCashBook() {
        return newCashBook;
    }

    /**
     * Sets the value of the newCashBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookHandle }
     *     
     */
    public void setNewCashBook(CashBookHandle value) {
        this.newCashBook = value;
    }

}
