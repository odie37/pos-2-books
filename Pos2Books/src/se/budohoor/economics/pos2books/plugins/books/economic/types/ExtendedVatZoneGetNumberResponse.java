
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
 *         &lt;element name="ExtendedVatZone_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "extendedVatZoneGetNumberResult"
})
@XmlRootElement(name = "ExtendedVatZone_GetNumberResponse")
public class ExtendedVatZoneGetNumberResponse {

    @XmlElement(name = "ExtendedVatZone_GetNumberResult")
    protected String extendedVatZoneGetNumberResult;

    /**
     * Gets the value of the extendedVatZoneGetNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedVatZoneGetNumberResult() {
        return extendedVatZoneGetNumberResult;
    }

    /**
     * Sets the value of the extendedVatZoneGetNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedVatZoneGetNumberResult(String value) {
        this.extendedVatZoneGetNumberResult = value;
    }

}
