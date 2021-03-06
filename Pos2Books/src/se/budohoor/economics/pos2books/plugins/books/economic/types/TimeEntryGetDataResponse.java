
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
 *         &lt;element name="TimeEntry_GetDataResult" type="{http://e-conomic.com}TimeEntryData" minOccurs="0"/>
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
    "timeEntryGetDataResult"
})
@XmlRootElement(name = "TimeEntry_GetDataResponse")
public class TimeEntryGetDataResponse {

    @XmlElement(name = "TimeEntry_GetDataResult")
    protected TimeEntryData timeEntryGetDataResult;

    /**
     * Gets the value of the timeEntryGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntryData }
     *     
     */
    public TimeEntryData getTimeEntryGetDataResult() {
        return timeEntryGetDataResult;
    }

    /**
     * Sets the value of the timeEntryGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntryData }
     *     
     */
    public void setTimeEntryGetDataResult(TimeEntryData value) {
        this.timeEntryGetDataResult = value;
    }

}
