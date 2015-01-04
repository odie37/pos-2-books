
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
 *         &lt;element name="TermOfPayment_GetDescriptionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "termOfPaymentGetDescriptionResult"
})
@XmlRootElement(name = "TermOfPayment_GetDescriptionResponse")
public class TermOfPaymentGetDescriptionResponse {

    @XmlElement(name = "TermOfPayment_GetDescriptionResult")
    protected String termOfPaymentGetDescriptionResult;

    /**
     * Gets the value of the termOfPaymentGetDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermOfPaymentGetDescriptionResult() {
        return termOfPaymentGetDescriptionResult;
    }

    /**
     * Sets the value of the termOfPaymentGetDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermOfPaymentGetDescriptionResult(String value) {
        this.termOfPaymentGetDescriptionResult = value;
    }

}
