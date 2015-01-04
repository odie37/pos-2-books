
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
 *         &lt;element name="CurrentInvoice_CreateFromDataResult" type="{http://e-conomic.com}CurrentInvoiceHandle" minOccurs="0"/>
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
    "currentInvoiceCreateFromDataResult"
})
@XmlRootElement(name = "CurrentInvoice_CreateFromDataResponse")
public class CurrentInvoiceCreateFromDataResponse {

    @XmlElement(name = "CurrentInvoice_CreateFromDataResult")
    protected CurrentInvoiceHandle currentInvoiceCreateFromDataResult;

    /**
     * Gets the value of the currentInvoiceCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentInvoiceHandle }
     *     
     */
    public CurrentInvoiceHandle getCurrentInvoiceCreateFromDataResult() {
        return currentInvoiceCreateFromDataResult;
    }

    /**
     * Sets the value of the currentInvoiceCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentInvoiceHandle }
     *     
     */
    public void setCurrentInvoiceCreateFromDataResult(CurrentInvoiceHandle value) {
        this.currentInvoiceCreateFromDataResult = value;
    }

}
