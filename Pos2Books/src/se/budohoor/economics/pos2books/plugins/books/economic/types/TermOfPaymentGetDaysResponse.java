
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
 *         &lt;element name="TermOfPayment_GetDaysResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "termOfPaymentGetDaysResult"
})
@XmlRootElement(name = "TermOfPayment_GetDaysResponse")
public class TermOfPaymentGetDaysResponse {

    @XmlElement(name = "TermOfPayment_GetDaysResult", required = true, type = Integer.class, nillable = true)
    protected Integer termOfPaymentGetDaysResult;

    /**
     * Gets the value of the termOfPaymentGetDaysResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTermOfPaymentGetDaysResult() {
        return termOfPaymentGetDaysResult;
    }

    /**
     * Sets the value of the termOfPaymentGetDaysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTermOfPaymentGetDaysResult(Integer value) {
        this.termOfPaymentGetDaysResult = value;
    }

}
