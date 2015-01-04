
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
 *         &lt;element name="CurrentInvoice_GetDeliveryCityResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "currentInvoiceGetDeliveryCityResult"
})
@XmlRootElement(name = "CurrentInvoice_GetDeliveryCityResponse")
public class CurrentInvoiceGetDeliveryCityResponse {

    @XmlElement(name = "CurrentInvoice_GetDeliveryCityResult")
    protected String currentInvoiceGetDeliveryCityResult;

    /**
     * Gets the value of the currentInvoiceGetDeliveryCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentInvoiceGetDeliveryCityResult() {
        return currentInvoiceGetDeliveryCityResult;
    }

    /**
     * Sets the value of the currentInvoiceGetDeliveryCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentInvoiceGetDeliveryCityResult(String value) {
        this.currentInvoiceGetDeliveryCityResult = value;
    }

}
