
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
 *         &lt;element name="entityHandle" type="{http://e-conomic.com}UnitHandle" minOccurs="0"/>
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
    "entityHandle"
})
@XmlRootElement(name = "Unit_GetData")
public class UnitGetData {

    protected UnitHandle entityHandle;

    /**
     * Gets the value of the entityHandle property.
     * 
     * @return
     *     possible object is
     *     {@link UnitHandle }
     *     
     */
    public UnitHandle getEntityHandle() {
        return entityHandle;
    }

    /**
     * Sets the value of the entityHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitHandle }
     *     
     */
    public void setEntityHandle(UnitHandle value) {
        this.entityHandle = value;
    }

}
