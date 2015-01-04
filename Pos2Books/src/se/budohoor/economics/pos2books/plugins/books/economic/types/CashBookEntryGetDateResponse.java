
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CashBookEntry_GetDateResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "cashBookEntryGetDateResult"
})
@XmlRootElement(name = "CashBookEntry_GetDateResponse")
public class CashBookEntryGetDateResponse {

    @XmlElement(name = "CashBookEntry_GetDateResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cashBookEntryGetDateResult;

    /**
     * Gets the value of the cashBookEntryGetDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCashBookEntryGetDateResult() {
        return cashBookEntryGetDateResult;
    }

    /**
     * Sets the value of the cashBookEntryGetDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCashBookEntryGetDateResult(XMLGregorianCalendar value) {
        this.cashBookEntryGetDateResult = value;
    }

}
