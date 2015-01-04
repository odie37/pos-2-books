
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
 *         &lt;element name="CashBookEntry_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCashBookEntryData" minOccurs="0"/>
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
    "cashBookEntryGetDataArrayResult"
})
@XmlRootElement(name = "CashBookEntry_GetDataArrayResponse")
public class CashBookEntryGetDataArrayResponse {

    @XmlElement(name = "CashBookEntry_GetDataArrayResult")
    protected ArrayOfCashBookEntryData cashBookEntryGetDataArrayResult;

    /**
     * Gets the value of the cashBookEntryGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookEntryData }
     *     
     */
    public ArrayOfCashBookEntryData getCashBookEntryGetDataArrayResult() {
        return cashBookEntryGetDataArrayResult;
    }

    /**
     * Sets the value of the cashBookEntryGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookEntryData }
     *     
     */
    public void setCashBookEntryGetDataArrayResult(ArrayOfCashBookEntryData value) {
        this.cashBookEntryGetDataArrayResult = value;
    }

}
