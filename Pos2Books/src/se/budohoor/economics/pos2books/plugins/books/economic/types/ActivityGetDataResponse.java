
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
 *         &lt;element name="Activity_GetDataResult" type="{http://e-conomic.com}ActivityData" minOccurs="0"/>
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
    "activityGetDataResult"
})
@XmlRootElement(name = "Activity_GetDataResponse")
public class ActivityGetDataResponse {

    @XmlElement(name = "Activity_GetDataResult")
    protected ActivityData activityGetDataResult;

    /**
     * Gets the value of the activityGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityData }
     *     
     */
    public ActivityData getActivityGetDataResult() {
        return activityGetDataResult;
    }

    /**
     * Sets the value of the activityGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityData }
     *     
     */
    public void setActivityGetDataResult(ActivityData value) {
        this.activityGetDataResult = value;
    }

}
