
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
 *         &lt;element name="TermOfPayment_CreateResult" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
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
    "termOfPaymentCreateResult"
})
@XmlRootElement(name = "TermOfPayment_CreateResponse")
public class TermOfPaymentCreateResponse {

    @XmlElement(name = "TermOfPayment_CreateResult")
    protected TermOfPaymentHandle termOfPaymentCreateResult;

    /**
     * Gets the value of the termOfPaymentCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public TermOfPaymentHandle getTermOfPaymentCreateResult() {
        return termOfPaymentCreateResult;
    }

    /**
     * Sets the value of the termOfPaymentCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public void setTermOfPaymentCreateResult(TermOfPaymentHandle value) {
        this.termOfPaymentCreateResult = value;
    }

}
