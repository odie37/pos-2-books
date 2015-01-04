
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
 *         &lt;element name="MileageEntry_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfMileageEntryHandle" minOccurs="0"/>
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
    "mileageEntryCreateFromDataArrayResult"
})
@XmlRootElement(name = "MileageEntry_CreateFromDataArrayResponse")
public class MileageEntryCreateFromDataArrayResponse {

    @XmlElement(name = "MileageEntry_CreateFromDataArrayResult")
    protected ArrayOfMileageEntryHandle mileageEntryCreateFromDataArrayResult;

    /**
     * Gets the value of the mileageEntryCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMileageEntryHandle }
     *     
     */
    public ArrayOfMileageEntryHandle getMileageEntryCreateFromDataArrayResult() {
        return mileageEntryCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the mileageEntryCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMileageEntryHandle }
     *     
     */
    public void setMileageEntryCreateFromDataArrayResult(ArrayOfMileageEntryHandle value) {
        this.mileageEntryCreateFromDataArrayResult = value;
    }

}
