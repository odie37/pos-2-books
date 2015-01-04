
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
 *         &lt;element name="timeEntryHandle" type="{http://e-conomic.com}TimeEntryHandle" minOccurs="0"/>
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
    "timeEntryHandle"
})
@XmlRootElement(name = "TimeEntry_GetNumberOfHours")
public class TimeEntryGetNumberOfHours {

    protected TimeEntryHandle timeEntryHandle;

    /**
     * Gets the value of the timeEntryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntryHandle }
     *     
     */
    public TimeEntryHandle getTimeEntryHandle() {
        return timeEntryHandle;
    }

    /**
     * Sets the value of the timeEntryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntryHandle }
     *     
     */
    public void setTimeEntryHandle(TimeEntryHandle value) {
        this.timeEntryHandle = value;
    }

}
