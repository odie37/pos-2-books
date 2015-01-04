
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
 *         &lt;element name="CostTypeGroup_GetDataResult" type="{http://e-conomic.com}CostTypeGroupData" minOccurs="0"/>
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
    "costTypeGroupGetDataResult"
})
@XmlRootElement(name = "CostTypeGroup_GetDataResponse")
public class CostTypeGroupGetDataResponse {

    @XmlElement(name = "CostTypeGroup_GetDataResult")
    protected CostTypeGroupData costTypeGroupGetDataResult;

    /**
     * Gets the value of the costTypeGroupGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeGroupData }
     *     
     */
    public CostTypeGroupData getCostTypeGroupGetDataResult() {
        return costTypeGroupGetDataResult;
    }

    /**
     * Sets the value of the costTypeGroupGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeGroupData }
     *     
     */
    public void setCostTypeGroupGetDataResult(CostTypeGroupData value) {
        this.costTypeGroupGetDataResult = value;
    }

}
