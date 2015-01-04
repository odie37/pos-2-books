
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
 *         &lt;element name="Invoice_GetAllResult" type="{http://e-conomic.com}ArrayOfInvoiceHandle" minOccurs="0"/>
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
    "invoiceGetAllResult"
})
@XmlRootElement(name = "Invoice_GetAllResponse")
public class InvoiceGetAllResponse {

    @XmlElement(name = "Invoice_GetAllResult")
    protected ArrayOfInvoiceHandle invoiceGetAllResult;

    /**
     * Gets the value of the invoiceGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceHandle }
     *     
     */
    public ArrayOfInvoiceHandle getInvoiceGetAllResult() {
        return invoiceGetAllResult;
    }

    /**
     * Sets the value of the invoiceGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceHandle }
     *     
     */
    public void setInvoiceGetAllResult(ArrayOfInvoiceHandle value) {
        this.invoiceGetAllResult = value;
    }

}
