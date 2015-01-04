
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
 *         &lt;element name="Debtor_GetVatZoneResult" type="{http://e-conomic.com}VatZone"/>
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
    "debtorGetVatZoneResult"
})
@XmlRootElement(name = "Debtor_GetVatZoneResponse")
public class DebtorGetVatZoneResponse {

    @XmlElement(name = "Debtor_GetVatZoneResult", required = true)
    protected VatZone debtorGetVatZoneResult;

    /**
     * Gets the value of the debtorGetVatZoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link VatZone }
     *     
     */
    public VatZone getDebtorGetVatZoneResult() {
        return debtorGetVatZoneResult;
    }

    /**
     * Sets the value of the debtorGetVatZoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatZone }
     *     
     */
    public void setDebtorGetVatZoneResult(VatZone value) {
        this.debtorGetVatZoneResult = value;
    }

}
