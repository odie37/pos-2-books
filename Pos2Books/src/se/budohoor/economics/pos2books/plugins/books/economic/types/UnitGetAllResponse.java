
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
 *         &lt;element name="Unit_GetAllResult" type="{http://e-conomic.com}ArrayOfUnitHandle" minOccurs="0"/>
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
    "unitGetAllResult"
})
@XmlRootElement(name = "Unit_GetAllResponse")
public class UnitGetAllResponse {

    @XmlElement(name = "Unit_GetAllResult")
    protected ArrayOfUnitHandle unitGetAllResult;

    /**
     * Gets the value of the unitGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitHandle }
     *     
     */
    public ArrayOfUnitHandle getUnitGetAllResult() {
        return unitGetAllResult;
    }

    /**
     * Sets the value of the unitGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitHandle }
     *     
     */
    public void setUnitGetAllResult(ArrayOfUnitHandle value) {
        this.unitGetAllResult = value;
    }

}
