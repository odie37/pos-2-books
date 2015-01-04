
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
 *         &lt;element name="CreditorEntry_GetDueDateResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "creditorEntryGetDueDateResult"
})
@XmlRootElement(name = "CreditorEntry_GetDueDateResponse")
public class CreditorEntryGetDueDateResponse {

    @XmlElement(name = "CreditorEntry_GetDueDateResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditorEntryGetDueDateResult;

    /**
     * Gets the value of the creditorEntryGetDueDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditorEntryGetDueDateResult() {
        return creditorEntryGetDueDateResult;
    }

    /**
     * Sets the value of the creditorEntryGetDueDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditorEntryGetDueDateResult(XMLGregorianCalendar value) {
        this.creditorEntryGetDueDateResult = value;
    }

}
