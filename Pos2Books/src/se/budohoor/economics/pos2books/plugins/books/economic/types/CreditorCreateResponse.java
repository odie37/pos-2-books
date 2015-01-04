
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
 *         &lt;element name="Creditor_CreateResult" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
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
    "creditorCreateResult"
})
@XmlRootElement(name = "Creditor_CreateResponse")
public class CreditorCreateResponse {

    @XmlElement(name = "Creditor_CreateResult")
    protected CreditorHandle creditorCreateResult;

    /**
     * Gets the value of the creditorCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getCreditorCreateResult() {
        return creditorCreateResult;
    }

    /**
     * Sets the value of the creditorCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setCreditorCreateResult(CreditorHandle value) {
        this.creditorCreateResult = value;
    }

}
