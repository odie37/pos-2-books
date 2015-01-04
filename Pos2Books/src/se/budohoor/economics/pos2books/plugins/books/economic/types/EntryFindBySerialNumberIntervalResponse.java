
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
 *         &lt;element name="Entry_FindBySerialNumberIntervalResult" type="{http://e-conomic.com}ArrayOfEntryHandle" minOccurs="0"/>
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
    "entryFindBySerialNumberIntervalResult"
})
@XmlRootElement(name = "Entry_FindBySerialNumberIntervalResponse")
public class EntryFindBySerialNumberIntervalResponse {

    @XmlElement(name = "Entry_FindBySerialNumberIntervalResult")
    protected ArrayOfEntryHandle entryFindBySerialNumberIntervalResult;

    /**
     * Gets the value of the entryFindBySerialNumberIntervalResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntryHandle }
     *     
     */
    public ArrayOfEntryHandle getEntryFindBySerialNumberIntervalResult() {
        return entryFindBySerialNumberIntervalResult;
    }

    /**
     * Sets the value of the entryFindBySerialNumberIntervalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntryHandle }
     *     
     */
    public void setEntryFindBySerialNumberIntervalResult(ArrayOfEntryHandle value) {
        this.entryFindBySerialNumberIntervalResult = value;
    }

}
