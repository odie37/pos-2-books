
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
 *         &lt;element name="CostTypeGroup_FindByNumberResult" type="{http://e-conomic.com}CostTypeGroupHandle" minOccurs="0"/>
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
    "costTypeGroupFindByNumberResult"
})
@XmlRootElement(name = "CostTypeGroup_FindByNumberResponse")
public class CostTypeGroupFindByNumberResponse {

    @XmlElement(name = "CostTypeGroup_FindByNumberResult")
    protected CostTypeGroupHandle costTypeGroupFindByNumberResult;

    /**
     * Gets the value of the costTypeGroupFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeGroupHandle }
     *     
     */
    public CostTypeGroupHandle getCostTypeGroupFindByNumberResult() {
        return costTypeGroupFindByNumberResult;
    }

    /**
     * Sets the value of the costTypeGroupFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeGroupHandle }
     *     
     */
    public void setCostTypeGroupFindByNumberResult(CostTypeGroupHandle value) {
        this.costTypeGroupFindByNumberResult = value;
    }

}
