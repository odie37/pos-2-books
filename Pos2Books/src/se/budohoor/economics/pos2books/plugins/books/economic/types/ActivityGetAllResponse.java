
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
 *         &lt;element name="Activity_GetAllResult" type="{http://e-conomic.com}ArrayOfActivityHandle" minOccurs="0"/>
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
    "activityGetAllResult"
})
@XmlRootElement(name = "Activity_GetAllResponse")
public class ActivityGetAllResponse {

    @XmlElement(name = "Activity_GetAllResult")
    protected ArrayOfActivityHandle activityGetAllResult;

    /**
     * Gets the value of the activityGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityHandle }
     *     
     */
    public ArrayOfActivityHandle getActivityGetAllResult() {
        return activityGetAllResult;
    }

    /**
     * Sets the value of the activityGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityHandle }
     *     
     */
    public void setActivityGetAllResult(ArrayOfActivityHandle value) {
        this.activityGetAllResult = value;
    }

}
