
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
 *         &lt;element name="CreditorEntry_FindBySerialNumberResult" type="{http://e-conomic.com}ArrayOfCreditorEntryHandle" minOccurs="0"/>
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
    "creditorEntryFindBySerialNumberResult"
})
@XmlRootElement(name = "CreditorEntry_FindBySerialNumberResponse")
public class CreditorEntryFindBySerialNumberResponse {

    @XmlElement(name = "CreditorEntry_FindBySerialNumberResult")
    protected ArrayOfCreditorEntryHandle creditorEntryFindBySerialNumberResult;

    /**
     * Gets the value of the creditorEntryFindBySerialNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public ArrayOfCreditorEntryHandle getCreditorEntryFindBySerialNumberResult() {
        return creditorEntryFindBySerialNumberResult;
    }

    /**
     * Sets the value of the creditorEntryFindBySerialNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorEntryHandle }
     *     
     */
    public void setCreditorEntryFindBySerialNumberResult(ArrayOfCreditorEntryHandle value) {
        this.creditorEntryFindBySerialNumberResult = value;
    }

}
