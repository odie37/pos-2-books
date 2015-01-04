
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
 *         &lt;element name="Project_GetActivitiesResult" type="{http://e-conomic.com}ArrayOfActivityHandle" minOccurs="0"/>
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
    "projectGetActivitiesResult"
})
@XmlRootElement(name = "Project_GetActivitiesResponse")
public class ProjectGetActivitiesResponse {

    @XmlElement(name = "Project_GetActivitiesResult")
    protected ArrayOfActivityHandle projectGetActivitiesResult;

    /**
     * Gets the value of the projectGetActivitiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityHandle }
     *     
     */
    public ArrayOfActivityHandle getProjectGetActivitiesResult() {
        return projectGetActivitiesResult;
    }

    /**
     * Sets the value of the projectGetActivitiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityHandle }
     *     
     */
    public void setProjectGetActivitiesResult(ArrayOfActivityHandle value) {
        this.projectGetActivitiesResult = value;
    }

}
