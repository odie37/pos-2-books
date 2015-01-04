
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTemplateCollectionHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTemplateCollectionHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TemplateCollectionHandle" type="{http://e-conomic.com}TemplateCollectionHandle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTemplateCollectionHandle", propOrder = {
    "templateCollectionHandle"
})
public class ArrayOfTemplateCollectionHandle {

    @XmlElement(name = "TemplateCollectionHandle", nillable = true)
    protected List<TemplateCollectionHandle> templateCollectionHandle;

    /**
     * Gets the value of the templateCollectionHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateCollectionHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateCollectionHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateCollectionHandle }
     * 
     * 
     */
    public List<TemplateCollectionHandle> getTemplateCollectionHandle() {
        if (templateCollectionHandle == null) {
            templateCollectionHandle = new ArrayList<TemplateCollectionHandle>();
        }
        return this.templateCollectionHandle;
    }

}
