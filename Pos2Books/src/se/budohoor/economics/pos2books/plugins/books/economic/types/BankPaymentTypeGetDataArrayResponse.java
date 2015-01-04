
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
 *         &lt;element name="BankPaymentType_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfBankPaymentTypeData" minOccurs="0"/>
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
    "bankPaymentTypeGetDataArrayResult"
})
@XmlRootElement(name = "BankPaymentType_GetDataArrayResponse")
public class BankPaymentTypeGetDataArrayResponse {

    @XmlElement(name = "BankPaymentType_GetDataArrayResult")
    protected ArrayOfBankPaymentTypeData bankPaymentTypeGetDataArrayResult;

    /**
     * Gets the value of the bankPaymentTypeGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBankPaymentTypeData }
     *     
     */
    public ArrayOfBankPaymentTypeData getBankPaymentTypeGetDataArrayResult() {
        return bankPaymentTypeGetDataArrayResult;
    }

    /**
     * Sets the value of the bankPaymentTypeGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBankPaymentTypeData }
     *     
     */
    public void setBankPaymentTypeGetDataArrayResult(ArrayOfBankPaymentTypeData value) {
        this.bankPaymentTypeGetDataArrayResult = value;
    }

}
