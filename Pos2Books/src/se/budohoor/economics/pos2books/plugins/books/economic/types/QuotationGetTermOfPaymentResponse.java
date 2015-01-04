
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
 *         &lt;element name="Quotation_GetTermOfPaymentResult" type="{http://e-conomic.com}TermOfPaymentHandle" minOccurs="0"/>
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
    "quotationGetTermOfPaymentResult"
})
@XmlRootElement(name = "Quotation_GetTermOfPaymentResponse")
public class QuotationGetTermOfPaymentResponse {

    @XmlElement(name = "Quotation_GetTermOfPaymentResult")
    protected TermOfPaymentHandle quotationGetTermOfPaymentResult;

    /**
     * Gets the value of the quotationGetTermOfPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public TermOfPaymentHandle getQuotationGetTermOfPaymentResult() {
        return quotationGetTermOfPaymentResult;
    }

    /**
     * Sets the value of the quotationGetTermOfPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentHandle }
     *     
     */
    public void setQuotationGetTermOfPaymentResult(TermOfPaymentHandle value) {
        this.quotationGetTermOfPaymentResult = value;
    }

}
