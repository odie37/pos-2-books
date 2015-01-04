
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
 *         &lt;element name="Debtor_GetPriceGroupResult" type="{http://e-conomic.com}PriceGroupHandle" minOccurs="0"/>
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
    "debtorGetPriceGroupResult"
})
@XmlRootElement(name = "Debtor_GetPriceGroupResponse")
public class DebtorGetPriceGroupResponse {

    @XmlElement(name = "Debtor_GetPriceGroupResult")
    protected PriceGroupHandle debtorGetPriceGroupResult;

    /**
     * Gets the value of the debtorGetPriceGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupHandle }
     *     
     */
    public PriceGroupHandle getDebtorGetPriceGroupResult() {
        return debtorGetPriceGroupResult;
    }

    /**
     * Sets the value of the debtorGetPriceGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupHandle }
     *     
     */
    public void setDebtorGetPriceGroupResult(PriceGroupHandle value) {
        this.debtorGetPriceGroupResult = value;
    }

}
