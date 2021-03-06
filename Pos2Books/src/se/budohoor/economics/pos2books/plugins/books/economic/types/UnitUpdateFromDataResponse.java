
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
 *         &lt;element name="Unit_UpdateFromDataResult" type="{http://e-conomic.com}UnitHandle" minOccurs="0"/>
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
    "unitUpdateFromDataResult"
})
@XmlRootElement(name = "Unit_UpdateFromDataResponse")
public class UnitUpdateFromDataResponse {

    @XmlElement(name = "Unit_UpdateFromDataResult")
    protected UnitHandle unitUpdateFromDataResult;

    /**
     * Gets the value of the unitUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnitHandle }
     *     
     */
    public UnitHandle getUnitUpdateFromDataResult() {
        return unitUpdateFromDataResult;
    }

    /**
     * Sets the value of the unitUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitHandle }
     *     
     */
    public void setUnitUpdateFromDataResult(UnitHandle value) {
        this.unitUpdateFromDataResult = value;
    }

}
