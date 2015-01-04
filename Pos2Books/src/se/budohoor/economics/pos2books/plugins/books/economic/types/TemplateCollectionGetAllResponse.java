
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
 *         &lt;element name="TemplateCollection_GetAllResult" type="{http://e-conomic.com}ArrayOfTemplateCollectionHandle" minOccurs="0"/>
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
    "templateCollectionGetAllResult"
})
@XmlRootElement(name = "TemplateCollection_GetAllResponse")
public class TemplateCollectionGetAllResponse {

    @XmlElement(name = "TemplateCollection_GetAllResult")
    protected ArrayOfTemplateCollectionHandle templateCollectionGetAllResult;

    /**
     * Gets the value of the templateCollectionGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTemplateCollectionHandle }
     *     
     */
    public ArrayOfTemplateCollectionHandle getTemplateCollectionGetAllResult() {
        return templateCollectionGetAllResult;
    }

    /**
     * Sets the value of the templateCollectionGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTemplateCollectionHandle }
     *     
     */
    public void setTemplateCollectionGetAllResult(ArrayOfTemplateCollectionHandle value) {
        this.templateCollectionGetAllResult = value;
    }

}
