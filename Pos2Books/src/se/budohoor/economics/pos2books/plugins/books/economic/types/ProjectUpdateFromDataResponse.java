
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
 *         &lt;element name="Project_UpdateFromDataResult" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
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
    "projectUpdateFromDataResult"
})
@XmlRootElement(name = "Project_UpdateFromDataResponse")
public class ProjectUpdateFromDataResponse {

    @XmlElement(name = "Project_UpdateFromDataResult")
    protected ProjectHandle projectUpdateFromDataResult;

    /**
     * Gets the value of the projectUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHandle }
     *     
     */
    public ProjectHandle getProjectUpdateFromDataResult() {
        return projectUpdateFromDataResult;
    }

    /**
     * Sets the value of the projectUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHandle }
     *     
     */
    public void setProjectUpdateFromDataResult(ProjectHandle value) {
        this.projectUpdateFromDataResult = value;
    }

}
