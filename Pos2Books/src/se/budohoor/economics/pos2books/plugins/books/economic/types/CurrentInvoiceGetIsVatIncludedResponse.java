
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
 *         &lt;element name="CurrentInvoice_GetIsVatIncludedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "currentInvoiceGetIsVatIncludedResult"
})
@XmlRootElement(name = "CurrentInvoice_GetIsVatIncludedResponse")
public class CurrentInvoiceGetIsVatIncludedResponse {

    @XmlElement(name = "CurrentInvoice_GetIsVatIncludedResult")
    protected boolean currentInvoiceGetIsVatIncludedResult;

    /**
     * Gets the value of the currentInvoiceGetIsVatIncludedResult property.
     * 
     */
    public boolean isCurrentInvoiceGetIsVatIncludedResult() {
        return currentInvoiceGetIsVatIncludedResult;
    }

    /**
     * Sets the value of the currentInvoiceGetIsVatIncludedResult property.
     * 
     */
    public void setCurrentInvoiceGetIsVatIncludedResult(boolean value) {
        this.currentInvoiceGetIsVatIncludedResult = value;
    }

}
