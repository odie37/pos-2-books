
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
 *         &lt;element name="CreditorGroup_CreateResult" type="{http://e-conomic.com}CreditorGroupHandle" minOccurs="0"/>
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
    "creditorGroupCreateResult"
})
@XmlRootElement(name = "CreditorGroup_CreateResponse")
public class CreditorGroupCreateResponse {

    @XmlElement(name = "CreditorGroup_CreateResult")
    protected CreditorGroupHandle creditorGroupCreateResult;

    /**
     * Gets the value of the creditorGroupCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorGroupHandle }
     *     
     */
    public CreditorGroupHandle getCreditorGroupCreateResult() {
        return creditorGroupCreateResult;
    }

    /**
     * Sets the value of the creditorGroupCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorGroupHandle }
     *     
     */
    public void setCreditorGroupCreateResult(CreditorGroupHandle value) {
        this.creditorGroupCreateResult = value;
    }

}
