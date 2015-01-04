
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
 *         &lt;element name="mileageEntryHandle" type="{http://e-conomic.com}MileageEntryHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "mileageEntryHandle",
    "valueHandle"
})
@XmlRootElement(name = "MileageEntry_SetEmployee")
public class MileageEntrySetEmployee {

    protected MileageEntryHandle mileageEntryHandle;
    protected EmployeeHandle valueHandle;

    /**
     * Gets the value of the mileageEntryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link MileageEntryHandle }
     *     
     */
    public MileageEntryHandle getMileageEntryHandle() {
        return mileageEntryHandle;
    }

    /**
     * Sets the value of the mileageEntryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageEntryHandle }
     *     
     */
    public void setMileageEntryHandle(MileageEntryHandle value) {
        this.mileageEntryHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setValueHandle(EmployeeHandle value) {
        this.valueHandle = value;
    }

}
