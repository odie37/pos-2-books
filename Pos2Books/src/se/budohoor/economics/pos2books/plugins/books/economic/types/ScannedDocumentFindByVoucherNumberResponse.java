
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
 *         &lt;element name="ScannedDocument_FindByVoucherNumberResult" type="{http://e-conomic.com}ScannedDocumentHandle" minOccurs="0"/>
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
    "scannedDocumentFindByVoucherNumberResult"
})
@XmlRootElement(name = "ScannedDocument_FindByVoucherNumberResponse")
public class ScannedDocumentFindByVoucherNumberResponse {

    @XmlElement(name = "ScannedDocument_FindByVoucherNumberResult")
    protected ScannedDocumentHandle scannedDocumentFindByVoucherNumberResult;

    /**
     * Gets the value of the scannedDocumentFindByVoucherNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public ScannedDocumentHandle getScannedDocumentFindByVoucherNumberResult() {
        return scannedDocumentFindByVoucherNumberResult;
    }

    /**
     * Sets the value of the scannedDocumentFindByVoucherNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public void setScannedDocumentFindByVoucherNumberResult(ScannedDocumentHandle value) {
        this.scannedDocumentFindByVoucherNumberResult = value;
    }

}
