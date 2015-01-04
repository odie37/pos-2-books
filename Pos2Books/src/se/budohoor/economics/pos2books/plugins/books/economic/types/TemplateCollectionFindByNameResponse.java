
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
 *         &lt;element name="TemplateCollection_FindByNameResult" type="{http://e-conomic.com}ArrayOfTemplateCollectionHandle" minOccurs="0"/>
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
    "templateCollectionFindByNameResult"
})
@XmlRootElement(name = "TemplateCollection_FindByNameResponse")
public class TemplateCollectionFindByNameResponse {

    @XmlElement(name = "TemplateCollection_FindByNameResult")
    protected ArrayOfTemplateCollectionHandle templateCollectionFindByNameResult;

    /**
     * Gets the value of the templateCollectionFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTemplateCollectionHandle }
     *     
     */
    public ArrayOfTemplateCollectionHandle getTemplateCollectionFindByNameResult() {
        return templateCollectionFindByNameResult;
    }

    /**
     * Sets the value of the templateCollectionFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTemplateCollectionHandle }
     *     
     */
    public void setTemplateCollectionFindByNameResult(ArrayOfTemplateCollectionHandle value) {
        this.templateCollectionFindByNameResult = value;
    }

}
