
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
 *         &lt;element name="Creditor_CreateFromDataResult" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
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
    "creditorCreateFromDataResult"
})
@XmlRootElement(name = "Creditor_CreateFromDataResponse")
public class CreditorCreateFromDataResponse {

    @XmlElement(name = "Creditor_CreateFromDataResult")
    protected CreditorHandle creditorCreateFromDataResult;

    /**
     * Gets the value of the creditorCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getCreditorCreateFromDataResult() {
        return creditorCreateFromDataResult;
    }

    /**
     * Sets the value of the creditorCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setCreditorCreateFromDataResult(CreditorHandle value) {
        this.creditorCreateFromDataResult = value;
    }

}
