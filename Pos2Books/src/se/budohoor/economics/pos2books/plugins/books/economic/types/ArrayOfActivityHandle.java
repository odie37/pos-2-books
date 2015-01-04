
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActivityHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActivityHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityHandle" type="{http://e-conomic.com}ActivityHandle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActivityHandle", propOrder = {
    "activityHandle"
})
public class ArrayOfActivityHandle {

    @XmlElement(name = "ActivityHandle", nillable = true)
    protected List<ActivityHandle> activityHandle;

    /**
     * Gets the value of the activityHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityHandle }
     * 
     * 
     */
    public List<ActivityHandle> getActivityHandle() {
        if (activityHandle == null) {
            activityHandle = new ArrayList<ActivityHandle>();
        }
        return this.activityHandle;
    }

}
