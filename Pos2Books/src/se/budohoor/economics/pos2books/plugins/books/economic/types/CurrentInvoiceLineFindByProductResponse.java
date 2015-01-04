
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
 *         &lt;element name="CurrentInvoiceLine_FindByProductResult" type="{http://e-conomic.com}ArrayOfCurrentInvoiceLineHandle" minOccurs="0"/>
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
    "currentInvoiceLineFindByProductResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_FindByProductResponse")
public class CurrentInvoiceLineFindByProductResponse {

    @XmlElement(name = "CurrentInvoiceLine_FindByProductResult")
    protected ArrayOfCurrentInvoiceLineHandle currentInvoiceLineFindByProductResult;

    /**
     * Gets the value of the currentInvoiceLineFindByProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentInvoiceLineHandle }
     *     
     */
    public ArrayOfCurrentInvoiceLineHandle getCurrentInvoiceLineFindByProductResult() {
        return currentInvoiceLineFindByProductResult;
    }

    /**
     * Sets the value of the currentInvoiceLineFindByProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentInvoiceLineHandle }
     *     
     */
    public void setCurrentInvoiceLineFindByProductResult(ArrayOfCurrentInvoiceLineHandle value) {
        this.currentInvoiceLineFindByProductResult = value;
    }

}
