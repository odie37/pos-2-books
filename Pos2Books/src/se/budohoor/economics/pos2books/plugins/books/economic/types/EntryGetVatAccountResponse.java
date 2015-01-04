
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
 *         &lt;element name="Entry_GetVatAccountResult" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
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
    "entryGetVatAccountResult"
})
@XmlRootElement(name = "Entry_GetVatAccountResponse")
public class EntryGetVatAccountResponse {

    @XmlElement(name = "Entry_GetVatAccountResult")
    protected VatAccountHandle entryGetVatAccountResult;

    /**
     * Gets the value of the entryGetVatAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountHandle }
     *     
     */
    public VatAccountHandle getEntryGetVatAccountResult() {
        return entryGetVatAccountResult;
    }

    /**
     * Sets the value of the entryGetVatAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountHandle }
     *     
     */
    public void setEntryGetVatAccountResult(VatAccountHandle value) {
        this.entryGetVatAccountResult = value;
    }

}
