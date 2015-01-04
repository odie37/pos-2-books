
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
 *         &lt;element name="InvoiceLine_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfInvoiceLineData" minOccurs="0"/>
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
    "invoiceLineGetDataArrayResult"
})
@XmlRootElement(name = "InvoiceLine_GetDataArrayResponse")
public class InvoiceLineGetDataArrayResponse {

    @XmlElement(name = "InvoiceLine_GetDataArrayResult")
    protected ArrayOfInvoiceLineData invoiceLineGetDataArrayResult;

    /**
     * Gets the value of the invoiceLineGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceLineData }
     *     
     */
    public ArrayOfInvoiceLineData getInvoiceLineGetDataArrayResult() {
        return invoiceLineGetDataArrayResult;
    }

    /**
     * Sets the value of the invoiceLineGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceLineData }
     *     
     */
    public void setInvoiceLineGetDataArrayResult(ArrayOfInvoiceLineData value) {
        this.invoiceLineGetDataArrayResult = value;
    }

}
