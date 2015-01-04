
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
 *         &lt;element name="ExtendedVatZone_GetAllResult" type="{http://e-conomic.com}ArrayOfExtendedVatZoneHandle" minOccurs="0"/>
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
    "extendedVatZoneGetAllResult"
})
@XmlRootElement(name = "ExtendedVatZone_GetAllResponse")
public class ExtendedVatZoneGetAllResponse {

    @XmlElement(name = "ExtendedVatZone_GetAllResult")
    protected ArrayOfExtendedVatZoneHandle extendedVatZoneGetAllResult;

    /**
     * Gets the value of the extendedVatZoneGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedVatZoneHandle }
     *     
     */
    public ArrayOfExtendedVatZoneHandle getExtendedVatZoneGetAllResult() {
        return extendedVatZoneGetAllResult;
    }

    /**
     * Sets the value of the extendedVatZoneGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedVatZoneHandle }
     *     
     */
    public void setExtendedVatZoneGetAllResult(ArrayOfExtendedVatZoneHandle value) {
        this.extendedVatZoneGetAllResult = value;
    }

}
