
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
 *         &lt;element name="TemplateCollection_GetDataResult" type="{http://e-conomic.com}TemplateCollectionData" minOccurs="0"/>
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
    "templateCollectionGetDataResult"
})
@XmlRootElement(name = "TemplateCollection_GetDataResponse")
public class TemplateCollectionGetDataResponse {

    @XmlElement(name = "TemplateCollection_GetDataResult")
    protected TemplateCollectionData templateCollectionGetDataResult;

    /**
     * Gets the value of the templateCollectionGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateCollectionData }
     *     
     */
    public TemplateCollectionData getTemplateCollectionGetDataResult() {
        return templateCollectionGetDataResult;
    }

    /**
     * Sets the value of the templateCollectionGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateCollectionData }
     *     
     */
    public void setTemplateCollectionGetDataResult(TemplateCollectionData value) {
        this.templateCollectionGetDataResult = value;
    }

}
