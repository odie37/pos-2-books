
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
 *         &lt;element name="TermOfPayment_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfTermOfPaymentHandle" minOccurs="0"/>
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
    "termOfPaymentUpdateFromDataArrayResult"
})
@XmlRootElement(name = "TermOfPayment_UpdateFromDataArrayResponse")
public class TermOfPaymentUpdateFromDataArrayResponse {

    @XmlElement(name = "TermOfPayment_UpdateFromDataArrayResult")
    protected ArrayOfTermOfPaymentHandle termOfPaymentUpdateFromDataArrayResult;

    /**
     * Gets the value of the termOfPaymentUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTermOfPaymentHandle }
     *     
     */
    public ArrayOfTermOfPaymentHandle getTermOfPaymentUpdateFromDataArrayResult() {
        return termOfPaymentUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the termOfPaymentUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTermOfPaymentHandle }
     *     
     */
    public void setTermOfPaymentUpdateFromDataArrayResult(ArrayOfTermOfPaymentHandle value) {
        this.termOfPaymentUpdateFromDataArrayResult = value;
    }

}
