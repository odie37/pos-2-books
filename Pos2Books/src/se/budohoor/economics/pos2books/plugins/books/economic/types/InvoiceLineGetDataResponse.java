
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
 *         &lt;element name="InvoiceLine_GetDataResult" type="{http://e-conomic.com}InvoiceLineData" minOccurs="0"/>
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
    "invoiceLineGetDataResult"
})
@XmlRootElement(name = "InvoiceLine_GetDataResponse")
public class InvoiceLineGetDataResponse {

    @XmlElement(name = "InvoiceLine_GetDataResult")
    protected InvoiceLineData invoiceLineGetDataResult;

    /**
     * Gets the value of the invoiceLineGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLineData }
     *     
     */
    public InvoiceLineData getInvoiceLineGetDataResult() {
        return invoiceLineGetDataResult;
    }

    /**
     * Sets the value of the invoiceLineGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLineData }
     *     
     */
    public void setInvoiceLineGetDataResult(InvoiceLineData value) {
        this.invoiceLineGetDataResult = value;
    }

}
