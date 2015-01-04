
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
 *         &lt;element name="unitHandle" type="{http://e-conomic.com}UnitHandle" minOccurs="0"/>
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
    "unitHandle"
})
@XmlRootElement(name = "Unit_GetName")
public class UnitGetName {

    protected UnitHandle unitHandle;

    /**
     * Gets the value of the unitHandle property.
     * 
     * @return
     *     possible object is
     *     {@link UnitHandle }
     *     
     */
    public UnitHandle getUnitHandle() {
        return unitHandle;
    }

    /**
     * Sets the value of the unitHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitHandle }
     *     
     */
    public void setUnitHandle(UnitHandle value) {
        this.unitHandle = value;
    }

}
