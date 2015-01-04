
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
 *         &lt;element name="CurrentInvoiceLine_CreateFromDataResult" type="{http://e-conomic.com}CurrentInvoiceLineHandle" minOccurs="0"/>
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
    "currentInvoiceLineCreateFromDataResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_CreateFromDataResponse")
public class CurrentInvoiceLineCreateFromDataResponse {

    @XmlElement(name = "CurrentInvoiceLine_CreateFromDataResult")
    protected CurrentInvoiceLineHandle currentInvoiceLineCreateFromDataResult;

    /**
     * Gets the value of the currentInvoiceLineCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentInvoiceLineHandle }
     *     
     */
    public CurrentInvoiceLineHandle getCurrentInvoiceLineCreateFromDataResult() {
        return currentInvoiceLineCreateFromDataResult;
    }

    /**
     * Sets the value of the currentInvoiceLineCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentInvoiceLineHandle }
     *     
     */
    public void setCurrentInvoiceLineCreateFromDataResult(CurrentInvoiceLineHandle value) {
        this.currentInvoiceLineCreateFromDataResult = value;
    }

}
