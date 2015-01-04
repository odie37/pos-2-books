
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="activityHandle" type="{http://e-conomic.com}ActivityHandle" minOccurs="0"/>
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
    "activityHandle"
})
@XmlRootElement(name = "Activity_GetName")
public class ActivityGetName {

    protected ActivityHandle activityHandle;

    /**
     * Gets the value of the activityHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityHandle }
     *     
     */
    public ActivityHandle getActivityHandle() {
        return activityHandle;
    }

    /**
     * Sets the value of the activityHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityHandle }
     *     
     */
    public void setActivityHandle(ActivityHandle value) {
        this.activityHandle = value;
    }

}
