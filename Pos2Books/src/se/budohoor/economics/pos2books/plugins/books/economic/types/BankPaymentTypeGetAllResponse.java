
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
 *         &lt;element name="BankPaymentType_GetAllResult" type="{http://e-conomic.com}ArrayOfBankPaymentTypeHandle" minOccurs="0"/>
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
    "bankPaymentTypeGetAllResult"
})
@XmlRootElement(name = "BankPaymentType_GetAllResponse")
public class BankPaymentTypeGetAllResponse {

    @XmlElement(name = "BankPaymentType_GetAllResult")
    protected ArrayOfBankPaymentTypeHandle bankPaymentTypeGetAllResult;

    /**
     * Gets the value of the bankPaymentTypeGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBankPaymentTypeHandle }
     *     
     */
    public ArrayOfBankPaymentTypeHandle getBankPaymentTypeGetAllResult() {
        return bankPaymentTypeGetAllResult;
    }

    /**
     * Sets the value of the bankPaymentTypeGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBankPaymentTypeHandle }
     *     
     */
    public void setBankPaymentTypeGetAllResult(ArrayOfBankPaymentTypeHandle value) {
        this.bankPaymentTypeGetAllResult = value;
    }

}
