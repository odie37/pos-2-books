
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
 *         &lt;element name="Debtor_GetExtendedVatZoneResult" type="{http://e-conomic.com}ExtendedVatZoneHandle" minOccurs="0"/>
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
    "debtorGetExtendedVatZoneResult"
})
@XmlRootElement(name = "Debtor_GetExtendedVatZoneResponse")
public class DebtorGetExtendedVatZoneResponse {

    @XmlElement(name = "Debtor_GetExtendedVatZoneResult")
    protected ExtendedVatZoneHandle debtorGetExtendedVatZoneResult;

    /**
     * Gets the value of the debtorGetExtendedVatZoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public ExtendedVatZoneHandle getDebtorGetExtendedVatZoneResult() {
        return debtorGetExtendedVatZoneResult;
    }

    /**
     * Sets the value of the debtorGetExtendedVatZoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public void setDebtorGetExtendedVatZoneResult(ExtendedVatZoneHandle value) {
        this.debtorGetExtendedVatZoneResult = value;
    }

}
