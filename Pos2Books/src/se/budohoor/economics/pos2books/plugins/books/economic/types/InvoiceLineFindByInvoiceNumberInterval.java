
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
 *         &lt;element name="fromInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="toInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "fromInvoiceNumber",
    "toInvoiceNumber"
})
@XmlRootElement(name = "InvoiceLine_FindByInvoiceNumberInterval")
public class InvoiceLineFindByInvoiceNumberInterval {

    protected int fromInvoiceNumber;
    protected int toInvoiceNumber;

    /**
     * Gets the value of the fromInvoiceNumber property.
     * 
     */
    public int getFromInvoiceNumber() {
        return fromInvoiceNumber;
    }

    /**
     * Sets the value of the fromInvoiceNumber property.
     * 
     */
    public void setFromInvoiceNumber(int value) {
        this.fromInvoiceNumber = value;
    }

    /**
     * Gets the value of the toInvoiceNumber property.
     * 
     */
    public int getToInvoiceNumber() {
        return toInvoiceNumber;
    }

    /**
     * Sets the value of the toInvoiceNumber property.
     * 
     */
    public void setToInvoiceNumber(int value) {
        this.toInvoiceNumber = value;
    }

}
