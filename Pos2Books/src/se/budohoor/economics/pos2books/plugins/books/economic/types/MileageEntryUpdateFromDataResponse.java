
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
 *         &lt;element name="MileageEntry_UpdateFromDataResult" type="{http://e-conomic.com}MileageEntryHandle" minOccurs="0"/>
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
    "mileageEntryUpdateFromDataResult"
})
@XmlRootElement(name = "MileageEntry_UpdateFromDataResponse")
public class MileageEntryUpdateFromDataResponse {

    @XmlElement(name = "MileageEntry_UpdateFromDataResult")
    protected MileageEntryHandle mileageEntryUpdateFromDataResult;

    /**
     * Gets the value of the mileageEntryUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link MileageEntryHandle }
     *     
     */
    public MileageEntryHandle getMileageEntryUpdateFromDataResult() {
        return mileageEntryUpdateFromDataResult;
    }

    /**
     * Sets the value of the mileageEntryUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageEntryHandle }
     *     
     */
    public void setMileageEntryUpdateFromDataResult(MileageEntryHandle value) {
        this.mileageEntryUpdateFromDataResult = value;
    }

}
