
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
 *         &lt;element name="DocumentArchiveCategory_GetDocumentsResult" type="{http://e-conomic.com}ArrayOfScannedDocumentHandle" minOccurs="0"/>
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
    "documentArchiveCategoryGetDocumentsResult"
})
@XmlRootElement(name = "DocumentArchiveCategory_GetDocumentsResponse")
public class DocumentArchiveCategoryGetDocumentsResponse {

    @XmlElement(name = "DocumentArchiveCategory_GetDocumentsResult")
    protected ArrayOfScannedDocumentHandle documentArchiveCategoryGetDocumentsResult;

    /**
     * Gets the value of the documentArchiveCategoryGetDocumentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScannedDocumentHandle }
     *     
     */
    public ArrayOfScannedDocumentHandle getDocumentArchiveCategoryGetDocumentsResult() {
        return documentArchiveCategoryGetDocumentsResult;
    }

    /**
     * Sets the value of the documentArchiveCategoryGetDocumentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScannedDocumentHandle }
     *     
     */
    public void setDocumentArchiveCategoryGetDocumentsResult(ArrayOfScannedDocumentHandle value) {
        this.documentArchiveCategoryGetDocumentsResult = value;
    }

}
