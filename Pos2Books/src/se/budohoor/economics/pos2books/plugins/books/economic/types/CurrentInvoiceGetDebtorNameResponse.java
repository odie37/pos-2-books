
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
 *         &lt;element name="CurrentInvoice_GetDebtorNameResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "currentInvoiceGetDebtorNameResult"
})
@XmlRootElement(name = "CurrentInvoice_GetDebtorNameResponse")
public class CurrentInvoiceGetDebtorNameResponse {

    @XmlElement(name = "CurrentInvoice_GetDebtorNameResult")
    protected String currentInvoiceGetDebtorNameResult;

    /**
     * Gets the value of the currentInvoiceGetDebtorNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentInvoiceGetDebtorNameResult() {
        return currentInvoiceGetDebtorNameResult;
    }

    /**
     * Sets the value of the currentInvoiceGetDebtorNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentInvoiceGetDebtorNameResult(String value) {
        this.currentInvoiceGetDebtorNameResult = value;
    }

}
