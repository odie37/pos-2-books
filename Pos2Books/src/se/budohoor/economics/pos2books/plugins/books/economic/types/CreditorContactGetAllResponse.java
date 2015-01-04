
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
 *         &lt;element name="CreditorContact_GetAllResult" type="{http://e-conomic.com}ArrayOfCreditorContactHandle" minOccurs="0"/>
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
    "creditorContactGetAllResult"
})
@XmlRootElement(name = "CreditorContact_GetAllResponse")
public class CreditorContactGetAllResponse {

    @XmlElement(name = "CreditorContact_GetAllResult")
    protected ArrayOfCreditorContactHandle creditorContactGetAllResult;

    /**
     * Gets the value of the creditorContactGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorContactHandle }
     *     
     */
    public ArrayOfCreditorContactHandle getCreditorContactGetAllResult() {
        return creditorContactGetAllResult;
    }

    /**
     * Sets the value of the creditorContactGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorContactHandle }
     *     
     */
    public void setCreditorContactGetAllResult(ArrayOfCreditorContactHandle value) {
        this.creditorContactGetAllResult = value;
    }

}
