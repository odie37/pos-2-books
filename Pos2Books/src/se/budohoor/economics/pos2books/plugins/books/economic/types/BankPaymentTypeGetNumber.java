
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bankPaymentTypeHandle" type="{http://e-conomic.com}BankPaymentTypeHandle" minOccurs="0"/>
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
    "bankPaymentTypeHandle"
})
@XmlRootElement(name = "BankPaymentType_GetNumber")
public class BankPaymentTypeGetNumber {

    protected BankPaymentTypeHandle bankPaymentTypeHandle;

    /**
     * Gets the value of the bankPaymentTypeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public BankPaymentTypeHandle getBankPaymentTypeHandle() {
        return bankPaymentTypeHandle;
    }

    /**
     * Sets the value of the bankPaymentTypeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public void setBankPaymentTypeHandle(BankPaymentTypeHandle value) {
        this.bankPaymentTypeHandle = value;
    }

}