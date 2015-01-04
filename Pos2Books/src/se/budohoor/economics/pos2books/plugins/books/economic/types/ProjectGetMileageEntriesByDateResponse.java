
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
 *         &lt;element name="Project_GetMileageEntriesByDateResult" type="{http://e-conomic.com}ArrayOfMileageEntryHandle" minOccurs="0"/>
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
    "projectGetMileageEntriesByDateResult"
})
@XmlRootElement(name = "Project_GetMileageEntriesByDateResponse")
public class ProjectGetMileageEntriesByDateResponse {

    @XmlElement(name = "Project_GetMileageEntriesByDateResult")
    protected ArrayOfMileageEntryHandle projectGetMileageEntriesByDateResult;

    /**
     * Gets the value of the projectGetMileageEntriesByDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMileageEntryHandle }
     *     
     */
    public ArrayOfMileageEntryHandle getProjectGetMileageEntriesByDateResult() {
        return projectGetMileageEntriesByDateResult;
    }

    /**
     * Sets the value of the projectGetMileageEntriesByDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMileageEntryHandle }
     *     
     */
    public void setProjectGetMileageEntriesByDateResult(ArrayOfMileageEntryHandle value) {
        this.projectGetMileageEntriesByDateResult = value;
    }

}
