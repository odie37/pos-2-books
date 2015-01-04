
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
 *         &lt;element name="Creditor_GetAttentionResult" type="{http://e-conomic.com}CreditorContactHandle" minOccurs="0"/>
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
    "creditorGetAttentionResult"
})
@XmlRootElement(name = "Creditor_GetAttentionResponse")
public class CreditorGetAttentionResponse {

    @XmlElement(name = "Creditor_GetAttentionResult")
    protected CreditorContactHandle creditorGetAttentionResult;

    /**
     * Gets the value of the creditorGetAttentionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorContactHandle }
     *     
     */
    public CreditorContactHandle getCreditorGetAttentionResult() {
        return creditorGetAttentionResult;
    }

    /**
     * Sets the value of the creditorGetAttentionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorContactHandle }
     *     
     */
    public void setCreditorGetAttentionResult(CreditorContactHandle value) {
        this.creditorGetAttentionResult = value;
    }

}
