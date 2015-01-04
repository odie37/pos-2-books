
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
 *         &lt;element name="InvoiceLine_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "invoiceLineGetNumberResult"
})
@XmlRootElement(name = "InvoiceLine_GetNumberResponse")
public class InvoiceLineGetNumberResponse {

    @XmlElement(name = "InvoiceLine_GetNumberResult")
    protected int invoiceLineGetNumberResult;

    /**
     * Gets the value of the invoiceLineGetNumberResult property.
     * 
     */
    public int getInvoiceLineGetNumberResult() {
        return invoiceLineGetNumberResult;
    }

    /**
     * Sets the value of the invoiceLineGetNumberResult property.
     * 
     */
    public void setInvoiceLineGetNumberResult(int value) {
        this.invoiceLineGetNumberResult = value;
    }

}
