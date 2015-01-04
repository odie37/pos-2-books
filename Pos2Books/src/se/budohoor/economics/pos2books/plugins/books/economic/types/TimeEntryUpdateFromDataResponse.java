
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
 *         &lt;element name="TimeEntry_UpdateFromDataResult" type="{http://e-conomic.com}TimeEntryHandle" minOccurs="0"/>
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
    "timeEntryUpdateFromDataResult"
})
@XmlRootElement(name = "TimeEntry_UpdateFromDataResponse")
public class TimeEntryUpdateFromDataResponse {

    @XmlElement(name = "TimeEntry_UpdateFromDataResult")
    protected TimeEntryHandle timeEntryUpdateFromDataResult;

    /**
     * Gets the value of the timeEntryUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntryHandle }
     *     
     */
    public TimeEntryHandle getTimeEntryUpdateFromDataResult() {
        return timeEntryUpdateFromDataResult;
    }

    /**
     * Sets the value of the timeEntryUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntryHandle }
     *     
     */
    public void setTimeEntryUpdateFromDataResult(TimeEntryHandle value) {
        this.timeEntryUpdateFromDataResult = value;
    }

}
