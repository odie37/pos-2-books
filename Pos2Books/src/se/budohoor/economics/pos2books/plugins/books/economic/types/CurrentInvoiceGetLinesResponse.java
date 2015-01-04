
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
 *         &lt;element name="CurrentInvoice_GetLinesResult" type="{http://e-conomic.com}ArrayOfCurrentInvoiceLineHandle" minOccurs="0"/>
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
    "currentInvoiceGetLinesResult"
})
@XmlRootElement(name = "CurrentInvoice_GetLinesResponse")
public class CurrentInvoiceGetLinesResponse {

    @XmlElement(name = "CurrentInvoice_GetLinesResult")
    protected ArrayOfCurrentInvoiceLineHandle currentInvoiceGetLinesResult;

    /**
     * Gets the value of the currentInvoiceGetLinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentInvoiceLineHandle }
     *     
     */
    public ArrayOfCurrentInvoiceLineHandle getCurrentInvoiceGetLinesResult() {
        return currentInvoiceGetLinesResult;
    }

    /**
     * Sets the value of the currentInvoiceGetLinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentInvoiceLineHandle }
     *     
     */
    public void setCurrentInvoiceGetLinesResult(ArrayOfCurrentInvoiceLineHandle value) {
        this.currentInvoiceGetLinesResult = value;
    }

}
