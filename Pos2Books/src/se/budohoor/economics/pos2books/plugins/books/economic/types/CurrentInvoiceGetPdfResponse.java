
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
 *         &lt;element name="CurrentInvoice_GetPdfResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "currentInvoiceGetPdfResult"
})
@XmlRootElement(name = "CurrentInvoice_GetPdfResponse")
public class CurrentInvoiceGetPdfResponse {

    @XmlElement(name = "CurrentInvoice_GetPdfResult")
    protected byte[] currentInvoiceGetPdfResult;

    /**
     * Gets the value of the currentInvoiceGetPdfResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCurrentInvoiceGetPdfResult() {
        return currentInvoiceGetPdfResult;
    }

    /**
     * Sets the value of the currentInvoiceGetPdfResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCurrentInvoiceGetPdfResult(byte[] value) {
        this.currentInvoiceGetPdfResult = ((byte[]) value);
    }

}
