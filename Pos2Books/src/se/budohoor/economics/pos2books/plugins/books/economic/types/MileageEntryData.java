
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MileageEntryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MileageEntryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}MileageEntryHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProjectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="EmployeeHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SalesRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CostRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "MileageEntryData", propOrder = {
    "handle",
    "id",
    "projectHandle",
    "employeeHandle",
    "date",
    "startLocation",
    "endLocation",
    "distance",
    "approved",
    "salesRate",
    "costRate",
    "salesPrice",
    "costPrice"
})
public class MileageEntryData {

    @XmlElement(name = "Handle")
    protected MileageEntryHandle handle;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "ProjectHandle")
    protected ProjectHandle projectHandle;
    @XmlElement(name = "EmployeeHandle")
    protected EmployeeHandle employeeHandle;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "StartLocation")
    protected String startLocation;
    @XmlElement(name = "EndLocation")
    protected String endLocation;
    @XmlElement(name = "Distance", required = true)
    protected BigDecimal distance;
    @XmlElement(name = "Approved")
    protected boolean approved;
    @XmlElement(name = "SalesRate", required = true, nillable = true)
    protected BigDecimal salesRate;
    @XmlElement(name = "CostRate", required = true, nillable = true)
    protected BigDecimal costRate;
    @XmlElement(name = "SalesPrice")
    protected BigDecimal salesPrice;
    @XmlElement(name = "CostPrice")
    protected BigDecimal costPrice;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link MileageEntryHandle }
     *     
     */
    public MileageEntryHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageEntryHandle }
     *     
     */
    public void setHandle(MileageEntryHandle value) {
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
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLocation(String value) {
        this.startLocation = value;
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLocation(String value) {
        this.endLocation = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
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
     * Gets the value of the salesRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesRate() {
        return salesRate;
    }

    /**
     * Sets the value of the salesRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesRate(BigDecimal value) {
        this.salesRate = value;
    }

    /**
     * Gets the value of the costRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostRate() {
        return costRate;
    }

    /**
     * Sets the value of the costRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostRate(BigDecimal value) {
        this.costRate = value;
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
