
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
 *         &lt;element name="TimeEntry_GetActivityResult" type="{http://e-conomic.com}ActivityHandle" minOccurs="0"/>
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
    "timeEntryGetActivityResult"
})
@XmlRootElement(name = "TimeEntry_GetActivityResponse")
public class TimeEntryGetActivityResponse {

    @XmlElement(name = "TimeEntry_GetActivityResult")
    protected ActivityHandle timeEntryGetActivityResult;

    /**
     * Gets the value of the timeEntryGetActivityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityHandle }
     *     
     */
    public ActivityHandle getTimeEntryGetActivityResult() {
        return timeEntryGetActivityResult;
    }

    /**
     * Sets the value of the timeEntryGetActivityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityHandle }
     *     
     */
    public void setTimeEntryGetActivityResult(ActivityHandle value) {
        this.timeEntryGetActivityResult = value;
    }

}
