
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
 *         &lt;element name="Project_GetTimeEntriesByDateResult" type="{http://e-conomic.com}ArrayOfTimeEntryHandle" minOccurs="0"/>
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
    "projectGetTimeEntriesByDateResult"
})
@XmlRootElement(name = "Project_GetTimeEntriesByDateResponse")
public class ProjectGetTimeEntriesByDateResponse {

    @XmlElement(name = "Project_GetTimeEntriesByDateResult")
    protected ArrayOfTimeEntryHandle projectGetTimeEntriesByDateResult;

    /**
     * Gets the value of the projectGetTimeEntriesByDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeEntryHandle }
     *     
     */
    public ArrayOfTimeEntryHandle getProjectGetTimeEntriesByDateResult() {
        return projectGetTimeEntriesByDateResult;
    }

    /**
     * Sets the value of the projectGetTimeEntriesByDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeEntryHandle }
     *     
     */
    public void setProjectGetTimeEntriesByDateResult(ArrayOfTimeEntryHandle value) {
        this.projectGetTimeEntriesByDateResult = value;
    }

}
