
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
 *         &lt;element name="DebtorContact_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorContactHandle" minOccurs="0"/>
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
    "debtorContactUpdateFromDataArrayResult"
})
@XmlRootElement(name = "DebtorContact_UpdateFromDataArrayResponse")
public class DebtorContactUpdateFromDataArrayResponse {

    @XmlElement(name = "DebtorContact_UpdateFromDataArrayResult")
    protected ArrayOfDebtorContactHandle debtorContactUpdateFromDataArrayResult;

    /**
     * Gets the value of the debtorContactUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public ArrayOfDebtorContactHandle getDebtorContactUpdateFromDataArrayResult() {
        return debtorContactUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the debtorContactUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public void setDebtorContactUpdateFromDataArrayResult(ArrayOfDebtorContactHandle value) {
        this.debtorContactUpdateFromDataArrayResult = value;
    }

}
