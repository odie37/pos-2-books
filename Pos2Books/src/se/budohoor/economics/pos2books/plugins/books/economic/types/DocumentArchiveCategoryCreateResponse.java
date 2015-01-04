
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
 *         &lt;element name="DocumentArchiveCategory_CreateResult" type="{http://e-conomic.com}DocumentArchiveCategoryHandle" minOccurs="0"/>
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
    "documentArchiveCategoryCreateResult"
})
@XmlRootElement(name = "DocumentArchiveCategory_CreateResponse")
public class DocumentArchiveCategoryCreateResponse {

    @XmlElement(name = "DocumentArchiveCategory_CreateResult")
    protected DocumentArchiveCategoryHandle documentArchiveCategoryCreateResult;

    /**
     * Gets the value of the documentArchiveCategoryCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentArchiveCategoryHandle }
     *     
     */
    public DocumentArchiveCategoryHandle getDocumentArchiveCategoryCreateResult() {
        return documentArchiveCategoryCreateResult;
    }

    /**
     * Sets the value of the documentArchiveCategoryCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentArchiveCategoryHandle }
     *     
     */
    public void setDocumentArchiveCategoryCreateResult(DocumentArchiveCategoryHandle value) {
        this.documentArchiveCategoryCreateResult = value;
    }

}
