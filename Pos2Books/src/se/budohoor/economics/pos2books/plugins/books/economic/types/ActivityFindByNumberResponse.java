
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
 *         &lt;element name="Activity_FindByNumberResult" type="{http://e-conomic.com}ActivityHandle" minOccurs="0"/>
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
    "activityFindByNumberResult"
})
@XmlRootElement(name = "Activity_FindByNumberResponse")
public class ActivityFindByNumberResponse {

    @XmlElement(name = "Activity_FindByNumberResult")
    protected ActivityHandle activityFindByNumberResult;

    /**
     * Gets the value of the activityFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityHandle }
     *     
     */
    public ActivityHandle getActivityFindByNumberResult() {
        return activityFindByNumberResult;
    }

    /**
     * Sets the value of the activityFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityHandle }
     *     
     */
    public void setActivityFindByNumberResult(ActivityHandle value) {
        this.activityFindByNumberResult = value;
    }

}
