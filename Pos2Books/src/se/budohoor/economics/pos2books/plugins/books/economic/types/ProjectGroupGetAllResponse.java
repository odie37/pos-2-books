
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
 *         &lt;element name="ProjectGroup_GetAllResult" type="{http://e-conomic.com}ArrayOfProjectGroupHandle" minOccurs="0"/>
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
    "projectGroupGetAllResult"
})
@XmlRootElement(name = "ProjectGroup_GetAllResponse")
public class ProjectGroupGetAllResponse {

    @XmlElement(name = "ProjectGroup_GetAllResult")
    protected ArrayOfProjectGroupHandle projectGroupGetAllResult;

    /**
     * Gets the value of the projectGroupGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectGroupHandle }
     *     
     */
    public ArrayOfProjectGroupHandle getProjectGroupGetAllResult() {
        return projectGroupGetAllResult;
    }

    /**
     * Sets the value of the projectGroupGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectGroupHandle }
     *     
     */
    public void setProjectGroupGetAllResult(ArrayOfProjectGroupHandle value) {
        this.projectGroupGetAllResult = value;
    }

}
