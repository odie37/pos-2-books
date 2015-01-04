
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
 *         &lt;element name="CurrentInvoiceLine_GetDataResult" type="{http://e-conomic.com}CurrentInvoiceLineData" minOccurs="0"/>
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
    "currentInvoiceLineGetDataResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetDataResponse")
public class CurrentInvoiceLineGetDataResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetDataResult")
    protected CurrentInvoiceLineData currentInvoiceLineGetDataResult;

    /**
     * Gets the value of the currentInvoiceLineGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentInvoiceLineData }
     *     
     */
    public CurrentInvoiceLineData getCurrentInvoiceLineGetDataResult() {
        return currentInvoiceLineGetDataResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentInvoiceLineData }
     *     
     */
    public void setCurrentInvoiceLineGetDataResult(CurrentInvoiceLineData value) {
        this.currentInvoiceLineGetDataResult = value;
    }

}
