
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
 *         &lt;element name="Debtor_GetQuotationsResult" type="{http://e-conomic.com}ArrayOfQuotationHandle" minOccurs="0"/>
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
    "debtorGetQuotationsResult"
})
@XmlRootElement(name = "Debtor_GetQuotationsResponse")
public class DebtorGetQuotationsResponse {

    @XmlElement(name = "Debtor_GetQuotationsResult")
    protected ArrayOfQuotationHandle debtorGetQuotationsResult;

    /**
     * Gets the value of the debtorGetQuotationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotationHandle }
     *     
     */
    public ArrayOfQuotationHandle getDebtorGetQuotationsResult() {
        return debtorGetQuotationsResult;
    }

    /**
     * Sets the value of the debtorGetQuotationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotationHandle }
     *     
     */
    public void setDebtorGetQuotationsResult(ArrayOfQuotationHandle value) {
        this.debtorGetQuotationsResult = value;
    }

}
