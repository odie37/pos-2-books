
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
 *         &lt;element name="extendedVatZoneHandles" type="{http://e-conomic.com}ArrayOfExtendedVatZoneHandle" minOccurs="0"/>
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
    "extendedVatZoneHandles"
})
@XmlRootElement(name = "ExtendedVatZone_GetDataArray")
public class ExtendedVatZoneGetDataArray {

    protected ArrayOfExtendedVatZoneHandle extendedVatZoneHandles;

    /**
     * Gets the value of the extendedVatZoneHandles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedVatZoneHandle }
     *     
     */
    public ArrayOfExtendedVatZoneHandle getExtendedVatZoneHandles() {
        return extendedVatZoneHandles;
    }

    /**
     * Sets the value of the extendedVatZoneHandles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedVatZoneHandle }
     *     
     */
    public void setExtendedVatZoneHandles(ArrayOfExtendedVatZoneHandle value) {
        this.extendedVatZoneHandles = value;
    }

}
