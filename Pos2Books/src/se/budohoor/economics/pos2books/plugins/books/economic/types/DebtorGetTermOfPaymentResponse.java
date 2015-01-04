
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
 *         &lt;element name="Debtor_GetTermOfPaymentResult" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
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
    "debtorGetTermOfPaymentResult"
})
@XmlRootElement(name = "Debtor_GetTermOfPaymentResponse")
public class DebtorGetTermOfPaymentResponse {

    @XmlElement(name = "Debtor_GetTermOfPaymentResult")
    protected TermOfPaymentHandle debtorGetTermOfPaymentResult;

    /**
     * Gets the value of the debtorGetTermOfPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public TermOfPaymentHandle getDebtorGetTermOfPaymentResult() {
        return debtorGetTermOfPaymentResult;
    }

    /**
     * Sets the value of the debtorGetTermOfPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public void setDebtorGetTermOfPaymentResult(TermOfPaymentHandle value) {
        this.debtorGetTermOfPaymentResult = value;
    }

}
