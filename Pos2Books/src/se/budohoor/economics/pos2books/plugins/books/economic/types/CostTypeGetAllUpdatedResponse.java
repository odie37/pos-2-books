
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
 *         &lt;element name="CostType_GetAllUpdatedResult" type="{http://e-conomic.com}ArrayOfCostTypeHandle" minOccurs="0"/>
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
    "costTypeGetAllUpdatedResult"
})
@XmlRootElement(name = "CostType_GetAllUpdatedResponse")
public class CostTypeGetAllUpdatedResponse {

    @XmlElement(name = "CostType_GetAllUpdatedResult")
    protected ArrayOfCostTypeHandle costTypeGetAllUpdatedResult;

    /**
     * Gets the value of the costTypeGetAllUpdatedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCostTypeHandle }
     *     
     */
    public ArrayOfCostTypeHandle getCostTypeGetAllUpdatedResult() {
        return costTypeGetAllUpdatedResult;
    }

    /**
     * Sets the value of the costTypeGetAllUpdatedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCostTypeHandle }
     *     
     */
    public void setCostTypeGetAllUpdatedResult(ArrayOfCostTypeHandle value) {
        this.costTypeGetAllUpdatedResult = value;
    }

}
