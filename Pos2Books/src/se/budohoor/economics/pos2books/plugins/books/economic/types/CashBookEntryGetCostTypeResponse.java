
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
 *         &lt;element name="CashBookEntry_GetCostTypeResult" type="{http://e-conomic.com}CostTypeHandle" minOccurs="0"/>
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
    "cashBookEntryGetCostTypeResult"
})
@XmlRootElement(name = "CashBookEntry_GetCostTypeResponse")
public class CashBookEntryGetCostTypeResponse {

    @XmlElement(name = "CashBookEntry_GetCostTypeResult")
    protected CostTypeHandle cashBookEntryGetCostTypeResult;

    /**
     * Gets the value of the cashBookEntryGetCostTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeHandle }
     *     
     */
    public CostTypeHandle getCashBookEntryGetCostTypeResult() {
        return cashBookEntryGetCostTypeResult;
    }

    /**
     * Sets the value of the cashBookEntryGetCostTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeHandle }
     *     
     */
    public void setCashBookEntryGetCostTypeResult(CostTypeHandle value) {
        this.cashBookEntryGetCostTypeResult = value;
    }

}
