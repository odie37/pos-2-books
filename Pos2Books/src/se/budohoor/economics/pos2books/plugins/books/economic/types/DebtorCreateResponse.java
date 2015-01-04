
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
 *         &lt;element name="Debtor_CreateResult" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
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
    "debtorCreateResult"
})
@XmlRootElement(name = "Debtor_CreateResponse")
public class DebtorCreateResponse {

    @XmlElement(name = "Debtor_CreateResult")
    protected DebtorHandle debtorCreateResult;

    /**
     * Gets the value of the debtorCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getDebtorCreateResult() {
        return debtorCreateResult;
    }

    /**
     * Sets the value of the debtorCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setDebtorCreateResult(DebtorHandle value) {
        this.debtorCreateResult = value;
    }

}
