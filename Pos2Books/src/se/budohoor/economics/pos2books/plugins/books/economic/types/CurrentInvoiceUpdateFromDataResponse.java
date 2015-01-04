
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
 *         &lt;element name="CurrentInvoice_UpdateFromDataResult" type="{http://e-conomic.com}CurrentInvoiceHandle" minOccurs="0"/>
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
    "currentInvoiceUpdateFromDataResult"
})
@XmlRootElement(name = "CurrentInvoice_UpdateFromDataResponse")
public class CurrentInvoiceUpdateFromDataResponse {

    @XmlElement(name = "CurrentInvoice_UpdateFromDataResult")
    protected CurrentInvoiceHandle currentInvoiceUpdateFromDataResult;

    /**
     * Gets the value of the currentInvoiceUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentInvoiceHandle }
     *     
     */
    public CurrentInvoiceHandle getCurrentInvoiceUpdateFromDataResult() {
        return currentInvoiceUpdateFromDataResult;
    }

    /**
     * Sets the value of the currentInvoiceUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentInvoiceHandle }
     *     
     */
    public void setCurrentInvoiceUpdateFromDataResult(CurrentInvoiceHandle value) {
        this.currentInvoiceUpdateFromDataResult = value;
    }

}
