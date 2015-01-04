
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
 *         &lt;element name="Entry_GetVoucherNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "entryGetVoucherNumberResult"
})
@XmlRootElement(name = "Entry_GetVoucherNumberResponse")
public class EntryGetVoucherNumberResponse {

    @XmlElement(name = "Entry_GetVoucherNumberResult")
    protected int entryGetVoucherNumberResult;

    /**
     * Gets the value of the entryGetVoucherNumberResult property.
     * 
     */
    public int getEntryGetVoucherNumberResult() {
        return entryGetVoucherNumberResult;
    }

    /**
     * Sets the value of the entryGetVoucherNumberResult property.
     * 
     */
    public void setEntryGetVoucherNumberResult(int value) {
        this.entryGetVoucherNumberResult = value;
    }

}
