
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
 *         &lt;element name="CashBookEntry_GetEmployeeResult" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "cashBookEntryGetEmployeeResult"
})
@XmlRootElement(name = "CashBookEntry_GetEmployeeResponse")
public class CashBookEntryGetEmployeeResponse {

    @XmlElement(name = "CashBookEntry_GetEmployeeResult")
    protected EmployeeHandle cashBookEntryGetEmployeeResult;

    /**
     * Gets the value of the cashBookEntryGetEmployeeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getCashBookEntryGetEmployeeResult() {
        return cashBookEntryGetEmployeeResult;
    }

    /**
     * Sets the value of the cashBookEntryGetEmployeeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setCashBookEntryGetEmployeeResult(EmployeeHandle value) {
        this.cashBookEntryGetEmployeeResult = value;
    }

}
