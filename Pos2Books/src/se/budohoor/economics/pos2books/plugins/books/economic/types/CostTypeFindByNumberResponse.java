
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
 *         &lt;element name="CostType_FindByNumberResult" type="{http://e-conomic.com}CostTypeHandle" minOccurs="0"/>
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
    "costTypeFindByNumberResult"
})
@XmlRootElement(name = "CostType_FindByNumberResponse")
public class CostTypeFindByNumberResponse {

    @XmlElement(name = "CostType_FindByNumberResult")
    protected CostTypeHandle costTypeFindByNumberResult;

    /**
     * Gets the value of the costTypeFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeHandle }
     *     
     */
    public CostTypeHandle getCostTypeFindByNumberResult() {
        return costTypeFindByNumberResult;
    }

    /**
     * Sets the value of the costTypeFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeHandle }
     *     
     */
    public void setCostTypeFindByNumberResult(CostTypeHandle value) {
        this.costTypeFindByNumberResult = value;
    }

}
