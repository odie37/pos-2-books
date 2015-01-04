
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CurrentInvoiceLine_GetDeliveryDateResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "currentInvoiceLineGetDeliveryDateResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetDeliveryDateResponse")
public class CurrentInvoiceLineGetDeliveryDateResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetDeliveryDateResult", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentInvoiceLineGetDeliveryDateResult;

    /**
     * Gets the value of the currentInvoiceLineGetDeliveryDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentInvoiceLineGetDeliveryDateResult() {
        return currentInvoiceLineGetDeliveryDateResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetDeliveryDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentInvoiceLineGetDeliveryDateResult(XMLGregorianCalendar value) {
        this.currentInvoiceLineGetDeliveryDateResult = value;
    }

}
