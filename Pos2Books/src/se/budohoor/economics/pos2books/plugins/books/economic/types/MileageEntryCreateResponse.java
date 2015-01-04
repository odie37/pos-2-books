
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
 *         &lt;element name="MileageEntry_CreateResult" type="{http://e-conomic.com}MileageEntryHandle" minOccurs="0"/>
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
    "mileageEntryCreateResult"
})
@XmlRootElement(name = "MileageEntry_CreateResponse")
public class MileageEntryCreateResponse {

    @XmlElement(name = "MileageEntry_CreateResult")
    protected MileageEntryHandle mileageEntryCreateResult;

    /**
     * Gets the value of the mileageEntryCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link MileageEntryHandle }
     *     
     */
    public MileageEntryHandle getMileageEntryCreateResult() {
        return mileageEntryCreateResult;
    }

    /**
     * Sets the value of the mileageEntryCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageEntryHandle }
     *     
     */
    public void setMileageEntryCreateResult(MileageEntryHandle value) {
        this.mileageEntryCreateResult = value;
    }

}
