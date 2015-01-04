
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
 *         &lt;element name="Debtor_GetDataResult" type="{http://e-conomic.com}DebtorData" minOccurs="0"/>
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
    "debtorGetDataResult"
})
@XmlRootElement(name = "Debtor_GetDataResponse")
public class DebtorGetDataResponse {

    @XmlElement(name = "Debtor_GetDataResult")
    protected DebtorData debtorGetDataResult;

    /**
     * Gets the value of the debtorGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorData }
     *     
     */
    public DebtorData getDebtorGetDataResult() {
        return debtorGetDataResult;
    }

    /**
     * Sets the value of the debtorGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorData }
     *     
     */
    public void setDebtorGetDataResult(DebtorData value) {
        this.debtorGetDataResult = value;
    }

}
