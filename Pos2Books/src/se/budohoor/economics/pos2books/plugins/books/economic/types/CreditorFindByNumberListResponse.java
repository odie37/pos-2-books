
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
 *         &lt;element name="Creditor_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfCreditorHandle" minOccurs="0"/>
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
    "creditorFindByNumberListResult"
})
@XmlRootElement(name = "Creditor_FindByNumberListResponse")
public class CreditorFindByNumberListResponse {

    @XmlElement(name = "Creditor_FindByNumberListResult")
    protected ArrayOfCreditorHandle creditorFindByNumberListResult;

    /**
     * Gets the value of the creditorFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorHandle }
     *     
     */
    public ArrayOfCreditorHandle getCreditorFindByNumberListResult() {
        return creditorFindByNumberListResult;
    }

    /**
     * Sets the value of the creditorFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorHandle }
     *     
     */
    public void setCreditorFindByNumberListResult(ArrayOfCreditorHandle value) {
        this.creditorFindByNumberListResult = value;
    }

}
