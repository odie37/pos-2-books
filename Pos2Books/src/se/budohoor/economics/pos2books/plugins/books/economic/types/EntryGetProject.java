
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="entryHandle" type="{http://e-conomic.com}EntryHandle" minOccurs="0"/>
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
    "entryHandle"
})
@XmlRootElement(name = "Entry_GetProject")
public class EntryGetProject {

    protected EntryHandle entryHandle;

    /**
     * Gets the value of the entryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EntryHandle }
     *     
     */
    public EntryHandle getEntryHandle() {
        return entryHandle;
    }

    /**
     * Sets the value of the entryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryHandle }
     *     
     */
    public void setEntryHandle(EntryHandle value) {
        this.entryHandle = value;
    }

}
