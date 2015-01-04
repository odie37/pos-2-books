
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
 *         &lt;element name="BankPaymentType_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfBankPaymentTypeHandle" minOccurs="0"/>
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
    "bankPaymentTypeFindByNumberListResult"
})
@XmlRootElement(name = "BankPaymentType_FindByNumberListResponse")
public class BankPaymentTypeFindByNumberListResponse {

    @XmlElement(name = "BankPaymentType_FindByNumberListResult")
    protected ArrayOfBankPaymentTypeHandle bankPaymentTypeFindByNumberListResult;

    /**
     * Gets the value of the bankPaymentTypeFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBankPaymentTypeHandle }
     *     
     */
    public ArrayOfBankPaymentTypeHandle getBankPaymentTypeFindByNumberListResult() {
        return bankPaymentTypeFindByNumberListResult;
    }

    /**
     * Sets the value of the bankPaymentTypeFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBankPaymentTypeHandle }
     *     
     */
    public void setBankPaymentTypeFindByNumberListResult(ArrayOfBankPaymentTypeHandle value) {
        this.bankPaymentTypeFindByNumberListResult = value;
    }

}
