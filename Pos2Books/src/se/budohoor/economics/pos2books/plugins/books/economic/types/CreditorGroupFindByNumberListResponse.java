
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
 *         &lt;element name="CreditorGroup_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfCreditorGroupHandle" minOccurs="0"/>
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
    "creditorGroupFindByNumberListResult"
})
@XmlRootElement(name = "CreditorGroup_FindByNumberListResponse")
public class CreditorGroupFindByNumberListResponse {

    @XmlElement(name = "CreditorGroup_FindByNumberListResult")
    protected ArrayOfCreditorGroupHandle creditorGroupFindByNumberListResult;

    /**
     * Gets the value of the creditorGroupFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorGroupHandle }
     *     
     */
    public ArrayOfCreditorGroupHandle getCreditorGroupFindByNumberListResult() {
        return creditorGroupFindByNumberListResult;
    }

    /**
     * Sets the value of the creditorGroupFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorGroupHandle }
     *     
     */
    public void setCreditorGroupFindByNumberListResult(ArrayOfCreditorGroupHandle value) {
        this.creditorGroupFindByNumberListResult = value;
    }

}
