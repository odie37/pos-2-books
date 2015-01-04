
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
 *         &lt;element name="CurrentInvoice_FindByOtherReferenceResult" type="{http://e-conomic.com}ArrayOfCurrentInvoiceHandle" minOccurs="0"/>
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
    "currentInvoiceFindByOtherReferenceResult"
})
@XmlRootElement(name = "CurrentInvoice_FindByOtherReferenceResponse")
public class CurrentInvoiceFindByOtherReferenceResponse {

    @XmlElement(name = "CurrentInvoice_FindByOtherReferenceResult")
    protected ArrayOfCurrentInvoiceHandle currentInvoiceFindByOtherReferenceResult;

    /**
     * Gets the value of the currentInvoiceFindByOtherReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentInvoiceHandle }
     *     
     */
    public ArrayOfCurrentInvoiceHandle getCurrentInvoiceFindByOtherReferenceResult() {
        return currentInvoiceFindByOtherReferenceResult;
    }

    /**
     * Sets the value of the currentInvoiceFindByOtherReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentInvoiceHandle }
     *     
     */
    public void setCurrentInvoiceFindByOtherReferenceResult(ArrayOfCurrentInvoiceHandle value) {
        this.currentInvoiceFindByOtherReferenceResult = value;
    }

}
