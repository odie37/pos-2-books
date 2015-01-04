
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
 *         &lt;element name="CreditorContact_FindByNameResult" type="{http://e-conomic.com}ArrayOfCreditorContactHandle" minOccurs="0"/>
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
    "creditorContactFindByNameResult"
})
@XmlRootElement(name = "CreditorContact_FindByNameResponse")
public class CreditorContactFindByNameResponse {

    @XmlElement(name = "CreditorContact_FindByNameResult")
    protected ArrayOfCreditorContactHandle creditorContactFindByNameResult;

    /**
     * Gets the value of the creditorContactFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorContactHandle }
     *     
     */
    public ArrayOfCreditorContactHandle getCreditorContactFindByNameResult() {
        return creditorContactFindByNameResult;
    }

    /**
     * Sets the value of the creditorContactFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorContactHandle }
     *     
     */
    public void setCreditorContactFindByNameResult(ArrayOfCreditorContactHandle value) {
        this.creditorContactFindByNameResult = value;
    }

}
