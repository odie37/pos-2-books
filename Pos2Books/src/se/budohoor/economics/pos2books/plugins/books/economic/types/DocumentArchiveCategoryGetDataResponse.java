
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
 *         &lt;element name="DocumentArchiveCategory_GetDataResult" type="{http://e-conomic.com}DocumentArchiveCategoryData" minOccurs="0"/>
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
    "documentArchiveCategoryGetDataResult"
})
@XmlRootElement(name = "DocumentArchiveCategory_GetDataResponse")
public class DocumentArchiveCategoryGetDataResponse {

    @XmlElement(name = "DocumentArchiveCategory_GetDataResult")
    protected DocumentArchiveCategoryData documentArchiveCategoryGetDataResult;

    /**
     * Gets the value of the documentArchiveCategoryGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentArchiveCategoryData }
     *     
     */
    public DocumentArchiveCategoryData getDocumentArchiveCategoryGetDataResult() {
        return documentArchiveCategoryGetDataResult;
    }

    /**
     * Sets the value of the documentArchiveCategoryGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentArchiveCategoryData }
     *     
     */
    public void setDocumentArchiveCategoryGetDataResult(DocumentArchiveCategoryData value) {
        this.documentArchiveCategoryGetDataResult = value;
    }

}
