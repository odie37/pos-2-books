
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
 *         &lt;element name="ScannedDocument_GetPageCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "scannedDocumentGetPageCountResult"
})
@XmlRootElement(name = "ScannedDocument_GetPageCountResponse")
public class ScannedDocumentGetPageCountResponse {

    @XmlElement(name = "ScannedDocument_GetPageCountResult", required = true, type = Integer.class, nillable = true)
    protected Integer scannedDocumentGetPageCountResult;

    /**
     * Gets the value of the scannedDocumentGetPageCountResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScannedDocumentGetPageCountResult() {
        return scannedDocumentGetPageCountResult;
    }

    /**
     * Sets the value of the scannedDocumentGetPageCountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScannedDocumentGetPageCountResult(Integer value) {
        this.scannedDocumentGetPageCountResult = value;
    }

}
