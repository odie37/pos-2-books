
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScannedDocumentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScannedDocumentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}ScannedDocumentHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://e-conomic.com}DocumentStatus"/>
 *         &lt;element name="CategoryHandle" type="{http://e-conomic.com}DocumentArchiveCategoryHandle" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScannedDocumentData", propOrder = {
    "handle",
    "number",
    "status",
    "categoryHandle",
    "note",
    "pageCount",
    "voucherNumber",
    "fromDate",
    "toDate"
})
public class ScannedDocumentData {

    @XmlElement(name = "Handle")
    protected ScannedDocumentHandle handle;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Status", required = true)
    protected DocumentStatus status;
    @XmlElement(name = "CategoryHandle")
    protected DocumentArchiveCategoryHandle categoryHandle;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "PageCount", required = true, type = Integer.class, nillable = true)
    protected Integer pageCount;
    @XmlElement(name = "VoucherNumber", required = true, type = Integer.class, nillable = true)
    protected Integer voucherNumber;
    @XmlElement(name = "FromDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public ScannedDocumentHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public void setHandle(ScannedDocumentHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatus }
     *     
     */
    public DocumentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatus }
     *     
     */
    public void setStatus(DocumentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the categoryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentArchiveCategoryHandle }
     *     
     */
    public DocumentArchiveCategoryHandle getCategoryHandle() {
        return categoryHandle;
    }

    /**
     * Sets the value of the categoryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentArchiveCategoryHandle }
     *     
     */
    public void setCategoryHandle(DocumentArchiveCategoryHandle value) {
        this.categoryHandle = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the voucherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Sets the value of the voucherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVoucherNumber(Integer value) {
        this.voucherNumber = value;
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

}
