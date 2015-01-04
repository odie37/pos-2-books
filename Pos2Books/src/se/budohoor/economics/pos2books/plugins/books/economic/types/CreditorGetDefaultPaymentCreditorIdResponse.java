
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
 *         &lt;element name="Creditor_GetDefaultPaymentCreditorIdResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "creditorGetDefaultPaymentCreditorIdResult"
})
@XmlRootElement(name = "Creditor_GetDefaultPaymentCreditorIdResponse")
public class CreditorGetDefaultPaymentCreditorIdResponse {

    @XmlElement(name = "Creditor_GetDefaultPaymentCreditorIdResult")
    protected String creditorGetDefaultPaymentCreditorIdResult;

    /**
     * Gets the value of the creditorGetDefaultPaymentCreditorIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorGetDefaultPaymentCreditorIdResult() {
        return creditorGetDefaultPaymentCreditorIdResult;
    }

    /**
     * Sets the value of the creditorGetDefaultPaymentCreditorIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorGetDefaultPaymentCreditorIdResult(String value) {
        this.creditorGetDefaultPaymentCreditorIdResult = value;
    }

}
