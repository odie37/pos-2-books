
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
 *         &lt;element name="DocumentArchiveCategory_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDocumentArchiveCategoryHandle" minOccurs="0"/>
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
    "documentArchiveCategoryUpdateFromDataArrayResult"
})
@XmlRootElement(name = "DocumentArchiveCategory_UpdateFromDataArrayResponse")
public class DocumentArchiveCategoryUpdateFromDataArrayResponse {

    @XmlElement(name = "DocumentArchiveCategory_UpdateFromDataArrayResult")
    protected ArrayOfDocumentArchiveCategoryHandle documentArchiveCategoryUpdateFromDataArrayResult;

    /**
     * Gets the value of the documentArchiveCategoryUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentArchiveCategoryHandle }
     *     
     */
    public ArrayOfDocumentArchiveCategoryHandle getDocumentArchiveCategoryUpdateFromDataArrayResult() {
        return documentArchiveCategoryUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the documentArchiveCategoryUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentArchiveCategoryHandle }
     *     
     */
    public void setDocumentArchiveCategoryUpdateFromDataArrayResult(ArrayOfDocumentArchiveCategoryHandle value) {
        this.documentArchiveCategoryUpdateFromDataArrayResult = value;
    }

}
