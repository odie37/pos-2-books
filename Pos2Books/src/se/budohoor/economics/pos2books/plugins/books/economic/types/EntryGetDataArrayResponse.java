
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
 *         &lt;element name="Entry_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfEntryData" minOccurs="0"/>
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
    "entryGetDataArrayResult"
})
@XmlRootElement(name = "Entry_GetDataArrayResponse")
public class EntryGetDataArrayResponse {

    @XmlElement(name = "Entry_GetDataArrayResult")
    protected ArrayOfEntryData entryGetDataArrayResult;

    /**
     * Gets the value of the entryGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntryData }
     *     
     */
    public ArrayOfEntryData getEntryGetDataArrayResult() {
        return entryGetDataArrayResult;
    }

    /**
     * Sets the value of the entryGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntryData }
     *     
     */
    public void setEntryGetDataArrayResult(ArrayOfEntryData value) {
        this.entryGetDataArrayResult = value;
    }

}
