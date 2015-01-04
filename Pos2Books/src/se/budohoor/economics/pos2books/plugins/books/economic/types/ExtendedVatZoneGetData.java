
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="extendedVatZoneHandle" type="{http://e-conomic.com}ExtendedVatZoneHandle" minOccurs="0"/>
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
    "extendedVatZoneHandle"
})
@XmlRootElement(name = "ExtendedVatZone_GetData")
public class ExtendedVatZoneGetData {

    protected ExtendedVatZoneHandle extendedVatZoneHandle;

    /**
     * Gets the value of the extendedVatZoneHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public ExtendedVatZoneHandle getExtendedVatZoneHandle() {
        return extendedVatZoneHandle;
    }

    /**
     * Sets the value of the extendedVatZoneHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public void setExtendedVatZoneHandle(ExtendedVatZoneHandle value) {
        this.extendedVatZoneHandle = value;
    }

}
