
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
 *         &lt;element name="CostType_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfCostTypeHandle" minOccurs="0"/>
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
    "costTypeFindByNumberListResult"
})
@XmlRootElement(name = "CostType_FindByNumberListResponse")
public class CostTypeFindByNumberListResponse {

    @XmlElement(name = "CostType_FindByNumberListResult")
    protected ArrayOfCostTypeHandle costTypeFindByNumberListResult;

    /**
     * Gets the value of the costTypeFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCostTypeHandle }
     *     
     */
    public ArrayOfCostTypeHandle getCostTypeFindByNumberListResult() {
        return costTypeFindByNumberListResult;
    }

    /**
     * Sets the value of the costTypeFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCostTypeHandle }
     *     
     */
    public void setCostTypeFindByNumberListResult(ArrayOfCostTypeHandle value) {
        this.costTypeFindByNumberListResult = value;
    }

}
