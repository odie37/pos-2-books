
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
 *         &lt;element name="CurrentSupplierInvoice_GetIdResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "currentSupplierInvoiceGetIdResult"
})
@XmlRootElement(name = "CurrentSupplierInvoice_GetIdResponse")
public class CurrentSupplierInvoiceGetIdResponse {

    @XmlElement(name = "CurrentSupplierInvoice_GetIdResult")
    protected int currentSupplierInvoiceGetIdResult;

    /**
     * Gets the value of the currentSupplierInvoiceGetIdResult property.
     * 
     */
    public int getCurrentSupplierInvoiceGetIdResult() {
        return currentSupplierInvoiceGetIdResult;
    }

    /**
     * Sets the value of the currentSupplierInvoiceGetIdResult property.
     * 
     */
    public void setCurrentSupplierInvoiceGetIdResult(int value) {
        this.currentSupplierInvoiceGetIdResult = value;
    }

}
