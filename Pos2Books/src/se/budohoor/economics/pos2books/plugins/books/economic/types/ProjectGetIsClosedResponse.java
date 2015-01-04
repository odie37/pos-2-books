
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
 *         &lt;element name="Project_GetIsClosedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "projectGetIsClosedResult"
})
@XmlRootElement(name = "Project_GetIsClosedResponse")
public class ProjectGetIsClosedResponse {

    @XmlElement(name = "Project_GetIsClosedResult")
    protected boolean projectGetIsClosedResult;

    /**
     * Gets the value of the projectGetIsClosedResult property.
     * 
     */
    public boolean isProjectGetIsClosedResult() {
        return projectGetIsClosedResult;
    }

    /**
     * Sets the value of the projectGetIsClosedResult property.
     * 
     */
    public void setProjectGetIsClosedResult(boolean value) {
        this.projectGetIsClosedResult = value;
    }

}
