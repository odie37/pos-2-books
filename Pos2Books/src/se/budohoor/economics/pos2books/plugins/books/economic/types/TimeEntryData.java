
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeEntryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeEntryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}TimeEntryHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProjectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="ActivityHandle" type="{http://e-conomic.com}ActivityHandle" minOccurs="0"/>
 *         &lt;element name="EmployeeHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfHours" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SalesPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeEntryData", propOrder = {
    "handle",
    "id",
    "projectHandle",
    "activityHandle",
    "employeeHandle",
    "date",
    "text",
    "numberOfHours",
    "approved",
    "salesPrice",
    "costPrice"
})
public class TimeEntryData {

    @XmlElement(name = "Handle")
    protected TimeEntryHandle handle;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "ProjectHandle")
    protected ProjectHandle projectHandle;
    @XmlElement(name = "ActivityHandle")
    protected ActivityHandle activityHandle;
    @XmlElement(name = "EmployeeHandle")
    protected EmployeeHandle employeeHandle;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "NumberOfHours", required = true)
    protected BigDecimal numberOfHours;
    @XmlElement(name = "Approved")
    protected boolean approved;
    @XmlElement(name = "SalesPrice")
    protected BigDecimal salesPrice;
    @XmlElement(name = "CostPrice")
    protected BigDecimal costPrice;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntryHandle }
     *     
     */
    public TimeEntryHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntryHandle }
     *     
     */
    public void setHandle(TimeEntryHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the projectHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHandle }
     *     
     */
    public ProjectHandle getProjectHandle() {
        return projectHandle;
    }

    /**
     * Sets the value of the projectHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHandle }
     *     
     */
    public void setProjectHandle(ProjectHandle value) {
        this.projectHandle = value;
    }

    /**
     * Gets the value of the activityHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityHandle }
     *     
     */
    public ActivityHandle getActivityHandle() {
        return activityHandle;
    }

    /**
     * Sets the value of the activityHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityHandle }
     *     
     */
    public void setActivityHandle(ActivityHandle value) {
        this.activityHandle = value;
    }

    /**
     * Gets the value of the employeeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getEmployeeHandle() {
        return employeeHandle;
    }

    /**
     * Sets the value of the employeeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setEmployeeHandle(EmployeeHandle value) {
        this.employeeHandle = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the numberOfHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfHours() {
        return numberOfHours;
    }

    /**
     * Sets the value of the numberOfHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfHours(BigDecimal value) {
        this.numberOfHours = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     */
    public void setApproved(boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesPrice(BigDecimal value) {
        this.salesPrice = value;
    }

    /**
     * Gets the value of the costPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostPrice(BigDecimal value) {
        this.costPrice = value;
    }

}
