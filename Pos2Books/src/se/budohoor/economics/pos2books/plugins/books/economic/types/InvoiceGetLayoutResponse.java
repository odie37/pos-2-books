
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
 *         &lt;element name="Invoice_GetLayoutResult" type="{http://e-conomic.com}TemplateCollectionHandle" minOccurs="0"/>
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
    "invoiceGetLayoutResult"
})
@XmlRootElement(name = "Invoice_GetLayoutResponse")
public class InvoiceGetLayoutResponse {

    @XmlElement(name = "Invoice_GetLayoutResult")
    protected TemplateCollectionHandle invoiceGetLayoutResult;

    /**
     * Gets the value of the invoiceGetLayoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public TemplateCollectionHandle getInvoiceGetLayoutResult() {
        return invoiceGetLayoutResult;
    }

    /**
     * Sets the value of the invoiceGetLayoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public void setInvoiceGetLayoutResult(TemplateCollectionHandle value) {
        this.invoiceGetLayoutResult = value;
    }

}
