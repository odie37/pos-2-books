
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
 *         &lt;element name="Activity_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfActivityData" minOccurs="0"/>
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
    "activityGetDataArrayResult"
})
@XmlRootElement(name = "Activity_GetDataArrayResponse")
public class ActivityGetDataArrayResponse {

    @XmlElement(name = "Activity_GetDataArrayResult")
    protected ArrayOfActivityData activityGetDataArrayResult;

    /**
     * Gets the value of the activityGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityData }
     *     
     */
    public ArrayOfActivityData getActivityGetDataArrayResult() {
        return activityGetDataArrayResult;
    }

    /**
     * Sets the value of the activityGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityData }
     *     
     */
    public void setActivityGetDataArrayResult(ArrayOfActivityData value) {
        this.activityGetDataArrayResult = value;
    }

}
