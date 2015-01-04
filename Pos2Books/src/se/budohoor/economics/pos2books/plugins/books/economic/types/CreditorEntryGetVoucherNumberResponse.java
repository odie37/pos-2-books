
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
 *         &lt;element name="CreditorEntry_GetVoucherNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "creditorEntryGetVoucherNumberResult"
})
@XmlRootElement(name = "CreditorEntry_GetVoucherNumberResponse")
public class CreditorEntryGetVoucherNumberResponse {

    @XmlElement(name = "CreditorEntry_GetVoucherNumberResult")
    protected int creditorEntryGetVoucherNumberResult;

    /**
     * Gets the value of the creditorEntryGetVoucherNumberResult property.
     * 
     */
    public int getCreditorEntryGetVoucherNumberResult() {
        return creditorEntryGetVoucherNumberResult;
    }

    /**
     * Sets the value of the creditorEntryGetVoucherNumberResult property.
     * 
     */
    public void setCreditorEntryGetVoucherNumberResult(int value) {
        this.creditorEntryGetVoucherNumberResult = value;
    }

}
