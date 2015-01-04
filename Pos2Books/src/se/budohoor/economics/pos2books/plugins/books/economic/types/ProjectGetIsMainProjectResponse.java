
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
 *         &lt;element name="Project_GetIsMainProjectResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "projectGetIsMainProjectResult"
})
@XmlRootElement(name = "Project_GetIsMainProjectResponse")
public class ProjectGetIsMainProjectResponse {

    @XmlElement(name = "Project_GetIsMainProjectResult")
    protected boolean projectGetIsMainProjectResult;

    /**
     * Gets the value of the projectGetIsMainProjectResult property.
     * 
     */
    public boolean isProjectGetIsMainProjectResult() {
        return projectGetIsMainProjectResult;
    }

    /**
     * Sets the value of the projectGetIsMainProjectResult property.
     * 
     */
    public void setProjectGetIsMainProjectResult(boolean value) {
        this.projectGetIsMainProjectResult = value;
    }

}
