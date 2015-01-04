
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
 *         &lt;element name="Debtor_UpdateFromDataResult" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
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
    "debtorUpdateFromDataResult"
})
@XmlRootElement(name = "Debtor_UpdateFromDataResponse")
public class DebtorUpdateFromDataResponse {

    @XmlElement(name = "Debtor_UpdateFromDataResult")
    protected DebtorHandle debtorUpdateFromDataResult;

    /**
     * Gets the value of the debtorUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getDebtorUpdateFromDataResult() {
        return debtorUpdateFromDataResult;
    }

    /**
     * Sets the value of the debtorUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setDebtorUpdateFromDataResult(DebtorHandle value) {
        this.debtorUpdateFromDataResult = value;
    }

}
