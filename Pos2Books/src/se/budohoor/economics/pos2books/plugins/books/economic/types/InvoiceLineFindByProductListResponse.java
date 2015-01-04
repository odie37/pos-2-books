
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
 *         &lt;element name="InvoiceLine_FindByProductListResult" type="{http://e-conomic.com}ArrayOfInvoiceLineHandle" minOccurs="0"/>
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
    "invoiceLineFindByProductListResult"
})
@XmlRootElement(name = "InvoiceLine_FindByProductListResponse")
public class InvoiceLineFindByProductListResponse {

    @XmlElement(name = "InvoiceLine_FindByProductListResult")
    protected ArrayOfInvoiceLineHandle invoiceLineFindByProductListResult;

    /**
     * Gets the value of the invoiceLineFindByProductListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceLineHandle }
     *     
     */
    public ArrayOfInvoiceLineHandle getInvoiceLineFindByProductListResult() {
        return invoiceLineFindByProductListResult;
    }

    /**
     * Sets the value of the invoiceLineFindByProductListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceLineHandle }
     *     
     */
    public void setInvoiceLineFindByProductListResult(ArrayOfInvoiceLineHandle value) {
        this.invoiceLineFindByProductListResult = value;
    }

}
