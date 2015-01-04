
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
 *         &lt;element name="DebtorEntry_GetDataResult" type="{http://e-conomic.com}DebtorEntryData" minOccurs="0"/>
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
    "debtorEntryGetDataResult"
})
@XmlRootElement(name = "DebtorEntry_GetDataResponse")
public class DebtorEntryGetDataResponse {

    @XmlElement(name = "DebtorEntry_GetDataResult")
    protected DebtorEntryData debtorEntryGetDataResult;

    /**
     * Gets the value of the debtorEntryGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorEntryData }
     *     
     */
    public DebtorEntryData getDebtorEntryGetDataResult() {
        return debtorEntryGetDataResult;
    }

    /**
     * Sets the value of the debtorEntryGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorEntryData }
     *     
     */
    public void setDebtorEntryGetDataResult(DebtorEntryData value) {
        this.debtorEntryGetDataResult = value;
    }

}
