
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
 *         &lt;element name="Creditor_FindByNameResult" type="{http://e-conomic.com}ArrayOfCreditorHandle" minOccurs="0"/>
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
    "creditorFindByNameResult"
})
@XmlRootElement(name = "Creditor_FindByNameResponse")
public class CreditorFindByNameResponse {

    @XmlElement(name = "Creditor_FindByNameResult")
    protected ArrayOfCreditorHandle creditorFindByNameResult;

    /**
     * Gets the value of the creditorFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorHandle }
     *     
     */
    public ArrayOfCreditorHandle getCreditorFindByNameResult() {
        return creditorFindByNameResult;
    }

    /**
     * Sets the value of the creditorFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorHandle }
     *     
     */
    public void setCreditorFindByNameResult(ArrayOfCreditorHandle value) {
        this.creditorFindByNameResult = value;
    }

}
