
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
 *         &lt;element name="DebtorEntry_GetTextResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "debtorEntryGetTextResult"
})
@XmlRootElement(name = "DebtorEntry_GetTextResponse")
public class DebtorEntryGetTextResponse {

    @XmlElement(name = "DebtorEntry_GetTextResult")
    protected String debtorEntryGetTextResult;

    /**
     * Gets the value of the debtorEntryGetTextResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorEntryGetTextResult() {
        return debtorEntryGetTextResult;
    }

    /**
     * Sets the value of the debtorEntryGetTextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorEntryGetTextResult(String value) {
        this.debtorEntryGetTextResult = value;
    }

}
