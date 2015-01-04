
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
 *         &lt;element name="Project_GetDataResult" type="{http://e-conomic.com}ProjectData" minOccurs="0"/>
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
    "projectGetDataResult"
})
@XmlRootElement(name = "Project_GetDataResponse")
public class ProjectGetDataResponse {

    @XmlElement(name = "Project_GetDataResult")
    protected ProjectData projectGetDataResult;

    /**
     * Gets the value of the projectGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectData }
     *     
     */
    public ProjectData getProjectGetDataResult() {
        return projectGetDataResult;
    }

    /**
     * Sets the value of the projectGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectData }
     *     
     */
    public void setProjectGetDataResult(ProjectData value) {
        this.projectGetDataResult = value;
    }

}
