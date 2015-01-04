
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
 *         &lt;element name="ScannedDocument_GetStatusResult" type="{http://e-conomic.com}DocumentStatus"/>
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
    "scannedDocumentGetStatusResult"
})
@XmlRootElement(name = "ScannedDocument_GetStatusResponse")
public class ScannedDocumentGetStatusResponse {

    @XmlElement(name = "ScannedDocument_GetStatusResult", required = true)
    protected DocumentStatus scannedDocumentGetStatusResult;

    /**
     * Gets the value of the scannedDocumentGetStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatus }
     *     
     */
    public DocumentStatus getScannedDocumentGetStatusResult() {
        return scannedDocumentGetStatusResult;
    }

    /**
     * Sets the value of the scannedDocumentGetStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatus }
     *     
     */
    public void setScannedDocumentGetStatusResult(DocumentStatus value) {
        this.scannedDocumentGetStatusResult = value;
    }

}
