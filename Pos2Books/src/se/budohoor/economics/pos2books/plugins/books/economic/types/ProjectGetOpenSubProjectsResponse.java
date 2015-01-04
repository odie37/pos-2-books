
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
 *         &lt;element name="Project_GetOpenSubProjectsResult" type="{http://e-conomic.com}ArrayOfProjectHandle" minOccurs="0"/>
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
    "projectGetOpenSubProjectsResult"
})
@XmlRootElement(name = "Project_GetOpenSubProjectsResponse")
public class ProjectGetOpenSubProjectsResponse {

    @XmlElement(name = "Project_GetOpenSubProjectsResult")
    protected ArrayOfProjectHandle projectGetOpenSubProjectsResult;

    /**
     * Gets the value of the projectGetOpenSubProjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectHandle }
     *     
     */
    public ArrayOfProjectHandle getProjectGetOpenSubProjectsResult() {
        return projectGetOpenSubProjectsResult;
    }

    /**
     * Sets the value of the projectGetOpenSubProjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectHandle }
     *     
     */
    public void setProjectGetOpenSubProjectsResult(ArrayOfProjectHandle value) {
        this.projectGetOpenSubProjectsResult = value;
    }

}
