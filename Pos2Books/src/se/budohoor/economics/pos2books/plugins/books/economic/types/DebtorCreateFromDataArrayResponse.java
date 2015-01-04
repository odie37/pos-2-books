
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
 *         &lt;element name="Debtor_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorHandle" minOccurs="0"/>
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
    "debtorCreateFromDataArrayResult"
})
@XmlRootElement(name = "Debtor_CreateFromDataArrayResponse")
public class DebtorCreateFromDataArrayResponse {

    @XmlElement(name = "Debtor_CreateFromDataArrayResult")
    protected ArrayOfDebtorHandle debtorCreateFromDataArrayResult;

    /**
     * Gets the value of the debtorCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorHandle }
     *     
     */
    public ArrayOfDebtorHandle getDebtorCreateFromDataArrayResult() {
        return debtorCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the debtorCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorHandle }
     *     
     */
    public void setDebtorCreateFromDataArrayResult(ArrayOfDebtorHandle value) {
        this.debtorCreateFromDataArrayResult = value;
    }

}
