
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
 *         &lt;element name="BankPaymentType_FindByNameResult" type="{http://e-conomic.com}ArrayOfBankPaymentTypeHandle" minOccurs="0"/>
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
    "bankPaymentTypeFindByNameResult"
})
@XmlRootElement(name = "BankPaymentType_FindByNameResponse")
public class BankPaymentTypeFindByNameResponse {

    @XmlElement(name = "BankPaymentType_FindByNameResult")
    protected ArrayOfBankPaymentTypeHandle bankPaymentTypeFindByNameResult;

    /**
     * Gets the value of the bankPaymentTypeFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBankPaymentTypeHandle }
     *     
     */
    public ArrayOfBankPaymentTypeHandle getBankPaymentTypeFindByNameResult() {
        return bankPaymentTypeFindByNameResult;
    }

    /**
     * Sets the value of the bankPaymentTypeFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBankPaymentTypeHandle }
     *     
     */
    public void setBankPaymentTypeFindByNameResult(ArrayOfBankPaymentTypeHandle value) {
        this.bankPaymentTypeFindByNameResult = value;
    }

}
