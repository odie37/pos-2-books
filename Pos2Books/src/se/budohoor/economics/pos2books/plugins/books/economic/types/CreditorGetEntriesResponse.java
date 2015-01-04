
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
 *         &lt;element name="Creditor_GetEntriesResult" type="{http://e-conomic.com}ArrayOfCreditorEntryHandle" minOccurs="0"/>
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
    "creditorGetEntriesResult"
})
@XmlRootElement(name = "Creditor_GetEntriesResponse")
public class CreditorGetEntriesResponse {

    @XmlElement(name = "Creditor_GetEntriesResult")
    protected ArrayOfCreditorEntryHandle creditorGetEntriesResult;

    /**
     * Gets the value of the creditorGetEntriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public ArrayOfCreditorEntryHandle getCreditorGetEntriesResult() {
        return creditorGetEntriesResult;
    }

    /**
     * Sets the value of the creditorGetEntriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public void setCreditorGetEntriesResult(ArrayOfCreditorEntryHandle value) {
        this.creditorGetEntriesResult = value;
    }

}
