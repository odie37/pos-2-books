
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
 *         &lt;element name="CreditorContact_CreateFromDataResult" type="{http://e-conomic.com}CreditorContactHandle" minOccurs="0"/>
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
    "creditorContactCreateFromDataResult"
})
@XmlRootElement(name = "CreditorContact_CreateFromDataResponse")
public class CreditorContactCreateFromDataResponse {

    @XmlElement(name = "CreditorContact_CreateFromDataResult")
    protected CreditorContactHandle creditorContactCreateFromDataResult;

    /**
     * Gets the value of the creditorContactCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorContactHandle }
     *     
     */
    public CreditorContactHandle getCreditorContactCreateFromDataResult() {
        return creditorContactCreateFromDataResult;
    }

    /**
     * Sets the value of the creditorContactCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorContactHandle }
     *     
     */
    public void setCreditorContactCreateFromDataResult(CreditorContactHandle value) {
        this.creditorContactCreateFromDataResult = value;
    }

}
