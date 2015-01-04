
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
 *         &lt;element name="documentArchiveCategoryHandle" type="{http://e-conomic.com}DocumentArchiveCategoryHandle" minOccurs="0"/>
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
    "documentArchiveCategoryHandle"
})
@XmlRootElement(name = "DocumentArchiveCategory_Delete")
public class DocumentArchiveCategoryDelete {

    protected DocumentArchiveCategoryHandle documentArchiveCategoryHandle;

    /**
     * Gets the value of the documentArchiveCategoryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentArchiveCategoryHandle }
     *     
     */
    public DocumentArchiveCategoryHandle getDocumentArchiveCategoryHandle() {
        return documentArchiveCategoryHandle;
    }

    /**
     * Sets the value of the documentArchiveCategoryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentArchiveCategoryHandle }
     *     
     */
    public void setDocumentArchiveCategoryHandle(DocumentArchiveCategoryHandle value) {
        this.documentArchiveCategoryHandle = value;
    }

}