
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
 *         &lt;element name="ScannedDocument_FindByVoucherNumberIntervalResult" type="{http://e-conomic.com}ArrayOfScannedDocumentHandle" minOccurs="0"/>
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
    "scannedDocumentFindByVoucherNumberIntervalResult"
})
@XmlRootElement(name = "ScannedDocument_FindByVoucherNumberIntervalResponse")
public class ScannedDocumentFindByVoucherNumberIntervalResponse {

    @XmlElement(name = "ScannedDocument_FindByVoucherNumberIntervalResult")
    protected ArrayOfScannedDocumentHandle scannedDocumentFindByVoucherNumberIntervalResult;

    /**
     * Gets the value of the scannedDocumentFindByVoucherNumberIntervalResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScannedDocumentHandle }
     *     
     */
    public ArrayOfScannedDocumentHandle getScannedDocumentFindByVoucherNumberIntervalResult() {
        return scannedDocumentFindByVoucherNumberIntervalResult;
    }

    /**
     * Sets the value of the scannedDocumentFindByVoucherNumberIntervalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScannedDocumentHandle }
     *     
     */
    public void setScannedDocumentFindByVoucherNumberIntervalResult(ArrayOfScannedDocumentHandle value) {
        this.scannedDocumentFindByVoucherNumberIntervalResult = value;
    }

}
