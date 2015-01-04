
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
 *         &lt;element name="Creditor_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCreditorHandle" minOccurs="0"/>
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
    "creditorCreateFromDataArrayResult"
})
@XmlRootElement(name = "Creditor_CreateFromDataArrayResponse")
public class CreditorCreateFromDataArrayResponse {

    @XmlElement(name = "Creditor_CreateFromDataArrayResult")
    protected ArrayOfCreditorHandle creditorCreateFromDataArrayResult;

    /**
     * Gets the value of the creditorCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorHandle }
     *     
     */
    public ArrayOfCreditorHandle getCreditorCreateFromDataArrayResult() {
        return creditorCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the creditorCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorHandle }
     *     
     */
    public void setCreditorCreateFromDataArrayResult(ArrayOfCreditorHandle value) {
        this.creditorCreateFromDataArrayResult = value;
    }

}
