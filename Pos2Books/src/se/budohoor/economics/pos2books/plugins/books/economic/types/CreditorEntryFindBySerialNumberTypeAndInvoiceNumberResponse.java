
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
 *         &lt;element name="CreditorEntry_FindBySerialNumberTypeAndInvoiceNumberResult" type="{http://e-conomic.com}ArrayOfCreditorEntryHandle" minOccurs="0"/>
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
    "creditorEntryFindBySerialNumberTypeAndInvoiceNumberResult"
})
@XmlRootElement(name = "CreditorEntry_FindBySerialNumberTypeAndInvoiceNumberResponse")
public class CreditorEntryFindBySerialNumberTypeAndInvoiceNumberResponse {

    @XmlElement(name = "CreditorEntry_FindBySerialNumberTypeAndInvoiceNumberResult")
    protected ArrayOfCreditorEntryHandle creditorEntryFindBySerialNumberTypeAndInvoiceNumberResult;

    /**
     * Gets the value of the creditorEntryFindBySerialNumberTypeAndInvoiceNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public ArrayOfCreditorEntryHandle getCreditorEntryFindBySerialNumberTypeAndInvoiceNumberResult() {
        return creditorEntryFindBySerialNumberTypeAndInvoiceNumberResult;
    }

    /**
     * Sets the value of the creditorEntryFindBySerialNumberTypeAndInvoiceNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public void setCreditorEntryFindBySerialNumberTypeAndInvoiceNumberResult(ArrayOfCreditorEntryHandle value) {
        this.creditorEntryFindBySerialNumberTypeAndInvoiceNumberResult = value;
    }

}
