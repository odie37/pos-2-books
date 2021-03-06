
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
 *         &lt;element name="Project_GetIsAccessibleResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "projectGetIsAccessibleResult"
})
@XmlRootElement(name = "Project_GetIsAccessibleResponse")
public class ProjectGetIsAccessibleResponse {

    @XmlElement(name = "Project_GetIsAccessibleResult")
    protected boolean projectGetIsAccessibleResult;

    /**
     * Gets the value of the projectGetIsAccessibleResult property.
     * 
     */
    public boolean isProjectGetIsAccessibleResult() {
        return projectGetIsAccessibleResult;
    }

    /**
     * Sets the value of the projectGetIsAccessibleResult property.
     * 
     */
    public void setProjectGetIsAccessibleResult(boolean value) {
        this.projectGetIsAccessibleResult = value;
    }

}
