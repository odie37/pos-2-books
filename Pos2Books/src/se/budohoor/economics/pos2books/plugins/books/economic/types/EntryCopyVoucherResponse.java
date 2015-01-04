
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
 *         &lt;element name="Entry_CopyVoucherResult" type="{http://e-conomic.com}ArrayOfCashBookEntryHandle" minOccurs="0"/>
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
    "entryCopyVoucherResult"
})
@XmlRootElement(name = "Entry_CopyVoucherResponse")
public class EntryCopyVoucherResponse {

    @XmlElement(name = "Entry_CopyVoucherResult")
    protected ArrayOfCashBookEntryHandle entryCopyVoucherResult;

    /**
     * Gets the value of the entryCopyVoucherResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookEntryHandle }
     *     
     */
    public ArrayOfCashBookEntryHandle getEntryCopyVoucherResult() {
        return entryCopyVoucherResult;
    }

    /**
     * Sets the value of the entryCopyVoucherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookEntryHandle }
     *     
     */
    public void setEntryCopyVoucherResult(ArrayOfCashBookEntryHandle value) {
        this.entryCopyVoucherResult = value;
    }

}
