
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
 *         &lt;element name="Creditor_GetTermOfPaymentResult" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
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
    "creditorGetTermOfPaymentResult"
})
@XmlRootElement(name = "Creditor_GetTermOfPaymentResponse")
public class CreditorGetTermOfPaymentResponse {

    @XmlElement(name = "Creditor_GetTermOfPaymentResult")
    protected TermOfPaymentHandle creditorGetTermOfPaymentResult;

    /**
     * Gets the value of the creditorGetTermOfPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public TermOfPaymentHandle getCreditorGetTermOfPaymentResult() {
        return creditorGetTermOfPaymentResult;
    }

    /**
     * Sets the value of the creditorGetTermOfPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public void setCreditorGetTermOfPaymentResult(TermOfPaymentHandle value) {
        this.creditorGetTermOfPaymentResult = value;
    }

}
