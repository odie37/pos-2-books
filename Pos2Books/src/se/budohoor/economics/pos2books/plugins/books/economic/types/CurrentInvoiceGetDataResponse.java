
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
 *         &lt;element name="CurrentInvoice_GetDataResult" type="{http://e-conomic.com}CurrentInvoiceData" minOccurs="0"/>
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
    "currentInvoiceGetDataResult"
})
@XmlRootElement(name = "CurrentInvoice_GetDataResponse")
public class CurrentInvoiceGetDataResponse {

    @XmlElement(name = "CurrentInvoice_GetDataResult")
    protected CurrentInvoiceData currentInvoiceGetDataResult;

    /**
     * Gets the value of the currentInvoiceGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentInvoiceData }
     *     
     */
    public CurrentInvoiceData getCurrentInvoiceGetDataResult() {
        return currentInvoiceGetDataResult;
    }

    /**
     * Sets the value of the currentInvoiceGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentInvoiceData }
     *     
     */
    public void setCurrentInvoiceGetDataResult(CurrentInvoiceData value) {
        this.currentInvoiceGetDataResult = value;
    }

}
