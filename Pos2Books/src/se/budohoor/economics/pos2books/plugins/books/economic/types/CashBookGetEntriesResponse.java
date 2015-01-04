
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
 *         &lt;element name="CashBook_GetEntriesResult" type="{http://e-conomic.com}ArrayOfCashBookEntryHandle" minOccurs="0"/>
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
    "cashBookGetEntriesResult"
})
@XmlRootElement(name = "CashBook_GetEntriesResponse")
public class CashBookGetEntriesResponse {

    @XmlElement(name = "CashBook_GetEntriesResult")
    protected ArrayOfCashBookEntryHandle cashBookGetEntriesResult;

    /**
     * Gets the value of the cashBookGetEntriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookEntryHandle }
     *     
     */
    public ArrayOfCashBookEntryHandle getCashBookGetEntriesResult() {
        return cashBookGetEntriesResult;
    }

    /**
     * Sets the value of the cashBookGetEntriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookEntryHandle }
     *     
     */
    public void setCashBookGetEntriesResult(ArrayOfCashBookEntryHandle value) {
        this.cashBookGetEntriesResult = value;
    }

}
