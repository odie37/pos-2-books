
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
 *         &lt;element name="TermOfPayment_GetTypeResult" type="{http://e-conomic.com}TermOfPaymentType"/>
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
    "termOfPaymentGetTypeResult"
})
@XmlRootElement(name = "TermOfPayment_GetTypeResponse")
public class TermOfPaymentGetTypeResponse {

    @XmlElement(name = "TermOfPayment_GetTypeResult", required = true)
    protected TermOfPaymentType termOfPaymentGetTypeResult;

    /**
     * Gets the value of the termOfPaymentGetTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentType }
     *     
     */
    public TermOfPaymentType getTermOfPaymentGetTypeResult() {
        return termOfPaymentGetTypeResult;
    }

    /**
     * Sets the value of the termOfPaymentGetTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentType }
     *     
     */
    public void setTermOfPaymentGetTypeResult(TermOfPaymentType value) {
        this.termOfPaymentGetTypeResult = value;
    }

}
