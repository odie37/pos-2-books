
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
 *         &lt;element name="CurrentInvoice_BookResult" type="{http://e-conomic.com}InvoiceHandle" minOccurs="0"/>
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
    "currentInvoiceBookResult"
})
@XmlRootElement(name = "CurrentInvoice_BookResponse")
public class CurrentInvoiceBookResponse {

    @XmlElement(name = "CurrentInvoice_BookResult")
    protected InvoiceHandle currentInvoiceBookResult;

    /**
     * Gets the value of the currentInvoiceBookResult property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHandle }
     *     
     */
    public InvoiceHandle getCurrentInvoiceBookResult() {
        return currentInvoiceBookResult;
    }

    /**
     * Sets the value of the currentInvoiceBookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHandle }
     *     
     */
    public void setCurrentInvoiceBookResult(InvoiceHandle value) {
        this.currentInvoiceBookResult = value;
    }

}
