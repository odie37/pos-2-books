
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
 *         &lt;element name="ProjectGroup_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfProjectGroupData" minOccurs="0"/>
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
    "projectGroupGetDataArrayResult"
})
@XmlRootElement(name = "ProjectGroup_GetDataArrayResponse")
public class ProjectGroupGetDataArrayResponse {

    @XmlElement(name = "ProjectGroup_GetDataArrayResult")
    protected ArrayOfProjectGroupData projectGroupGetDataArrayResult;

    /**
     * Gets the value of the projectGroupGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectGroupData }
     *     
     */
    public ArrayOfProjectGroupData getProjectGroupGetDataArrayResult() {
        return projectGroupGetDataArrayResult;
    }

    /**
     * Sets the value of the projectGroupGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectGroupData }
     *     
     */
    public void setProjectGroupGetDataArrayResult(ArrayOfProjectGroupData value) {
        this.projectGroupGetDataArrayResult = value;
    }

}
