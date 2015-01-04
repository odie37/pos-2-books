
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
 *         &lt;element name="TermOfPayment_GetDataResult" type="{http://e-conomic.com}TermOfPaymentData" minOccurs="0"/>
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
    "termOfPaymentGetDataResult"
})
@XmlRootElement(name = "TermOfPayment_GetDataResponse")
public class TermOfPaymentGetDataResponse {

    @XmlElement(name = "TermOfPayment_GetDataResult")
    protected TermOfPaymentData termOfPaymentGetDataResult;

    /**
     * Gets the value of the termOfPaymentGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermOfPaymentData }
     *     
     */
    public TermOfPaymentData getTermOfPaymentGetDataResult() {
        return termOfPaymentGetDataResult;
    }

    /**
     * Sets the value of the termOfPaymentGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermOfPaymentData }
     *     
     */
    public void setTermOfPaymentGetDataResult(TermOfPaymentData value) {
        this.termOfPaymentGetDataResult = value;
    }

}
