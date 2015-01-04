
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
 *         &lt;element name="Project_GetAllUpdatedResult" type="{http://e-conomic.com}ArrayOfProjectHandle" minOccurs="0"/>
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
    "projectGetAllUpdatedResult"
})
@XmlRootElement(name = "Project_GetAllUpdatedResponse")
public class ProjectGetAllUpdatedResponse {

    @XmlElement(name = "Project_GetAllUpdatedResult")
    protected ArrayOfProjectHandle projectGetAllUpdatedResult;

    /**
     * Gets the value of the projectGetAllUpdatedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectHandle }
     *     
     */
    public ArrayOfProjectHandle getProjectGetAllUpdatedResult() {
        return projectGetAllUpdatedResult;
    }

    /**
     * Sets the value of the projectGetAllUpdatedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectHandle }
     *     
     */
    public void setProjectGetAllUpdatedResult(ArrayOfProjectHandle value) {
        this.projectGetAllUpdatedResult = value;
    }

}
