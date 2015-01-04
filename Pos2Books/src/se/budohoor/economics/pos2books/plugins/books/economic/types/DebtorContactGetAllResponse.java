
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
 *         &lt;element name="DebtorContact_GetAllResult" type="{http://e-conomic.com}ArrayOfDebtorContactHandle" minOccurs="0"/>
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
    "debtorContactGetAllResult"
})
@XmlRootElement(name = "DebtorContact_GetAllResponse")
public class DebtorContactGetAllResponse {

    @XmlElement(name = "DebtorContact_GetAllResult")
    protected ArrayOfDebtorContactHandle debtorContactGetAllResult;

    /**
     * Gets the value of the debtorContactGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public ArrayOfDebtorContactHandle getDebtorContactGetAllResult() {
        return debtorContactGetAllResult;
    }

    /**
     * Sets the value of the debtorContactGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public void setDebtorContactGetAllResult(ArrayOfDebtorContactHandle value) {
        this.debtorContactGetAllResult = value;
    }

}
