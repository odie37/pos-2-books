
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
 *         &lt;element name="ProjectGroup_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "projectGroupGetNumberResult"
})
@XmlRootElement(name = "ProjectGroup_GetNumberResponse")
public class ProjectGroupGetNumberResponse {

    @XmlElement(name = "ProjectGroup_GetNumberResult")
    protected int projectGroupGetNumberResult;

    /**
     * Gets the value of the projectGroupGetNumberResult property.
     * 
     */
    public int getProjectGroupGetNumberResult() {
        return projectGroupGetNumberResult;
    }

    /**
     * Sets the value of the projectGroupGetNumberResult property.
     * 
     */
    public void setProjectGroupGetNumberResult(int value) {
        this.projectGroupGetNumberResult = value;
    }

}
