
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
 *         &lt;element name="CreditorContact_UpdateFromDataResult" type="{http://e-conomic.com}CreditorContactHandle" minOccurs="0"/>
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
    "creditorContactUpdateFromDataResult"
})
@XmlRootElement(name = "CreditorContact_UpdateFromDataResponse")
public class CreditorContactUpdateFromDataResponse {

    @XmlElement(name = "CreditorContact_UpdateFromDataResult")
    protected CreditorContactHandle creditorContactUpdateFromDataResult;

    /**
     * Gets the value of the creditorContactUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorContactHandle }
     *     
     */
    public CreditorContactHandle getCreditorContactUpdateFromDataResult() {
        return creditorContactUpdateFromDataResult;
    }

    /**
     * Sets the value of the creditorContactUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorContactHandle }
     *     
     */
    public void setCreditorContactUpdateFromDataResult(CreditorContactHandle value) {
        this.creditorContactUpdateFromDataResult = value;
    }

}
