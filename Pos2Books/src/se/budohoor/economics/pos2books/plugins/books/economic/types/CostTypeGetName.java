
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="costTypeHandle" type="{http://e-conomic.com}CostTypeHandle" minOccurs="0"/>
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
    "costTypeHandle"
})
@XmlRootElement(name = "CostType_GetName")
public class CostTypeGetName {

    protected CostTypeHandle costTypeHandle;

    /**
     * Gets the value of the costTypeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeHandle }
     *     
     */
    public CostTypeHandle getCostTypeHandle() {
        return costTypeHandle;
    }

    /**
     * Sets the value of the costTypeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeHandle }
     *     
     */
    public void setCostTypeHandle(CostTypeHandle value) {
        this.costTypeHandle = value;
    }

}
