
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
 *         &lt;element name="TermOfPayment_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfTermOfPaymentData" minOccurs="0"/>
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
    "termOfPaymentGetDataArrayResult"
})
@XmlRootElement(name = "TermOfPayment_GetDataArrayResponse")
public class TermOfPaymentGetDataArrayResponse {

    @XmlElement(name = "TermOfPayment_GetDataArrayResult")
    protected ArrayOfTermOfPaymentData termOfPaymentGetDataArrayResult;

    /**
     * Gets the value of the termOfPaymentGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTermOfPaymentData }
     *     
     */
    public ArrayOfTermOfPaymentData getTermOfPaymentGetDataArrayResult() {
        return termOfPaymentGetDataArrayResult;
    }

    /**
     * Sets the value of the termOfPaymentGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTermOfPaymentData }
     *     
     */
    public void setTermOfPaymentGetDataArrayResult(ArrayOfTermOfPaymentData value) {
        this.termOfPaymentGetDataArrayResult = value;
    }

}
