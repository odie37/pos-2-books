
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
 *         &lt;element name="DocumentArchiveCategory_GetAllResult" type="{http://e-conomic.com}ArrayOfDocumentArchiveCategoryHandle" minOccurs="0"/>
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
    "documentArchiveCategoryGetAllResult"
})
@XmlRootElement(name = "DocumentArchiveCategory_GetAllResponse")
public class DocumentArchiveCategoryGetAllResponse {

    @XmlElement(name = "DocumentArchiveCategory_GetAllResult")
    protected ArrayOfDocumentArchiveCategoryHandle documentArchiveCategoryGetAllResult;

    /**
     * Gets the value of the documentArchiveCategoryGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentArchiveCategoryHandle }
     *     
     */
    public ArrayOfDocumentArchiveCategoryHandle getDocumentArchiveCategoryGetAllResult() {
        return documentArchiveCategoryGetAllResult;
    }

    /**
     * Sets the value of the documentArchiveCategoryGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentArchiveCategoryHandle }
     *     
     */
    public void setDocumentArchiveCategoryGetAllResult(ArrayOfDocumentArchiveCategoryHandle value) {
        this.documentArchiveCategoryGetAllResult = value;
    }

}
