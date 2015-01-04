
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
 *         &lt;element name="CurrentInvoiceLine_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentInvoiceLineHandle" minOccurs="0"/>
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
    "currentInvoiceLineUpdateFromDataArrayResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_UpdateFromDataArrayResponse")
public class CurrentInvoiceLineUpdateFromDataArrayResponse {

    @XmlElement(name = "CurrentInvoiceLine_UpdateFromDataArrayResult")
    protected ArrayOfCurrentInvoiceLineHandle currentInvoiceLineUpdateFromDataArrayResult;

    /**
     * Gets the value of the currentInvoiceLineUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentInvoiceLineHandle }
     *     
     */
    public ArrayOfCurrentInvoiceLineHandle getCurrentInvoiceLineUpdateFromDataArrayResult() {
        return currentInvoiceLineUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the currentInvoiceLineUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentInvoiceLineHandle }
     *     
     */
    public void setCurrentInvoiceLineUpdateFromDataArrayResult(ArrayOfCurrentInvoiceLineHandle value) {
        this.currentInvoiceLineUpdateFromDataArrayResult = value;
    }

}
