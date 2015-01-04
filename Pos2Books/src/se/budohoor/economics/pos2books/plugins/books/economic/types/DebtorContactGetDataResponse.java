
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
 *         &lt;element name="DebtorContact_GetDataResult" type="{http://e-conomic.com}DebtorContactData" minOccurs="0"/>
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
    "debtorContactGetDataResult"
})
@XmlRootElement(name = "DebtorContact_GetDataResponse")
public class DebtorContactGetDataResponse {

    @XmlElement(name = "DebtorContact_GetDataResult")
    protected DebtorContactData debtorContactGetDataResult;

    /**
     * Gets the value of the debtorContactGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorContactData }
     *     
     */
    public DebtorContactData getDebtorContactGetDataResult() {
        return debtorContactGetDataResult;
    }

    /**
     * Sets the value of the debtorContactGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorContactData }
     *     
     */
    public void setDebtorContactGetDataResult(DebtorContactData value) {
        this.debtorContactGetDataResult = value;
    }

}
