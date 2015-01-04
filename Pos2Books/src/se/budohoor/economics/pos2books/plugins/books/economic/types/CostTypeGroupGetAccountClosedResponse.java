
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
 *         &lt;element name="CostTypeGroup_GetAccountClosedResult" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "costTypeGroupGetAccountClosedResult"
})
@XmlRootElement(name = "CostTypeGroup_GetAccountClosedResponse")
public class CostTypeGroupGetAccountClosedResponse {

    @XmlElement(name = "CostTypeGroup_GetAccountClosedResult")
    protected AccountHandle costTypeGroupGetAccountClosedResult;

    /**
     * Gets the value of the costTypeGroupGetAccountClosedResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getCostTypeGroupGetAccountClosedResult() {
        return costTypeGroupGetAccountClosedResult;
    }

    /**
     * Sets the value of the costTypeGroupGetAccountClosedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setCostTypeGroupGetAccountClosedResult(AccountHandle value) {
        this.costTypeGroupGetAccountClosedResult = value;
    }

}
