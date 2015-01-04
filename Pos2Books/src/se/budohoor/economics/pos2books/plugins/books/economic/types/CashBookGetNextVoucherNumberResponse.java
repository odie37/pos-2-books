
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
 *         &lt;element name="CashBook_GetNextVoucherNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cashBookGetNextVoucherNumberResult"
})
@XmlRootElement(name = "CashBook_GetNextVoucherNumberResponse")
public class CashBookGetNextVoucherNumberResponse {

    @XmlElement(name = "CashBook_GetNextVoucherNumberResult")
    protected int cashBookGetNextVoucherNumberResult;

    /**
     * Gets the value of the cashBookGetNextVoucherNumberResult property.
     * 
     */
    public int getCashBookGetNextVoucherNumberResult() {
        return cashBookGetNextVoucherNumberResult;
    }

    /**
     * Sets the value of the cashBookGetNextVoucherNumberResult property.
     * 
     */
    public void setCashBookGetNextVoucherNumberResult(int value) {
        this.cashBookGetNextVoucherNumberResult = value;
    }

}
