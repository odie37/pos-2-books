
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
 *         &lt;element name="Unit_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfUnitData" minOccurs="0"/>
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
    "unitGetDataArrayResult"
})
@XmlRootElement(name = "Unit_GetDataArrayResponse")
public class UnitGetDataArrayResponse {

    @XmlElement(name = "Unit_GetDataArrayResult")
    protected ArrayOfUnitData unitGetDataArrayResult;

    /**
     * Gets the value of the unitGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitData }
     *     
     */
    public ArrayOfUnitData getUnitGetDataArrayResult() {
        return unitGetDataArrayResult;
    }

    /**
     * Sets the value of the unitGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitData }
     *     
     */
    public void setUnitGetDataArrayResult(ArrayOfUnitData value) {
        this.unitGetDataArrayResult = value;
    }

}
