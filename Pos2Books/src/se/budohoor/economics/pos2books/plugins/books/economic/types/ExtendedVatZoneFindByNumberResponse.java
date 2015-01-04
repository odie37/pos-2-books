
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
 *         &lt;element name="ExtendedVatZone_FindByNumberResult" type="{http://e-conomic.com}ExtendedVatZoneHandle" minOccurs="0"/>
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
    "extendedVatZoneFindByNumberResult"
})
@XmlRootElement(name = "ExtendedVatZone_FindByNumberResponse")
public class ExtendedVatZoneFindByNumberResponse {

    @XmlElement(name = "ExtendedVatZone_FindByNumberResult")
    protected ExtendedVatZoneHandle extendedVatZoneFindByNumberResult;

    /**
     * Gets the value of the extendedVatZoneFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public ExtendedVatZoneHandle getExtendedVatZoneFindByNumberResult() {
        return extendedVatZoneFindByNumberResult;
    }

    /**
     * Sets the value of the extendedVatZoneFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public void setExtendedVatZoneFindByNumberResult(ExtendedVatZoneHandle value) {
        this.extendedVatZoneFindByNumberResult = value;
    }

}
