
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
 *         &lt;element name="CurrentInvoiceLine_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCurrentInvoiceLineData" minOccurs="0"/>
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
    "currentInvoiceLineGetDataArrayResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetDataArrayResponse")
public class CurrentInvoiceLineGetDataArrayResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetDataArrayResult")
    protected ArrayOfCurrentInvoiceLineData currentInvoiceLineGetDataArrayResult;

    /**
     * Gets the value of the currentInvoiceLineGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentInvoiceLineData }
     *     
     */
    public ArrayOfCurrentInvoiceLineData getCurrentInvoiceLineGetDataArrayResult() {
        return currentInvoiceLineGetDataArrayResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentInvoiceLineData }
     *     
     */
    public void setCurrentInvoiceLineGetDataArrayResult(ArrayOfCurrentInvoiceLineData value) {
        this.currentInvoiceLineGetDataArrayResult = value;
    }

}
