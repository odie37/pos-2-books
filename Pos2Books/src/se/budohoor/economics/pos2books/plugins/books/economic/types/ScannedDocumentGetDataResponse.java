
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
 *         &lt;element name="ScannedDocument_GetDataResult" type="{http://e-conomic.com}ScannedDocumentData" minOccurs="0"/>
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
    "scannedDocumentGetDataResult"
})
@XmlRootElement(name = "ScannedDocument_GetDataResponse")
public class ScannedDocumentGetDataResponse {

    @XmlElement(name = "ScannedDocument_GetDataResult")
    protected ScannedDocumentData scannedDocumentGetDataResult;

    /**
     * Gets the value of the scannedDocumentGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ScannedDocumentData }
     *     
     */
    public ScannedDocumentData getScannedDocumentGetDataResult() {
        return scannedDocumentGetDataResult;
    }

    /**
     * Sets the value of the scannedDocumentGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScannedDocumentData }
     *     
     */
    public void setScannedDocumentGetDataResult(ScannedDocumentData value) {
        this.scannedDocumentGetDataResult = value;
    }

}
