
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
 *         &lt;element name="TimeEntry_GetAllResult" type="{http://e-conomic.com}ArrayOfTimeEntryHandle" minOccurs="0"/>
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
    "timeEntryGetAllResult"
})
@XmlRootElement(name = "TimeEntry_GetAllResponse")
public class TimeEntryGetAllResponse {

    @XmlElement(name = "TimeEntry_GetAllResult")
    protected ArrayOfTimeEntryHandle timeEntryGetAllResult;

    /**
     * Gets the value of the timeEntryGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeEntryHandle }
     *     
     */
    public ArrayOfTimeEntryHandle getTimeEntryGetAllResult() {
        return timeEntryGetAllResult;
    }

    /**
     * Sets the value of the timeEntryGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeEntryHandle }
     *     
     */
    public void setTimeEntryGetAllResult(ArrayOfTimeEntryHandle value) {
        this.timeEntryGetAllResult = value;
    }

}
