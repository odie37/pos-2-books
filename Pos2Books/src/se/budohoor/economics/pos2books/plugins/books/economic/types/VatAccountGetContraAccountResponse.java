
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
 *         &lt;element name="VatAccount_GetContraAccountResult" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "vatAccountGetContraAccountResult"
})
@XmlRootElement(name = "VatAccount_GetContraAccountResponse")
public class VatAccountGetContraAccountResponse {

    @XmlElement(name = "VatAccount_GetContraAccountResult")
    protected AccountHandle vatAccountGetContraAccountResult;

    /**
     * Gets the value of the vatAccountGetContraAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getVatAccountGetContraAccountResult() {
        return vatAccountGetContraAccountResult;
    }

    /**
     * Sets the value of the vatAccountGetContraAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setVatAccountGetContraAccountResult(AccountHandle value) {
        this.vatAccountGetContraAccountResult = value;
    }

}
