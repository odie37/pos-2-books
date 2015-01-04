
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
 *         &lt;element name="CurrentInvoiceLine_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentInvoiceLineHandle" minOccurs="0"/>
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
    "currentInvoiceLineCreateFromDataArrayResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_CreateFromDataArrayResponse")
public class CurrentInvoiceLineCreateFromDataArrayResponse {

    @XmlElement(name = "CurrentInvoiceLine_CreateFromDataArrayResult")
    protected ArrayOfCurrentInvoiceLineHandle currentInvoiceLineCreateFromDataArrayResult;

    /**
     * Gets the value of the currentInvoiceLineCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentInvoiceLineHandle }
     *     
     */
    public ArrayOfCurrentInvoiceLineHandle getCurrentInvoiceLineCreateFromDataArrayResult() {
        return currentInvoiceLineCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the currentInvoiceLineCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentInvoiceLineHandle }
     *     
     */
    public void setCurrentInvoiceLineCreateFromDataArrayResult(ArrayOfCurrentInvoiceLineHandle value) {
        this.currentInvoiceLineCreateFromDataArrayResult = value;
    }

}
