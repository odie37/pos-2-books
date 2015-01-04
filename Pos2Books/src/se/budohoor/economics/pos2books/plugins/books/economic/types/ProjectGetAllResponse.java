
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
 *         &lt;element name="Project_GetAllResult" type="{http://e-conomic.com}ArrayOfProjectHandle" minOccurs="0"/>
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
    "projectGetAllResult"
})
@XmlRootElement(name = "Project_GetAllResponse")
public class ProjectGetAllResponse {

    @XmlElement(name = "Project_GetAllResult")
    protected ArrayOfProjectHandle projectGetAllResult;

    /**
     * Gets the value of the projectGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectHandle }
     *     
     */
    public ArrayOfProjectHandle getProjectGetAllResult() {
        return projectGetAllResult;
    }

    /**
     * Sets the value of the projectGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectHandle }
     *     
     */
    public void setProjectGetAllResult(ArrayOfProjectHandle value) {
        this.projectGetAllResult = value;
    }

}
