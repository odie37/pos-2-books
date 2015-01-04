
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
 *         &lt;element name="Creditor_GetDefaultPaymentTypeResult" type="{http://e-conomic.com}BankPaymentTypeHandle" minOccurs="0"/>
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
    "creditorGetDefaultPaymentTypeResult"
})
@XmlRootElement(name = "Creditor_GetDefaultPaymentTypeResponse")
public class CreditorGetDefaultPaymentTypeResponse {

    @XmlElement(name = "Creditor_GetDefaultPaymentTypeResult")
    protected BankPaymentTypeHandle creditorGetDefaultPaymentTypeResult;

    /**
     * Gets the value of the creditorGetDefaultPaymentTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public BankPaymentTypeHandle getCreditorGetDefaultPaymentTypeResult() {
        return creditorGetDefaultPaymentTypeResult;
    }

    /**
     * Sets the value of the creditorGetDefaultPaymentTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public void setCreditorGetDefaultPaymentTypeResult(BankPaymentTypeHandle value) {
        this.creditorGetDefaultPaymentTypeResult = value;
    }

}
