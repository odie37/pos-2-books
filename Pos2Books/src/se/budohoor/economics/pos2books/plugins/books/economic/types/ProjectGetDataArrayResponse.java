
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
 *         &lt;element name="Project_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfProjectData" minOccurs="0"/>
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
    "projectGetDataArrayResult"
})
@XmlRootElement(name = "Project_GetDataArrayResponse")
public class ProjectGetDataArrayResponse {

    @XmlElement(name = "Project_GetDataArrayResult")
    protected ArrayOfProjectData projectGetDataArrayResult;

    /**
     * Gets the value of the projectGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectData }
     *     
     */
    public ArrayOfProjectData getProjectGetDataArrayResult() {
        return projectGetDataArrayResult;
    }

    /**
     * Sets the value of the projectGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectData }
     *     
     */
    public void setProjectGetDataArrayResult(ArrayOfProjectData value) {
        this.projectGetDataArrayResult = value;
    }

}
