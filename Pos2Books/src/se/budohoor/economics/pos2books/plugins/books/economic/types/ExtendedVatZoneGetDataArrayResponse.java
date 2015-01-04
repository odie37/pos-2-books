
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
 *         &lt;element name="ExtendedVatZone_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfExtendedVatZoneData" minOccurs="0"/>
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
    "extendedVatZoneGetDataArrayResult"
})
@XmlRootElement(name = "ExtendedVatZone_GetDataArrayResponse")
public class ExtendedVatZoneGetDataArrayResponse {

    @XmlElement(name = "ExtendedVatZone_GetDataArrayResult")
    protected ArrayOfExtendedVatZoneData extendedVatZoneGetDataArrayResult;

    /**
     * Gets the value of the extendedVatZoneGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedVatZoneData }
     *     
     */
    public ArrayOfExtendedVatZoneData getExtendedVatZoneGetDataArrayResult() {
        return extendedVatZoneGetDataArrayResult;
    }

    /**
     * Sets the value of the extendedVatZoneGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedVatZoneData }
     *     
     */
    public void setExtendedVatZoneGetDataArrayResult(ArrayOfExtendedVatZoneData value) {
        this.extendedVatZoneGetDataArrayResult = value;
    }

}
