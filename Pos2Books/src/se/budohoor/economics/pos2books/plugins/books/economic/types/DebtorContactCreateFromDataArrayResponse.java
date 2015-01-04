
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
 *         &lt;element name="DebtorContact_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorContactHandle" minOccurs="0"/>
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
    "debtorContactCreateFromDataArrayResult"
})
@XmlRootElement(name = "DebtorContact_CreateFromDataArrayResponse")
public class DebtorContactCreateFromDataArrayResponse {

    @XmlElement(name = "DebtorContact_CreateFromDataArrayResult")
    protected ArrayOfDebtorContactHandle debtorContactCreateFromDataArrayResult;

    /**
     * Gets the value of the debtorContactCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public ArrayOfDebtorContactHandle getDebtorContactCreateFromDataArrayResult() {
        return debtorContactCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the debtorContactCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public void setDebtorContactCreateFromDataArrayResult(ArrayOfDebtorContactHandle value) {
        this.debtorContactCreateFromDataArrayResult = value;
    }

}
