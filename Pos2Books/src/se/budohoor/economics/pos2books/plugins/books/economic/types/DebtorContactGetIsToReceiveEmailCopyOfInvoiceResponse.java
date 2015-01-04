
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
 *         &lt;element name="DebtorContact_GetIsToReceiveEmailCopyOfInvoiceResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "debtorContactGetIsToReceiveEmailCopyOfInvoiceResult"
})
@XmlRootElement(name = "DebtorContact_GetIsToReceiveEmailCopyOfInvoiceResponse")
public class DebtorContactGetIsToReceiveEmailCopyOfInvoiceResponse {

    @XmlElement(name = "DebtorContact_GetIsToReceiveEmailCopyOfInvoiceResult")
    protected boolean debtorContactGetIsToReceiveEmailCopyOfInvoiceResult;

    /**
     * Gets the value of the debtorContactGetIsToReceiveEmailCopyOfInvoiceResult property.
     * 
     */
    public boolean isDebtorContactGetIsToReceiveEmailCopyOfInvoiceResult() {
        return debtorContactGetIsToReceiveEmailCopyOfInvoiceResult;
    }

    /**
     * Sets the value of the debtorContactGetIsToReceiveEmailCopyOfInvoiceResult property.
     * 
     */
    public void setDebtorContactGetIsToReceiveEmailCopyOfInvoiceResult(boolean value) {
        this.debtorContactGetIsToReceiveEmailCopyOfInvoiceResult = value;
    }

}
