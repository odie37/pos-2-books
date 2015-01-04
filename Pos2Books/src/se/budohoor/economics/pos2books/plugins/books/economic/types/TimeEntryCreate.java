
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
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
 *         &lt;element name="projectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="activityHandle" type="{http://e-conomic.com}ActivityHandle" minOccurs="0"/>
 *         &lt;element name="employeeHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfHours" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "projectHandle",
    "activityHandle",
    "employeeHandle",
    "date",
    "text",
    "numberOfHours"
})
@XmlRootElement(name = "TimeEntry_Create")
public class TimeEntryCreate {

    protected ProjectHandle projectHandle;
    protected ActivityHandle activityHandle;
    protected EmployeeHandle employeeHandle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected String text;
    @XmlElement(required = true)
    protected BigDecimal numberOfHours;

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

}
