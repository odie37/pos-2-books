
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
 *         &lt;element name="projectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}ProjectGroupHandle" minOccurs="0"/>
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
    "valueHandle"
})
@XmlRootElement(name = "Project_SetProjectGroup")
public class ProjectSetProjectGroup {

    protected ProjectHandle projectHandle;
    protected ProjectGroupHandle valueHandle;

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
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectGroupHandle }
     *     
     */
    public ProjectGroupHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectGroupHandle }
     *     
     */
    public void setValueHandle(ProjectGroupHandle value) {
        this.valueHandle = value;
    }

}
