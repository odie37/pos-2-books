
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
 *         &lt;element name="CashBookEntry_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCashBookEntryHandle" minOccurs="0"/>
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
    "cashBookEntryUpdateFromDataArrayResult"
})
@XmlRootElement(name = "CashBookEntry_UpdateFromDataArrayResponse")
public class CashBookEntryUpdateFromDataArrayResponse {

    @XmlElement(name = "CashBookEntry_UpdateFromDataArrayResult")
    protected ArrayOfCashBookEntryHandle cashBookEntryUpdateFromDataArrayResult;

    /**
     * Gets the value of the cashBookEntryUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookEntryHandle }
     *     
     */
    public ArrayOfCashBookEntryHandle getCashBookEntryUpdateFromDataArrayResult() {
        return cashBookEntryUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the cashBookEntryUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookEntryHandle }
     *     
     */
    public void setCashBookEntryUpdateFromDataArrayResult(ArrayOfCashBookEntryHandle value) {
        this.cashBookEntryUpdateFromDataArrayResult = value;
    }

}
