
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
 *         &lt;element name="DebtorEntry_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorEntryData" minOccurs="0"/>
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
    "debtorEntryGetDataArrayResult"
})
@XmlRootElement(name = "DebtorEntry_GetDataArrayResponse")
public class DebtorEntryGetDataArrayResponse {

    @XmlElement(name = "DebtorEntry_GetDataArrayResult")
    protected ArrayOfDebtorEntryData debtorEntryGetDataArrayResult;

    /**
     * Gets the value of the debtorEntryGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorEntryData }
     *     
     */
    public ArrayOfDebtorEntryData getDebtorEntryGetDataArrayResult() {
        return debtorEntryGetDataArrayResult;
    }

    /**
     * Sets the value of the debtorEntryGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorEntryData }
     *     
     */
    public void setDebtorEntryGetDataArrayResult(ArrayOfDebtorEntryData value) {
        this.debtorEntryGetDataArrayResult = value;
    }

}
