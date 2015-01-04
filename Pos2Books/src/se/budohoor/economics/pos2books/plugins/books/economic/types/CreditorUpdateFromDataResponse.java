
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
 *         &lt;element name="Creditor_UpdateFromDataResult" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
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
    "creditorUpdateFromDataResult"
})
@XmlRootElement(name = "Creditor_UpdateFromDataResponse")
public class CreditorUpdateFromDataResponse {

    @XmlElement(name = "Creditor_UpdateFromDataResult")
    protected CreditorHandle creditorUpdateFromDataResult;

    /**
     * Gets the value of the creditorUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getCreditorUpdateFromDataResult() {
        return creditorUpdateFromDataResult;
    }

    /**
     * Sets the value of the creditorUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setCreditorUpdateFromDataResult(CreditorHandle value) {
        this.creditorUpdateFromDataResult = value;
    }

}
