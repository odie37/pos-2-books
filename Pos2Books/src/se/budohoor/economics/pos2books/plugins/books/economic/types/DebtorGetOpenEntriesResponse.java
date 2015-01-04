
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
 *         &lt;element name="Debtor_GetOpenEntriesResult" type="{http://e-conomic.com}ArrayOfDebtorEntryHandle" minOccurs="0"/>
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
    "debtorGetOpenEntriesResult"
})
@XmlRootElement(name = "Debtor_GetOpenEntriesResponse")
public class DebtorGetOpenEntriesResponse {

    @XmlElement(name = "Debtor_GetOpenEntriesResult")
    protected ArrayOfDebtorEntryHandle debtorGetOpenEntriesResult;

    /**
     * Gets the value of the debtorGetOpenEntriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorEntryHandle }
     *     
     */
    public ArrayOfDebtorEntryHandle getDebtorGetOpenEntriesResult() {
        return debtorGetOpenEntriesResult;
    }

    /**
     * Sets the value of the debtorGetOpenEntriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorEntryHandle }
     *     
     */
    public void setDebtorGetOpenEntriesResult(ArrayOfDebtorEntryHandle value) {
        this.debtorGetOpenEntriesResult = value;
    }

}
