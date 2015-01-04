
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
 *         &lt;element name="CurrentInvoiceLine_GetProductResult" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
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
    "currentInvoiceLineGetProductResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetProductResponse")
public class CurrentInvoiceLineGetProductResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetProductResult")
    protected ProductHandle currentInvoiceLineGetProductResult;

    /**
     * Gets the value of the currentInvoiceLineGetProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductHandle }
     *     
     */
    public ProductHandle getCurrentInvoiceLineGetProductResult() {
        return currentInvoiceLineGetProductResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHandle }
     *     
     */
    public void setCurrentInvoiceLineGetProductResult(ProductHandle value) {
        this.currentInvoiceLineGetProductResult = value;
    }

}
