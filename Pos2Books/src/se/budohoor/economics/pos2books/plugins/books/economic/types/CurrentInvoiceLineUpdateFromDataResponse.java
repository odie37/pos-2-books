
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
 *         &lt;element name="CurrentInvoiceLine_UpdateFromDataResult" type="{http://e-conomic.com}CurrentInvoiceLineHandle" minOccurs="0"/>
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
    "currentInvoiceLineUpdateFromDataResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_UpdateFromDataResponse")
public class CurrentInvoiceLineUpdateFromDataResponse {

    @XmlElement(name = "CurrentInvoiceLine_UpdateFromDataResult")
    protected CurrentInvoiceLineHandle currentInvoiceLineUpdateFromDataResult;

    /**
     * Gets the value of the currentInvoiceLineUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentInvoiceLineHandle }
     *     
     */
    public CurrentInvoiceLineHandle getCurrentInvoiceLineUpdateFromDataResult() {
        return currentInvoiceLineUpdateFromDataResult;
    }

    /**
     * Sets the value of the currentInvoiceLineUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentInvoiceLineHandle }
     *     
     */
    public void setCurrentInvoiceLineUpdateFromDataResult(CurrentInvoiceLineHandle value) {
        this.currentInvoiceLineUpdateFromDataResult = value;
    }

}
