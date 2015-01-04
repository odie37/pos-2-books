
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="debtorEntryHandle" type="{http://e-conomic.com}DebtorEntryHandle" minOccurs="0"/>
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
    "debtorEntryHandle"
})
@XmlRootElement(name = "DebtorEntry_GetAccount")
public class DebtorEntryGetAccount {

    protected DebtorEntryHandle debtorEntryHandle;

    /**
     * Gets the value of the debtorEntryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorEntryHandle }
     *     
     */
    public DebtorEntryHandle getDebtorEntryHandle() {
        return debtorEntryHandle;
    }

    /**
     * Sets the value of the debtorEntryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorEntryHandle }
     *     
     */
    public void setDebtorEntryHandle(DebtorEntryHandle value) {
        this.debtorEntryHandle = value;
    }

}
