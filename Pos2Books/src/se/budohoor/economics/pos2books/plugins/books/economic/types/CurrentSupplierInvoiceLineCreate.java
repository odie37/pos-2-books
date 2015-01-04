
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="invoiceHandle" type="{http://e-conomic.com}CurrentSupplierInvoiceHandle" minOccurs="0"/>
 *         &lt;element name="productHandle" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
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
    "invoiceHandle",
    "productHandle"
})
@XmlRootElement(name = "CurrentSupplierInvoiceLine_Create")
public class CurrentSupplierInvoiceLineCreate {

    protected CurrentSupplierInvoiceHandle invoiceHandle;
    protected ProductHandle productHandle;

    /**
     * Gets the value of the invoiceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public CurrentSupplierInvoiceHandle getInvoiceHandle() {
        return invoiceHandle;
    }

    /**
     * Sets the value of the invoiceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentSupplierInvoiceHandle }
     *     
     */
    public void setInvoiceHandle(CurrentSupplierInvoiceHandle value) {
        this.invoiceHandle = value;
    }

    /**
     * Gets the value of the productHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductHandle }
     *     
     */
    public ProductHandle getProductHandle() {
        return productHandle;
    }

    /**
     * Sets the value of the productHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHandle }
     *     
     */
    public void setProductHandle(ProductHandle value) {
        this.productHandle = value;
    }

}
