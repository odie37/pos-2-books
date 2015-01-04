
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
 *         &lt;element name="ExtendedVatZone_GetDataResult" type="{http://e-conomic.com}ExtendedVatZoneData" minOccurs="0"/>
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
    "extendedVatZoneGetDataResult"
})
@XmlRootElement(name = "ExtendedVatZone_GetDataResponse")
public class ExtendedVatZoneGetDataResponse {

    @XmlElement(name = "ExtendedVatZone_GetDataResult")
    protected ExtendedVatZoneData extendedVatZoneGetDataResult;

    /**
     * Gets the value of the extendedVatZoneGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedVatZoneData }
     *     
     */
    public ExtendedVatZoneData getExtendedVatZoneGetDataResult() {
        return extendedVatZoneGetDataResult;
    }

    /**
     * Sets the value of the extendedVatZoneGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedVatZoneData }
     *     
     */
    public void setExtendedVatZoneGetDataResult(ExtendedVatZoneData value) {
        this.extendedVatZoneGetDataResult = value;
    }

}
