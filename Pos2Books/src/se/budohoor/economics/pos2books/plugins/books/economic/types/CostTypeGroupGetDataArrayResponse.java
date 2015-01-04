
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
 *         &lt;element name="CostTypeGroup_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCostTypeGroupData" minOccurs="0"/>
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
    "costTypeGroupGetDataArrayResult"
})
@XmlRootElement(name = "CostTypeGroup_GetDataArrayResponse")
public class CostTypeGroupGetDataArrayResponse {

    @XmlElement(name = "CostTypeGroup_GetDataArrayResult")
    protected ArrayOfCostTypeGroupData costTypeGroupGetDataArrayResult;

    /**
     * Gets the value of the costTypeGroupGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCostTypeGroupData }
     *     
     */
    public ArrayOfCostTypeGroupData getCostTypeGroupGetDataArrayResult() {
        return costTypeGroupGetDataArrayResult;
    }

    /**
     * Sets the value of the costTypeGroupGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCostTypeGroupData }
     *     
     */
    public void setCostTypeGroupGetDataArrayResult(ArrayOfCostTypeGroupData value) {
        this.costTypeGroupGetDataArrayResult = value;
    }

}
