
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
 *         &lt;element name="CostType_FindByNameResult" type="{http://e-conomic.com}ArrayOfCostTypeHandle" minOccurs="0"/>
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
    "costTypeFindByNameResult"
})
@XmlRootElement(name = "CostType_FindByNameResponse")
public class CostTypeFindByNameResponse {

    @XmlElement(name = "CostType_FindByNameResult")
    protected ArrayOfCostTypeHandle costTypeFindByNameResult;

    /**
     * Gets the value of the costTypeFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCostTypeHandle }
     *     
     */
    public ArrayOfCostTypeHandle getCostTypeFindByNameResult() {
        return costTypeFindByNameResult;
    }

    /**
     * Sets the value of the costTypeFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCostTypeHandle }
     *     
     */
    public void setCostTypeFindByNameResult(ArrayOfCostTypeHandle value) {
        this.costTypeFindByNameResult = value;
    }

}
