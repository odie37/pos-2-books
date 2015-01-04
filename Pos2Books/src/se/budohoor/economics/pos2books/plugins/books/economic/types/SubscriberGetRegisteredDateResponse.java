
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
 *         &lt;element name="Subscriber_GetRegisteredDateResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "subscriberGetRegisteredDateResult"
})
@XmlRootElement(name = "Subscriber_GetRegisteredDateResponse")
public class SubscriberGetRegisteredDateResponse {

    @XmlElement(name = "Subscriber_GetRegisteredDateResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriberGetRegisteredDateResult;

    /**
     * Gets the value of the subscriberGetRegisteredDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriberGetRegisteredDateResult() {
        return subscriberGetRegisteredDateResult;
    }

    /**
     * Sets the value of the subscriberGetRegisteredDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriberGetRegisteredDateResult(XMLGregorianCalendar value) {
        this.subscriberGetRegisteredDateResult = value;
    }

}
