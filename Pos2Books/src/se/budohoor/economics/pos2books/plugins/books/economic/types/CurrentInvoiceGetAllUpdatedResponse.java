
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
 *         &lt;element name="CurrentInvoice_GetAllUpdatedResult" type="{http://e-conomic.com}ArrayOfCurrentInvoiceHandle" minOccurs="0"/>
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
    "currentInvoiceGetAllUpdatedResult"
})
@XmlRootElement(name = "CurrentInvoice_GetAllUpdatedResponse")
public class CurrentInvoiceGetAllUpdatedResponse {

    @XmlElement(name = "CurrentInvoice_GetAllUpdatedResult")
    protected ArrayOfCurrentInvoiceHandle currentInvoiceGetAllUpdatedResult;

    /**
     * Gets the value of the currentInvoiceGetAllUpdatedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrentInvoiceHandle }
     *     
     */
    public ArrayOfCurrentInvoiceHandle getCurrentInvoiceGetAllUpdatedResult() {
        return currentInvoiceGetAllUpdatedResult;
    }

    /**
     * Sets the value of the currentInvoiceGetAllUpdatedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrentInvoiceHandle }
     *     
     */
    public void setCurrentInvoiceGetAllUpdatedResult(ArrayOfCurrentInvoiceHandle value) {
        this.currentInvoiceGetAllUpdatedResult = value;
    }

}
