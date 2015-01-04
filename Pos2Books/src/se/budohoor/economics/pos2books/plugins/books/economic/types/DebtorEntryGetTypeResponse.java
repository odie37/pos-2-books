
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
 *         &lt;element name="DebtorEntry_GetTypeResult" type="{http://e-conomic.com}EntryType"/>
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
    "debtorEntryGetTypeResult"
})
@XmlRootElement(name = "DebtorEntry_GetTypeResponse")
public class DebtorEntryGetTypeResponse {

    @XmlElement(name = "DebtorEntry_GetTypeResult", required = true)
    protected EntryType debtorEntryGetTypeResult;

    /**
     * Gets the value of the debtorEntryGetTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EntryType }
     *     
     */
    public EntryType getDebtorEntryGetTypeResult() {
        return debtorEntryGetTypeResult;
    }

    /**
     * Sets the value of the debtorEntryGetTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryType }
     *     
     */
    public void setDebtorEntryGetTypeResult(EntryType value) {
        this.debtorEntryGetTypeResult = value;
    }

}
