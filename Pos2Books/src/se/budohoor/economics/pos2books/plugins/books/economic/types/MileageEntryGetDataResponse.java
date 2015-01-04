
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
 *         &lt;element name="MileageEntry_GetDataResult" type="{http://e-conomic.com}MileageEntryData" minOccurs="0"/>
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
    "mileageEntryGetDataResult"
})
@XmlRootElement(name = "MileageEntry_GetDataResponse")
public class MileageEntryGetDataResponse {

    @XmlElement(name = "MileageEntry_GetDataResult")
    protected MileageEntryData mileageEntryGetDataResult;

    /**
     * Gets the value of the mileageEntryGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link MileageEntryData }
     *     
     */
    public MileageEntryData getMileageEntryGetDataResult() {
        return mileageEntryGetDataResult;
    }

    /**
     * Sets the value of the mileageEntryGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageEntryData }
     *     
     */
    public void setMileageEntryGetDataResult(MileageEntryData value) {
        this.mileageEntryGetDataResult = value;
    }

}
