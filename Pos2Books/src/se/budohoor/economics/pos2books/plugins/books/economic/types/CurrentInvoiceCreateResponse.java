
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
 *         &lt;element name="CurrentInvoice_CreateResult" type="{http://e-conomic.com}CurrentInvoiceHandle" minOccurs="0"/>
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
    "currentInvoiceCreateResult"
})
@XmlRootElement(name = "CurrentInvoice_CreateResponse")
public class CurrentInvoiceCreateResponse {

    @XmlElement(name = "CurrentInvoice_CreateResult")
    protected CurrentInvoiceHandle currentInvoiceCreateResult;

    /**
     * Gets the value of the currentInvoiceCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentInvoiceHandle }
     *     
     */
    public CurrentInvoiceHandle getCurrentInvoiceCreateResult() {
        return currentInvoiceCreateResult;
    }

    /**
     * Sets the value of the currentInvoiceCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentInvoiceHandle }
     *     
     */
    public void setCurrentInvoiceCreateResult(CurrentInvoiceHandle value) {
        this.currentInvoiceCreateResult = value;
    }

}
