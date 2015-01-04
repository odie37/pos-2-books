
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
 *         &lt;element name="fromSerialNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="toSerialNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entryType" type="{http://e-conomic.com}EntryType"/>
 *         &lt;element name="invoiceNumbers" type="{http://e-conomic.com}ArrayOfString" minOccurs="0"/>
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
    "fromSerialNumber",
    "toSerialNumber",
    "entryType",
    "invoiceNumbers"
})
@XmlRootElement(name = "CreditorEntry_FindBySerialNumberTypeAndInvoiceNumber")
public class CreditorEntryFindBySerialNumberTypeAndInvoiceNumber {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fromSerialNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer toSerialNumber;
    @XmlElement(required = true)
    protected EntryType entryType;
    protected ArrayOfString invoiceNumbers;

    /**
     * Gets the value of the fromSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromSerialNumber() {
        return fromSerialNumber;
    }

    /**
     * Sets the value of the fromSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromSerialNumber(Integer value) {
        this.fromSerialNumber = value;
    }

    /**
     * Gets the value of the toSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToSerialNumber() {
        return toSerialNumber;
    }

    /**
     * Sets the value of the toSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToSerialNumber(Integer value) {
        this.toSerialNumber = value;
    }

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link EntryType }
     *     
     */
    public EntryType getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryType }
     *     
     */
    public void setEntryType(EntryType value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the invoiceNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getInvoiceNumbers() {
        return invoiceNumbers;
    }

    /**
     * Sets the value of the invoiceNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setInvoiceNumbers(ArrayOfString value) {
        this.invoiceNumbers = value;
    }

}
