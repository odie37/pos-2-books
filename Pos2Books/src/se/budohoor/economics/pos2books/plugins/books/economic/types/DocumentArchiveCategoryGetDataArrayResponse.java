
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
 *         &lt;element name="DocumentArchiveCategory_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfDocumentArchiveCategoryData" minOccurs="0"/>
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
    "documentArchiveCategoryGetDataArrayResult"
})
@XmlRootElement(name = "DocumentArchiveCategory_GetDataArrayResponse")
public class DocumentArchiveCategoryGetDataArrayResponse {

    @XmlElement(name = "DocumentArchiveCategory_GetDataArrayResult")
    protected ArrayOfDocumentArchiveCategoryData documentArchiveCategoryGetDataArrayResult;

    /**
     * Gets the value of the documentArchiveCategoryGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentArchiveCategoryData }
     *     
     */
    public ArrayOfDocumentArchiveCategoryData getDocumentArchiveCategoryGetDataArrayResult() {
        return documentArchiveCategoryGetDataArrayResult;
    }

    /**
     * Sets the value of the documentArchiveCategoryGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentArchiveCategoryData }
     *     
     */
    public void setDocumentArchiveCategoryGetDataArrayResult(ArrayOfDocumentArchiveCategoryData value) {
        this.documentArchiveCategoryGetDataArrayResult = value;
    }

}
