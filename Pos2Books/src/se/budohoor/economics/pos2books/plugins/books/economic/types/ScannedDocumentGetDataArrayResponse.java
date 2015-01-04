
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
 *         &lt;element name="ScannedDocument_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfScannedDocumentData" minOccurs="0"/>
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
    "scannedDocumentGetDataArrayResult"
})
@XmlRootElement(name = "ScannedDocument_GetDataArrayResponse")
public class ScannedDocumentGetDataArrayResponse {

    @XmlElement(name = "ScannedDocument_GetDataArrayResult")
    protected ArrayOfScannedDocumentData scannedDocumentGetDataArrayResult;

    /**
     * Gets the value of the scannedDocumentGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScannedDocumentData }
     *     
     */
    public ArrayOfScannedDocumentData getScannedDocumentGetDataArrayResult() {
        return scannedDocumentGetDataArrayResult;
    }

    /**
     * Sets the value of the scannedDocumentGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScannedDocumentData }
     *     
     */
    public void setScannedDocumentGetDataArrayResult(ArrayOfScannedDocumentData value) {
        this.scannedDocumentGetDataArrayResult = value;
    }

}
