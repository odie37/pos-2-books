
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
 *         &lt;element name="Debtor_GetDebtorContactsResult" type="{http://e-conomic.com}ArrayOfDebtorContactHandle" minOccurs="0"/>
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
    "debtorGetDebtorContactsResult"
})
@XmlRootElement(name = "Debtor_GetDebtorContactsResponse")
public class DebtorGetDebtorContactsResponse {

    @XmlElement(name = "Debtor_GetDebtorContactsResult")
    protected ArrayOfDebtorContactHandle debtorGetDebtorContactsResult;

    /**
     * Gets the value of the debtorGetDebtorContactsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public ArrayOfDebtorContactHandle getDebtorGetDebtorContactsResult() {
        return debtorGetDebtorContactsResult;
    }

    /**
     * Sets the value of the debtorGetDebtorContactsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public void setDebtorGetDebtorContactsResult(ArrayOfDebtorContactHandle value) {
        this.debtorGetDebtorContactsResult = value;
    }

}
