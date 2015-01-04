
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
 *         &lt;element name="TimeEntry_GetEmployeeResult" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "timeEntryGetEmployeeResult"
})
@XmlRootElement(name = "TimeEntry_GetEmployeeResponse")
public class TimeEntryGetEmployeeResponse {

    @XmlElement(name = "TimeEntry_GetEmployeeResult")
    protected EmployeeHandle timeEntryGetEmployeeResult;

    /**
     * Gets the value of the timeEntryGetEmployeeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getTimeEntryGetEmployeeResult() {
        return timeEntryGetEmployeeResult;
    }

    /**
     * Sets the value of the timeEntryGetEmployeeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setTimeEntryGetEmployeeResult(EmployeeHandle value) {
        this.timeEntryGetEmployeeResult = value;
    }

}
