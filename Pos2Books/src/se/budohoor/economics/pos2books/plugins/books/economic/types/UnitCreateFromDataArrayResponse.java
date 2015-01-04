
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
 *         &lt;element name="Unit_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfUnitHandle" minOccurs="0"/>
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
    "unitCreateFromDataArrayResult"
})
@XmlRootElement(name = "Unit_CreateFromDataArrayResponse")
public class UnitCreateFromDataArrayResponse {

    @XmlElement(name = "Unit_CreateFromDataArrayResult")
    protected ArrayOfUnitHandle unitCreateFromDataArrayResult;

    /**
     * Gets the value of the unitCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitHandle }
     *     
     */
    public ArrayOfUnitHandle getUnitCreateFromDataArrayResult() {
        return unitCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the unitCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitHandle }
     *     
     */
    public void setUnitCreateFromDataArrayResult(ArrayOfUnitHandle value) {
        this.unitCreateFromDataArrayResult = value;
    }

}
