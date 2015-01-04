
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
 *         &lt;element name="MileageEntry_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfMileageEntryData" minOccurs="0"/>
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
    "mileageEntryGetDataArrayResult"
})
@XmlRootElement(name = "MileageEntry_GetDataArrayResponse")
public class MileageEntryGetDataArrayResponse {

    @XmlElement(name = "MileageEntry_GetDataArrayResult")
    protected ArrayOfMileageEntryData mileageEntryGetDataArrayResult;

    /**
     * Gets the value of the mileageEntryGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMileageEntryData }
     *     
     */
    public ArrayOfMileageEntryData getMileageEntryGetDataArrayResult() {
        return mileageEntryGetDataArrayResult;
    }

    /**
     * Sets the value of the mileageEntryGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMileageEntryData }
     *     
     */
    public void setMileageEntryGetDataArrayResult(ArrayOfMileageEntryData value) {
        this.mileageEntryGetDataArrayResult = value;
    }

}
