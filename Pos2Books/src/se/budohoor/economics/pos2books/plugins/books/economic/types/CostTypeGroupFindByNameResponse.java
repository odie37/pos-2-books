
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
 *         &lt;element name="CostTypeGroup_FindByNameResult" type="{http://e-conomic.com}ArrayOfCostTypeGroupHandle" minOccurs="0"/>
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
    "costTypeGroupFindByNameResult"
})
@XmlRootElement(name = "CostTypeGroup_FindByNameResponse")
public class CostTypeGroupFindByNameResponse {

    @XmlElement(name = "CostTypeGroup_FindByNameResult")
    protected ArrayOfCostTypeGroupHandle costTypeGroupFindByNameResult;

    /**
     * Gets the value of the costTypeGroupFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCostTypeGroupHandle }
     *     
     */
    public ArrayOfCostTypeGroupHandle getCostTypeGroupFindByNameResult() {
        return costTypeGroupFindByNameResult;
    }

    /**
     * Sets the value of the costTypeGroupFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCostTypeGroupHandle }
     *     
     */
    public void setCostTypeGroupFindByNameResult(ArrayOfCostTypeGroupHandle value) {
        this.costTypeGroupFindByNameResult = value;
    }

}
