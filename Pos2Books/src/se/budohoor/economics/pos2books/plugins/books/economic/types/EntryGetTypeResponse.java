
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
 *         &lt;element name="Entry_GetTypeResult" type="{http://e-conomic.com}EntryType"/>
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
    "entryGetTypeResult"
})
@XmlRootElement(name = "Entry_GetTypeResponse")
public class EntryGetTypeResponse {

    @XmlElement(name = "Entry_GetTypeResult", required = true)
    protected EntryType entryGetTypeResult;

    /**
     * Gets the value of the entryGetTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EntryType }
     *     
     */
    public EntryType getEntryGetTypeResult() {
        return entryGetTypeResult;
    }

    /**
     * Sets the value of the entryGetTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryType }
     *     
     */
    public void setEntryGetTypeResult(EntryType value) {
        this.entryGetTypeResult = value;
    }

}
