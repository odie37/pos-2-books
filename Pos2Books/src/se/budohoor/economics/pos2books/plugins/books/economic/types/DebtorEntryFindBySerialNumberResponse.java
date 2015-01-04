
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
 *         &lt;element name="DebtorEntry_FindBySerialNumberResult" type="{http://e-conomic.com}ArrayOfDebtorEntryHandle" minOccurs="0"/>
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
    "debtorEntryFindBySerialNumberResult"
})
@XmlRootElement(name = "DebtorEntry_FindBySerialNumberResponse")
public class DebtorEntryFindBySerialNumberResponse {

    @XmlElement(name = "DebtorEntry_FindBySerialNumberResult")
    protected ArrayOfDebtorEntryHandle debtorEntryFindBySerialNumberResult;

    /**
     * Gets the value of the debtorEntryFindBySerialNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorEntryHandle }
     *     
     */
    public ArrayOfDebtorEntryHandle getDebtorEntryFindBySerialNumberResult() {
        return debtorEntryFindBySerialNumberResult;
    }

    /**
     * Sets the value of the debtorEntryFindBySerialNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorEntryHandle }
     *     
     */
    public void setDebtorEntryFindBySerialNumberResult(ArrayOfDebtorEntryHandle value) {
        this.debtorEntryFindBySerialNumberResult = value;
    }

}
