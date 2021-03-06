
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="scannedDocumentHandle" type="{http://e-conomic.com}ScannedDocumentHandle" minOccurs="0"/>
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
    "scannedDocumentHandle"
})
@XmlRootElement(name = "ScannedDocument_GetVoucherNumber")
public class ScannedDocumentGetVoucherNumber {

    protected ScannedDocumentHandle scannedDocumentHandle;

    /**
     * Gets the value of the scannedDocumentHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public ScannedDocumentHandle getScannedDocumentHandle() {
        return scannedDocumentHandle;
    }

    /**
     * Sets the value of the scannedDocumentHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public void setScannedDocumentHandle(ScannedDocumentHandle value) {
        this.scannedDocumentHandle = value;
    }

}
