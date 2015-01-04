
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
 *         &lt;element name="InventoryLocation_GetAllResult" type="{http://e-conomic.com}ArrayOfInventoryLocationHandle" minOccurs="0"/>
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
    "inventoryLocationGetAllResult"
})
@XmlRootElement(name = "InventoryLocation_GetAllResponse")
public class InventoryLocationGetAllResponse {

    @XmlElement(name = "InventoryLocation_GetAllResult")
    protected ArrayOfInventoryLocationHandle inventoryLocationGetAllResult;

    /**
     * Gets the value of the inventoryLocationGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInventoryLocationHandle }
     *     
     */
    public ArrayOfInventoryLocationHandle getInventoryLocationGetAllResult() {
        return inventoryLocationGetAllResult;
    }

    /**
     * Sets the value of the inventoryLocationGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInventoryLocationHandle }
     *     
     */
    public void setInventoryLocationGetAllResult(ArrayOfInventoryLocationHandle value) {
        this.inventoryLocationGetAllResult = value;
    }

}
