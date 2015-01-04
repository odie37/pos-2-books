
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
 *         &lt;element name="Entry_GetDocumentResult" type="{http://e-conomic.com}ScannedDocumentHandle" minOccurs="0"/>
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
    "entryGetDocumentResult"
})
@XmlRootElement(name = "Entry_GetDocumentResponse")
public class EntryGetDocumentResponse {

    @XmlElement(name = "Entry_GetDocumentResult")
    protected ScannedDocumentHandle entryGetDocumentResult;

    /**
     * Gets the value of the entryGetDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public ScannedDocumentHandle getEntryGetDocumentResult() {
        return entryGetDocumentResult;
    }

    /**
     * Sets the value of the entryGetDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScannedDocumentHandle }
     *     
     */
    public void setEntryGetDocumentResult(ScannedDocumentHandle value) {
        this.entryGetDocumentResult = value;
    }

}
