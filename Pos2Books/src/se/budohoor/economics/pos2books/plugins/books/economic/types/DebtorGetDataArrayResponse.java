
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
 *         &lt;element name="Debtor_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorData" minOccurs="0"/>
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
    "debtorGetDataArrayResult"
})
@XmlRootElement(name = "Debtor_GetDataArrayResponse")
public class DebtorGetDataArrayResponse {

    @XmlElement(name = "Debtor_GetDataArrayResult")
    protected ArrayOfDebtorData debtorGetDataArrayResult;

    /**
     * Gets the value of the debtorGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorData }
     *     
     */
    public ArrayOfDebtorData getDebtorGetDataArrayResult() {
        return debtorGetDataArrayResult;
    }

    /**
     * Sets the value of the debtorGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorData }
     *     
     */
    public void setDebtorGetDataArrayResult(ArrayOfDebtorData value) {
        this.debtorGetDataArrayResult = value;
    }

}
