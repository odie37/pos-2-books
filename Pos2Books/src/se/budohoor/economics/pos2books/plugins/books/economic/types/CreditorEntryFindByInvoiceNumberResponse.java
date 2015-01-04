
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
 *         &lt;element name="CreditorEntry_FindByInvoiceNumberResult" type="{http://e-conomic.com}ArrayOfCreditorEntryHandle" minOccurs="0"/>
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
    "creditorEntryFindByInvoiceNumberResult"
})
@XmlRootElement(name = "CreditorEntry_FindByInvoiceNumberResponse")
public class CreditorEntryFindByInvoiceNumberResponse {

    @XmlElement(name = "CreditorEntry_FindByInvoiceNumberResult")
    protected ArrayOfCreditorEntryHandle creditorEntryFindByInvoiceNumberResult;

    /**
     * Gets the value of the creditorEntryFindByInvoiceNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public ArrayOfCreditorEntryHandle getCreditorEntryFindByInvoiceNumberResult() {
        return creditorEntryFindByInvoiceNumberResult;
    }

    /**
     * Sets the value of the creditorEntryFindByInvoiceNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public void setCreditorEntryFindByInvoiceNumberResult(ArrayOfCreditorEntryHandle value) {
        this.creditorEntryFindByInvoiceNumberResult = value;
    }

}
