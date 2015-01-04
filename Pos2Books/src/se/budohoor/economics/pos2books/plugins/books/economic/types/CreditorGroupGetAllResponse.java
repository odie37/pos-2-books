
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
 *         &lt;element name="CreditorGroup_GetAllResult" type="{http://e-conomic.com}ArrayOfCreditorGroupHandle" minOccurs="0"/>
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
    "creditorGroupGetAllResult"
})
@XmlRootElement(name = "CreditorGroup_GetAllResponse")
public class CreditorGroupGetAllResponse {

    @XmlElement(name = "CreditorGroup_GetAllResult")
    protected ArrayOfCreditorGroupHandle creditorGroupGetAllResult;

    /**
     * Gets the value of the creditorGroupGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorGroupHandle }
     *     
     */
    public ArrayOfCreditorGroupHandle getCreditorGroupGetAllResult() {
        return creditorGroupGetAllResult;
    }

    /**
     * Sets the value of the creditorGroupGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorGroupHandle }
     *     
     */
    public void setCreditorGroupGetAllResult(ArrayOfCreditorGroupHandle value) {
        this.creditorGroupGetAllResult = value;
    }

}
