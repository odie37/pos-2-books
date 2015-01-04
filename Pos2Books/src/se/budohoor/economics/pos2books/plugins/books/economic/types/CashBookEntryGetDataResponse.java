
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
 *         &lt;element name="CashBookEntry_GetDataResult" type="{http://e-conomic.com}CashBookEntryData" minOccurs="0"/>
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
    "cashBookEntryGetDataResult"
})
@XmlRootElement(name = "CashBookEntry_GetDataResponse")
public class CashBookEntryGetDataResponse {

    @XmlElement(name = "CashBookEntry_GetDataResult")
    protected CashBookEntryData cashBookEntryGetDataResult;

    /**
     * Gets the value of the cashBookEntryGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookEntryData }
     *     
     */
    public CashBookEntryData getCashBookEntryGetDataResult() {
        return cashBookEntryGetDataResult;
    }

    /**
     * Sets the value of the cashBookEntryGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookEntryData }
     *     
     */
    public void setCashBookEntryGetDataResult(CashBookEntryData value) {
        this.cashBookEntryGetDataResult = value;
    }

}
