
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTimeEntryHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimeEntryHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeEntryHandle" type="{http://e-conomic.com}TimeEntryHandle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimeEntryHandle", propOrder = {
    "timeEntryHandle"
})
public class ArrayOfTimeEntryHandle {

    @XmlElement(name = "TimeEntryHandle", nillable = true)
    protected List<TimeEntryHandle> timeEntryHandle;

    /**
     * Gets the value of the timeEntryHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeEntryHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeEntryHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeEntryHandle }
     * 
     * 
     */
    public List<TimeEntryHandle> getTimeEntryHandle() {
        if (timeEntryHandle == null) {
            timeEntryHandle = new ArrayList<TimeEntryHandle>();
        }
        return this.timeEntryHandle;
    }

}
