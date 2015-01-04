
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
 *         &lt;element name="TermOfPayment_GetContraAccount2Result" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "termOfPaymentGetContraAccount2Result"
})
@XmlRootElement(name = "TermOfPayment_GetContraAccount2Response")
public class TermOfPaymentGetContraAccount2Response {

    @XmlElement(name = "TermOfPayment_GetContraAccount2Result")
    protected AccountHandle termOfPaymentGetContraAccount2Result;

    /**
     * Gets the value of the termOfPaymentGetContraAccount2Result property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getTermOfPaymentGetContraAccount2Result() {
        return termOfPaymentGetContraAccount2Result;
    }

    /**
     * Sets the value of the termOfPaymentGetContraAccount2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setTermOfPaymentGetContraAccount2Result(AccountHandle value) {
        this.termOfPaymentGetContraAccount2Result = value;
    }

}
