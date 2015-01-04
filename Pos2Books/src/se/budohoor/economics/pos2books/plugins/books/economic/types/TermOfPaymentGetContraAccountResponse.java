
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
 *         &lt;element name="TermOfPayment_GetContraAccountResult" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "termOfPaymentGetContraAccountResult"
})
@XmlRootElement(name = "TermOfPayment_GetContraAccountResponse")
public class TermOfPaymentGetContraAccountResponse {

    @XmlElement(name = "TermOfPayment_GetContraAccountResult")
    protected AccountHandle termOfPaymentGetContraAccountResult;

    /**
     * Gets the value of the termOfPaymentGetContraAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getTermOfPaymentGetContraAccountResult() {
        return termOfPaymentGetContraAccountResult;
    }

    /**
     * Sets the value of the termOfPaymentGetContraAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setTermOfPaymentGetContraAccountResult(AccountHandle value) {
        this.termOfPaymentGetContraAccountResult = value;
    }

}
