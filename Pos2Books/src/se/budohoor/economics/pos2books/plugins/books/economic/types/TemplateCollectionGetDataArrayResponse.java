
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
 *         &lt;element name="TemplateCollection_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfTemplateCollectionData" minOccurs="0"/>
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
    "templateCollectionGetDataArrayResult"
})
@XmlRootElement(name = "TemplateCollection_GetDataArrayResponse")
public class TemplateCollectionGetDataArrayResponse {

    @XmlElement(name = "TemplateCollection_GetDataArrayResult")
    protected ArrayOfTemplateCollectionData templateCollectionGetDataArrayResult;

    /**
     * Gets the value of the templateCollectionGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTemplateCollectionData }
     *     
     */
    public ArrayOfTemplateCollectionData getTemplateCollectionGetDataArrayResult() {
        return templateCollectionGetDataArrayResult;
    }

    /**
     * Sets the value of the templateCollectionGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTemplateCollectionData }
     *     
     */
    public void setTemplateCollectionGetDataArrayResult(ArrayOfTemplateCollectionData value) {
        this.templateCollectionGetDataArrayResult = value;
    }

}
