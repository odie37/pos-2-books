
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
 *         &lt;element name="MileageEntry_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfMileageEntryHandle" minOccurs="0"/>
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
    "mileageEntryUpdateFromDataArrayResult"
})
@XmlRootElement(name = "MileageEntry_UpdateFromDataArrayResponse")
public class MileageEntryUpdateFromDataArrayResponse {

    @XmlElement(name = "MileageEntry_UpdateFromDataArrayResult")
    protected ArrayOfMileageEntryHandle mileageEntryUpdateFromDataArrayResult;

    /**
     * Gets the value of the mileageEntryUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMileageEntryHandle }
     *     
     */
    public ArrayOfMileageEntryHandle getMileageEntryUpdateFromDataArrayResult() {
        return mileageEntryUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the mileageEntryUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMileageEntryHandle }
     *     
     */
    public void setMileageEntryUpdateFromDataArrayResult(ArrayOfMileageEntryHandle value) {
        this.mileageEntryUpdateFromDataArrayResult = value;
    }

}
