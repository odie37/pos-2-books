
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
 *         &lt;element name="CurrentInvoice_GetDebtorPostalCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "currentInvoiceGetDebtorPostalCodeResult"
})
@XmlRootElement(name = "CurrentInvoice_GetDebtorPostalCodeResponse")
public class CurrentInvoiceGetDebtorPostalCodeResponse {

    @XmlElement(name = "CurrentInvoice_GetDebtorPostalCodeResult")
    protected String currentInvoiceGetDebtorPostalCodeResult;

    /**
     * Gets the value of the currentInvoiceGetDebtorPostalCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentInvoiceGetDebtorPostalCodeResult() {
        return currentInvoiceGetDebtorPostalCodeResult;
    }

    /**
     * Sets the value of the currentInvoiceGetDebtorPostalCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentInvoiceGetDebtorPostalCodeResult(String value) {
        this.currentInvoiceGetDebtorPostalCodeResult = value;
    }

}
