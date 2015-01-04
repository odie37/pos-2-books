
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
 *         &lt;element name="CostTypeGroup_GetAllResult" type="{http://e-conomic.com}ArrayOfCostTypeGroupHandle" minOccurs="0"/>
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
    "costTypeGroupGetAllResult"
})
@XmlRootElement(name = "CostTypeGroup_GetAllResponse")
public class CostTypeGroupGetAllResponse {

    @XmlElement(name = "CostTypeGroup_GetAllResult")
    protected ArrayOfCostTypeGroupHandle costTypeGroupGetAllResult;

    /**
     * Gets the value of the costTypeGroupGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCostTypeGroupHandle }
     *     
     */
    public ArrayOfCostTypeGroupHandle getCostTypeGroupGetAllResult() {
        return costTypeGroupGetAllResult;
    }

    /**
     * Sets the value of the costTypeGroupGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCostTypeGroupHandle }
     *     
     */
    public void setCostTypeGroupGetAllResult(ArrayOfCostTypeGroupHandle value) {
        this.costTypeGroupGetAllResult = value;
    }

}
