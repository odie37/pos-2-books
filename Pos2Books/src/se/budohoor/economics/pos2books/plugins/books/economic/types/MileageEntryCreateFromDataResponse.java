
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
 *         &lt;element name="MileageEntry_CreateFromDataResult" type="{http://e-conomic.com}MileageEntryHandle" minOccurs="0"/>
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
    "mileageEntryCreateFromDataResult"
})
@XmlRootElement(name = "MileageEntry_CreateFromDataResponse")
public class MileageEntryCreateFromDataResponse {

    @XmlElement(name = "MileageEntry_CreateFromDataResult")
    protected MileageEntryHandle mileageEntryCreateFromDataResult;

    /**
     * Gets the value of the mileageEntryCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link MileageEntryHandle }
     *     
     */
    public MileageEntryHandle getMileageEntryCreateFromDataResult() {
        return mileageEntryCreateFromDataResult;
    }

    /**
     * Sets the value of the mileageEntryCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageEntryHandle }
     *     
     */
    public void setMileageEntryCreateFromDataResult(MileageEntryHandle value) {
        this.mileageEntryCreateFromDataResult = value;
    }

}
