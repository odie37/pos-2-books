
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
 *         &lt;element name="CreditorContact_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCreditorContactHandle" minOccurs="0"/>
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
    "creditorContactUpdateFromDataArrayResult"
})
@XmlRootElement(name = "CreditorContact_UpdateFromDataArrayResponse")
public class CreditorContactUpdateFromDataArrayResponse {

    @XmlElement(name = "CreditorContact_UpdateFromDataArrayResult")
    protected ArrayOfCreditorContactHandle creditorContactUpdateFromDataArrayResult;

    /**
     * Gets the value of the creditorContactUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorContactHandle }
     *     
     */
    public ArrayOfCreditorContactHandle getCreditorContactUpdateFromDataArrayResult() {
        return creditorContactUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the creditorContactUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorContactHandle }
     *     
     */
    public void setCreditorContactUpdateFromDataArrayResult(ArrayOfCreditorContactHandle value) {
        this.creditorContactUpdateFromDataArrayResult = value;
    }

}
