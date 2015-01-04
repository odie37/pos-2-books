
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
 *         &lt;element name="TimeEntry_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfTimeEntryData" minOccurs="0"/>
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
    "timeEntryGetDataArrayResult"
})
@XmlRootElement(name = "TimeEntry_GetDataArrayResponse")
public class TimeEntryGetDataArrayResponse {

    @XmlElement(name = "TimeEntry_GetDataArrayResult")
    protected ArrayOfTimeEntryData timeEntryGetDataArrayResult;

    /**
     * Gets the value of the timeEntryGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeEntryData }
     *     
     */
    public ArrayOfTimeEntryData getTimeEntryGetDataArrayResult() {
        return timeEntryGetDataArrayResult;
    }

    /**
     * Sets the value of the timeEntryGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeEntryData }
     *     
     */
    public void setTimeEntryGetDataArrayResult(ArrayOfTimeEntryData value) {
        this.timeEntryGetDataArrayResult = value;
    }

}
