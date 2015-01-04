
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
 *         &lt;element name="CreditorContact_GetCreditorResult" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
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
    "creditorContactGetCreditorResult"
})
@XmlRootElement(name = "CreditorContact_GetCreditorResponse")
public class CreditorContactGetCreditorResponse {

    @XmlElement(name = "CreditorContact_GetCreditorResult")
    protected CreditorHandle creditorContactGetCreditorResult;

    /**
     * Gets the value of the creditorContactGetCreditorResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getCreditorContactGetCreditorResult() {
        return creditorContactGetCreditorResult;
    }

    /**
     * Sets the value of the creditorContactGetCreditorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setCreditorContactGetCreditorResult(CreditorHandle value) {
        this.creditorContactGetCreditorResult = value;
    }

}
