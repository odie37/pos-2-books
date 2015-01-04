
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
 *         &lt;element name="Invoice_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "invoiceGetNumberResult"
})
@XmlRootElement(name = "Invoice_GetNumberResponse")
public class InvoiceGetNumberResponse {

    @XmlElement(name = "Invoice_GetNumberResult")
    protected int invoiceGetNumberResult;

    /**
     * Gets the value of the invoiceGetNumberResult property.
     * 
     */
    public int getInvoiceGetNumberResult() {
        return invoiceGetNumberResult;
    }

    /**
     * Sets the value of the invoiceGetNumberResult property.
     * 
     */
    public void setInvoiceGetNumberResult(int value) {
        this.invoiceGetNumberResult = value;
    }

}
