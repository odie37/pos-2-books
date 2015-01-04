
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
 *         &lt;element name="DebtorGroup_UpdateFromDataResult" type="{http://e-conomic.com}DebtorGroupHandle" minOccurs="0"/>
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
    "debtorGroupUpdateFromDataResult"
})
@XmlRootElement(name = "DebtorGroup_UpdateFromDataResponse")
public class DebtorGroupUpdateFromDataResponse {

    @XmlElement(name = "DebtorGroup_UpdateFromDataResult")
    protected DebtorGroupHandle debtorGroupUpdateFromDataResult;

    /**
     * Gets the value of the debtorGroupUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public DebtorGroupHandle getDebtorGroupUpdateFromDataResult() {
        return debtorGroupUpdateFromDataResult;
    }

    /**
     * Sets the value of the debtorGroupUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public void setDebtorGroupUpdateFromDataResult(DebtorGroupHandle value) {
        this.debtorGroupUpdateFromDataResult = value;
    }

}
