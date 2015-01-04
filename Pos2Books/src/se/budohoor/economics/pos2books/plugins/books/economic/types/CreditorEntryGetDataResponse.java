
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
 *         &lt;element name="CreditorEntry_GetDataResult" type="{http://e-conomic.com}CreditorEntryData" minOccurs="0"/>
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
    "creditorEntryGetDataResult"
})
@XmlRootElement(name = "CreditorEntry_GetDataResponse")
public class CreditorEntryGetDataResponse {

    @XmlElement(name = "CreditorEntry_GetDataResult")
    protected CreditorEntryData creditorEntryGetDataResult;

    /**
     * Gets the value of the creditorEntryGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEntryData }
     *     
     */
    public CreditorEntryData getCreditorEntryGetDataResult() {
        return creditorEntryGetDataResult;
    }

    /**
     * Sets the value of the creditorEntryGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEntryData }
     *     
     */
    public void setCreditorEntryGetDataResult(CreditorEntryData value) {
        this.creditorEntryGetDataResult = value;
    }

}
