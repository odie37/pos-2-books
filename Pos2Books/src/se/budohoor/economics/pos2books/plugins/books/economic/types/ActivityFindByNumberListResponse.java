
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
 *         &lt;element name="Activity_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfActivityHandle" minOccurs="0"/>
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
    "activityFindByNumberListResult"
})
@XmlRootElement(name = "Activity_FindByNumberListResponse")
public class ActivityFindByNumberListResponse {

    @XmlElement(name = "Activity_FindByNumberListResult")
    protected ArrayOfActivityHandle activityFindByNumberListResult;

    /**
     * Gets the value of the activityFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityHandle }
     *     
     */
    public ArrayOfActivityHandle getActivityFindByNumberListResult() {
        return activityFindByNumberListResult;
    }

    /**
     * Sets the value of the activityFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityHandle }
     *     
     */
    public void setActivityFindByNumberListResult(ArrayOfActivityHandle value) {
        this.activityFindByNumberListResult = value;
    }

}
