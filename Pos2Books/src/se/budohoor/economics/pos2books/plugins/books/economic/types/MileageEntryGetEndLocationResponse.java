
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
 *         &lt;element name="MileageEntry_GetEndLocationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mileageEntryGetEndLocationResult"
})
@XmlRootElement(name = "MileageEntry_GetEndLocationResponse")
public class MileageEntryGetEndLocationResponse {

    @XmlElement(name = "MileageEntry_GetEndLocationResult")
    protected String mileageEntryGetEndLocationResult;

    /**
     * Gets the value of the mileageEntryGetEndLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileageEntryGetEndLocationResult() {
        return mileageEntryGetEndLocationResult;
    }

    /**
     * Sets the value of the mileageEntryGetEndLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileageEntryGetEndLocationResult(String value) {
        this.mileageEntryGetEndLocationResult = value;
    }

}
