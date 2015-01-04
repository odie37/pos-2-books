
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
 *         &lt;element name="CreditorGroup_UpdateFromDataResult" type="{http://e-conomic.com}CreditorGroupHandle" minOccurs="0"/>
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
    "creditorGroupUpdateFromDataResult"
})
@XmlRootElement(name = "CreditorGroup_UpdateFromDataResponse")
public class CreditorGroupUpdateFromDataResponse {

    @XmlElement(name = "CreditorGroup_UpdateFromDataResult")
    protected CreditorGroupHandle creditorGroupUpdateFromDataResult;

    /**
     * Gets the value of the creditorGroupUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorGroupHandle }
     *     
     */
    public CreditorGroupHandle getCreditorGroupUpdateFromDataResult() {
        return creditorGroupUpdateFromDataResult;
    }

    /**
     * Sets the value of the creditorGroupUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorGroupHandle }
     *     
     */
    public void setCreditorGroupUpdateFromDataResult(CreditorGroupHandle value) {
        this.creditorGroupUpdateFromDataResult = value;
    }

}
