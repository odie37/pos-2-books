
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
 *         &lt;element name="DebtorContact_UpdateFromDataResult" type="{http://e-conomic.com}DebtorContactHandle" minOccurs="0"/>
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
    "debtorContactUpdateFromDataResult"
})
@XmlRootElement(name = "DebtorContact_UpdateFromDataResponse")
public class DebtorContactUpdateFromDataResponse {

    @XmlElement(name = "DebtorContact_UpdateFromDataResult")
    protected DebtorContactHandle debtorContactUpdateFromDataResult;

    /**
     * Gets the value of the debtorContactUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorContactHandle }
     *     
     */
    public DebtorContactHandle getDebtorContactUpdateFromDataResult() {
        return debtorContactUpdateFromDataResult;
    }

    /**
     * Sets the value of the debtorContactUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorContactHandle }
     *     
     */
    public void setDebtorContactUpdateFromDataResult(DebtorContactHandle value) {
        this.debtorContactUpdateFromDataResult = value;
    }

}
