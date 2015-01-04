
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
 *         &lt;element name="creditorEntryHandle" type="{http://e-conomic.com}CreditorEntryHandle" minOccurs="0"/>
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
    "creditorEntryHandle"
})
@XmlRootElement(name = "CreditorEntry_GetAmountDefaultCurrency")
public class CreditorEntryGetAmountDefaultCurrency {

    protected CreditorEntryHandle creditorEntryHandle;

    /**
     * Gets the value of the creditorEntryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEntryHandle }
     *     
     */
    public CreditorEntryHandle getCreditorEntryHandle() {
        return creditorEntryHandle;
    }

    /**
     * Sets the value of the creditorEntryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEntryHandle }
     *     
     */
    public void setCreditorEntryHandle(CreditorEntryHandle value) {
        this.creditorEntryHandle = value;
    }

}
