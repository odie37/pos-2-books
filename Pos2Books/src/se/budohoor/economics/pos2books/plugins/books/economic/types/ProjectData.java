
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectGroupHandle" type="{http://e-conomic.com}ProjectGroupHandle" minOccurs="0"/>
 *         &lt;element name="IsMainProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MainProjectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="DebtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="ResponsibleHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAccessible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Mileage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IsClosed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectData", propOrder = {
    "handle",
    "number",
    "name",
    "projectGroupHandle",
    "isMainProject",
    "mainProjectHandle",
    "debtorHandle",
    "responsibleHandle",
    "description",
    "isAccessible",
    "mileage",
    "isClosed"
})
public class ProjectData {

    @XmlElement(name = "Handle")
    protected ProjectHandle handle;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ProjectGroupHandle")
    protected ProjectGroupHandle projectGroupHandle;
    @XmlElement(name = "IsMainProject")
    protected boolean isMainProject;
    @XmlElement(name = "MainProjectHandle")
    protected ProjectHandle mainProjectHandle;
    @XmlElement(name = "DebtorHandle")
    protected DebtorHandle debtorHandle;
    @XmlElement(name = "ResponsibleHandle")
    protected EmployeeHandle responsibleHandle;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsAccessible")
    protected boolean isAccessible;
    @XmlElement(name = "Mileage", required = true)
    protected BigDecimal mileage;
    @XmlElement(name = "IsClosed")
    protected boolean isClosed;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHandle }
     *     
     */
    public ProjectHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHandle }
     *     
     */
    public void setHandle(ProjectHandle value) {
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the projectGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectGroupHandle }
     *     
     */
    public ProjectGroupHandle getProjectGroupHandle() {
        return projectGroupHandle;
    }

    /**
     * Sets the value of the projectGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectGroupHandle }
     *     
     */
    public void setProjectGroupHandle(ProjectGroupHandle value) {
        this.projectGroupHandle = value;
    }

    /**
     * Gets the value of the isMainProject property.
     * 
     */
    public boolean isIsMainProject() {
        return isMainProject;
    }

    /**
     * Sets the value of the isMainProject property.
     * 
     */
    public void setIsMainProject(boolean value) {
        this.isMainProject = value;
    }

    /**
     * Gets the value of the mainProjectHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHandle }
     *     
     */
    public ProjectHandle getMainProjectHandle() {
        return mainProjectHandle;
    }

    /**
     * Sets the value of the mainProjectHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHandle }
     *     
     */
    public void setMainProjectHandle(ProjectHandle value) {
        this.mainProjectHandle = value;
    }

    /**
     * Gets the value of the debtorHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getDebtorHandle() {
        return debtorHandle;
    }

    /**
     * Sets the value of the debtorHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setDebtorHandle(DebtorHandle value) {
        this.debtorHandle = value;
    }

    /**
     * Gets the value of the responsibleHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getResponsibleHandle() {
        return responsibleHandle;
    }

    /**
     * Sets the value of the responsibleHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setResponsibleHandle(EmployeeHandle value) {
        this.responsibleHandle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isAccessible property.
     * 
     */
    public boolean isIsAccessible() {
        return isAccessible;
    }

    /**
     * Sets the value of the isAccessible property.
     * 
     */
    public void setIsAccessible(boolean value) {
        this.isAccessible = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMileage(BigDecimal value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     */
    public boolean isIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     */
    public void setIsClosed(boolean value) {
        this.isClosed = value;
    }

}
