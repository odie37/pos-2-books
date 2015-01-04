
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
 *         &lt;element name="Debtor_GetDebtorGroupResult" type="{http://e-conomic.com}DebtorGroupHandle" minOccurs="0"/>
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
    "debtorGetDebtorGroupResult"
})
@XmlRootElement(name = "Debtor_GetDebtorGroupResponse")
public class DebtorGetDebtorGroupResponse {

    @XmlElement(name = "Debtor_GetDebtorGroupResult")
    protected DebtorGroupHandle debtorGetDebtorGroupResult;

    /**
     * Gets the value of the debtorGetDebtorGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public DebtorGroupHandle getDebtorGetDebtorGroupResult() {
        return debtorGetDebtorGroupResult;
    }

    /**
     * Sets the value of the debtorGetDebtorGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public void setDebtorGetDebtorGroupResult(DebtorGroupHandle value) {
        this.debtorGetDebtorGroupResult = value;
    }

}
