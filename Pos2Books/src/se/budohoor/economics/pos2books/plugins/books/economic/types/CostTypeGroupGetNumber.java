
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
 *         &lt;element name="costTypeGroupHandle" type="{http://e-conomic.com}CostTypeGroupHandle" minOccurs="0"/>
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
    "costTypeGroupHandle"
})
@XmlRootElement(name = "CostTypeGroup_GetNumber")
public class CostTypeGroupGetNumber {

    protected CostTypeGroupHandle costTypeGroupHandle;

    /**
     * Gets the value of the costTypeGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeGroupHandle }
     *     
     */
    public CostTypeGroupHandle getCostTypeGroupHandle() {
        return costTypeGroupHandle;
    }

    /**
     * Sets the value of the costTypeGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeGroupHandle }
     *     
     */
    public void setCostTypeGroupHandle(CostTypeGroupHandle value) {
        this.costTypeGroupHandle = value;
    }

}
