
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
 *         &lt;element name="Invoice_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfInvoiceData" minOccurs="0"/>
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
    "invoiceGetDataArrayResult"
})
@XmlRootElement(name = "Invoice_GetDataArrayResponse")
public class InvoiceGetDataArrayResponse {

    @XmlElement(name = "Invoice_GetDataArrayResult")
    protected ArrayOfInvoiceData invoiceGetDataArrayResult;

    /**
     * Gets the value of the invoiceGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceData }
     *     
     */
    public ArrayOfInvoiceData getInvoiceGetDataArrayResult() {
        return invoiceGetDataArrayResult;
    }

    /**
     * Sets the value of the invoiceGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceData }
     *     
     */
    public void setInvoiceGetDataArrayResult(ArrayOfInvoiceData value) {
        this.invoiceGetDataArrayResult = value;
    }

}
