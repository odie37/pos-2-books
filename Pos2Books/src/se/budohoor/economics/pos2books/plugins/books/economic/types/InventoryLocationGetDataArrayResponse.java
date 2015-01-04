
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
 *         &lt;element name="InventoryLocation_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfInventoryLocationData" minOccurs="0"/>
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
    "inventoryLocationGetDataArrayResult"
})
@XmlRootElement(name = "InventoryLocation_GetDataArrayResponse")
public class InventoryLocationGetDataArrayResponse {

    @XmlElement(name = "InventoryLocation_GetDataArrayResult")
    protected ArrayOfInventoryLocationData inventoryLocationGetDataArrayResult;

    /**
     * Gets the value of the inventoryLocationGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInventoryLocationData }
     *     
     */
    public ArrayOfInventoryLocationData getInventoryLocationGetDataArrayResult() {
        return inventoryLocationGetDataArrayResult;
    }

    /**
     * Sets the value of the inventoryLocationGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInventoryLocationData }
     *     
     */
    public void setInventoryLocationGetDataArrayResult(ArrayOfInventoryLocationData value) {
        this.inventoryLocationGetDataArrayResult = value;
    }

}
