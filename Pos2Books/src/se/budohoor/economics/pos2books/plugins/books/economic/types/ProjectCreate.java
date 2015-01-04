
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectGroupHandle" type="{http://e-conomic.com}ProjectGroupHandle" minOccurs="0"/>
 *         &lt;element name="isMainProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mainProjectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="debtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="responsibleHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "number",
    "name",
    "projectGroupHandle",
    "isMainProject",
    "mainProjectHandle",
    "debtorHandle",
    "responsibleHandle"
})
@XmlRootElement(name = "Project_Create")
public class ProjectCreate {

    protected int number;
    protected String name;
    protected ProjectGroupHandle projectGroupHandle;
    protected boolean isMainProject;
    protected ProjectHandle mainProjectHandle;
    protected DebtorHandle debtorHandle;
    protected EmployeeHandle responsibleHandle;

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

}
