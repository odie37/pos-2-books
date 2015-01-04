
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
 *         &lt;element name="Debtor_CreateFromDataResult" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
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
    "debtorCreateFromDataResult"
})
@XmlRootElement(name = "Debtor_CreateFromDataResponse")
public class DebtorCreateFromDataResponse {

    @XmlElement(name = "Debtor_CreateFromDataResult")
    protected DebtorHandle debtorCreateFromDataResult;

    /**
     * Gets the value of the debtorCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getDebtorCreateFromDataResult() {
        return debtorCreateFromDataResult;
    }

    /**
     * Sets the value of the debtorCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setDebtorCreateFromDataResult(DebtorHandle value) {
        this.debtorCreateFromDataResult = value;
    }

}
