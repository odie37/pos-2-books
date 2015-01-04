
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
 *         &lt;element name="BankPaymentType_GetDataResult" type="{http://e-conomic.com}BankPaymentTypeData" minOccurs="0"/>
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
    "bankPaymentTypeGetDataResult"
})
@XmlRootElement(name = "BankPaymentType_GetDataResponse")
public class BankPaymentTypeGetDataResponse {

    @XmlElement(name = "BankPaymentType_GetDataResult")
    protected BankPaymentTypeData bankPaymentTypeGetDataResult;

    /**
     * Gets the value of the bankPaymentTypeGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link BankPaymentTypeData }
     *     
     */
    public BankPaymentTypeData getBankPaymentTypeGetDataResult() {
        return bankPaymentTypeGetDataResult;
    }

    /**
     * Sets the value of the bankPaymentTypeGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPaymentTypeData }
     *     
     */
    public void setBankPaymentTypeGetDataResult(BankPaymentTypeData value) {
        this.bankPaymentTypeGetDataResult = value;
    }

}
