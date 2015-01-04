
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
 *         &lt;element name="projectGroupHandle" type="{http://e-conomic.com}ProjectGroupHandle" minOccurs="0"/>
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
    "projectGroupHandle"
})
@XmlRootElement(name = "ProjectGroup_GetNumber")
public class ProjectGroupGetNumber {

    protected ProjectGroupHandle projectGroupHandle;

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

}
