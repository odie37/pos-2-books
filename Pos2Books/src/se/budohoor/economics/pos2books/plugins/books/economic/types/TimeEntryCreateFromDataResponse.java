
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
 *         &lt;element name="TimeEntry_CreateFromDataResult" type="{http://e-conomic.com}TimeEntryHandle" minOccurs="0"/>
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
    "timeEntryCreateFromDataResult"
})
@XmlRootElement(name = "TimeEntry_CreateFromDataResponse")
public class TimeEntryCreateFromDataResponse {

    @XmlElement(name = "TimeEntry_CreateFromDataResult")
    protected TimeEntryHandle timeEntryCreateFromDataResult;

    /**
     * Gets the value of the timeEntryCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntryHandle }
     *     
     */
    public TimeEntryHandle getTimeEntryCreateFromDataResult() {
        return timeEntryCreateFromDataResult;
    }

    /**
     * Sets the value of the timeEntryCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntryHandle }
     *     
     */
    public void setTimeEntryCreateFromDataResult(TimeEntryHandle value) {
        this.timeEntryCreateFromDataResult = value;
    }

}
