
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
 *         &lt;element name="DebtorEntry_GetSerialNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "debtorEntryGetSerialNumberResult"
})
@XmlRootElement(name = "DebtorEntry_GetSerialNumberResponse")
public class DebtorEntryGetSerialNumberResponse {

    @XmlElement(name = "DebtorEntry_GetSerialNumberResult")
    protected int debtorEntryGetSerialNumberResult;

    /**
     * Gets the value of the debtorEntryGetSerialNumberResult property.
     * 
     */
    public int getDebtorEntryGetSerialNumberResult() {
        return debtorEntryGetSerialNumberResult;
    }

    /**
     * Sets the value of the debtorEntryGetSerialNumberResult property.
     * 
     */
    public void setDebtorEntryGetSerialNumberResult(int value) {
        this.debtorEntryGetSerialNumberResult = value;
    }

}
