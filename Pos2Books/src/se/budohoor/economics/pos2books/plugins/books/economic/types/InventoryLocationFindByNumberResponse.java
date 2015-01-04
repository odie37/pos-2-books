
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
 *         &lt;element name="InventoryLocation_FindByNumberResult" type="{http://e-conomic.com}InventoryLocationHandle" minOccurs="0"/>
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
    "inventoryLocationFindByNumberResult"
})
@XmlRootElement(name = "InventoryLocation_FindByNumberResponse")
public class InventoryLocationFindByNumberResponse {

    @XmlElement(name = "InventoryLocation_FindByNumberResult")
    protected InventoryLocationHandle inventoryLocationFindByNumberResult;

    /**
     * Gets the value of the inventoryLocationFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationHandle }
     *     
     */
    public InventoryLocationHandle getInventoryLocationFindByNumberResult() {
        return inventoryLocationFindByNumberResult;
    }

    /**
     * Sets the value of the inventoryLocationFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationHandle }
     *     
     */
    public void setInventoryLocationFindByNumberResult(InventoryLocationHandle value) {
        this.inventoryLocationFindByNumberResult = value;
    }

}
