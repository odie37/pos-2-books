
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="subscriberHandle" type="{http://e-conomic.com}SubscriberHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
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
    "subscriberHandle",
    "valueHandle"
})
@XmlRootElement(name = "Subscriber_SetDebtor")
public class SubscriberSetDebtor {

    protected SubscriberHandle subscriberHandle;
    protected DebtorHandle valueHandle;

    /**
     * Gets the value of the subscriberHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberHandle }
     *     
     */
    public SubscriberHandle getSubscriberHandle() {
        return subscriberHandle;
    }

    /**
     * Sets the value of the subscriberHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberHandle }
     *     
     */
    public void setSubscriberHandle(SubscriberHandle value) {
        this.subscriberHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setValueHandle(DebtorHandle value) {
        this.valueHandle = value;
    }

}
