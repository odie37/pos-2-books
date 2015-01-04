
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
 *         &lt;element name="DocumentArchiveCategory_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDocumentArchiveCategoryHandle" minOccurs="0"/>
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
    "documentArchiveCategoryCreateFromDataArrayResult"
})
@XmlRootElement(name = "DocumentArchiveCategory_CreateFromDataArrayResponse")
public class DocumentArchiveCategoryCreateFromDataArrayResponse {

    @XmlElement(name = "DocumentArchiveCategory_CreateFromDataArrayResult")
    protected ArrayOfDocumentArchiveCategoryHandle documentArchiveCategoryCreateFromDataArrayResult;

    /**
     * Gets the value of the documentArchiveCategoryCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentArchiveCategoryHandle }
     *     
     */
    public ArrayOfDocumentArchiveCategoryHandle getDocumentArchiveCategoryCreateFromDataArrayResult() {
        return documentArchiveCategoryCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the documentArchiveCategoryCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentArchiveCategoryHandle }
     *     
     */
    public void setDocumentArchiveCategoryCreateFromDataArrayResult(ArrayOfDocumentArchiveCategoryHandle value) {
        this.documentArchiveCategoryCreateFromDataArrayResult = value;
    }

}
