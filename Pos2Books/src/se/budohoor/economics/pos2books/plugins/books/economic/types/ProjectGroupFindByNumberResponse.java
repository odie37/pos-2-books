
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
 *         &lt;element name="ProjectGroup_FindByNumberResult" type="{http://e-conomic.com}ProjectGroupHandle" minOccurs="0"/>
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
    "projectGroupFindByNumberResult"
})
@XmlRootElement(name = "ProjectGroup_FindByNumberResponse")
public class ProjectGroupFindByNumberResponse {

    @XmlElement(name = "ProjectGroup_FindByNumberResult")
    protected ProjectGroupHandle projectGroupFindByNumberResult;

    /**
     * Gets the value of the projectGroupFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectGroupHandle }
     *     
     */
    public ProjectGroupHandle getProjectGroupFindByNumberResult() {
        return projectGroupFindByNumberResult;
    }

    /**
     * Sets the value of the projectGroupFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectGroupHandle }
     *     
     */
    public void setProjectGroupFindByNumberResult(ProjectGroupHandle value) {
        this.projectGroupFindByNumberResult = value;
    }

}
