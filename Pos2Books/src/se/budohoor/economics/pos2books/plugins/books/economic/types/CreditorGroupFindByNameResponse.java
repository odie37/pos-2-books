
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
 *         &lt;element name="CreditorGroup_FindByNameResult" type="{http://e-conomic.com}ArrayOfCreditorGroupHandle" minOccurs="0"/>
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
    "creditorGroupFindByNameResult"
})
@XmlRootElement(name = "CreditorGroup_FindByNameResponse")
public class CreditorGroupFindByNameResponse {

    @XmlElement(name = "CreditorGroup_FindByNameResult")
    protected ArrayOfCreditorGroupHandle creditorGroupFindByNameResult;

    /**
     * Gets the value of the creditorGroupFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorGroupHandle }
     *     
     */
    public ArrayOfCreditorGroupHandle getCreditorGroupFindByNameResult() {
        return creditorGroupFindByNameResult;
    }

    /**
     * Sets the value of the creditorGroupFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorGroupHandle }
     *     
     */
    public void setCreditorGroupFindByNameResult(ArrayOfCreditorGroupHandle value) {
        this.creditorGroupFindByNameResult = value;
    }

}
