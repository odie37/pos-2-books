
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
 *         &lt;element name="entityHandles" type="{http://e-conomic.com}ArrayOfSubscriptionHandle" minOccurs="0"/>
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
    "entityHandles"
})
@XmlRootElement(name = "Subscription_GetDataArray")
public class SubscriptionGetDataArray {

    protected ArrayOfSubscriptionHandle entityHandles;

    /**
     * Gets the value of the entityHandles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionHandle }
     *     
     */
    public ArrayOfSubscriptionHandle getEntityHandles() {
        return entityHandles;
    }

    /**
     * Sets the value of the entityHandles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionHandle }
     *     
     */
    public void setEntityHandles(ArrayOfSubscriptionHandle value) {
        this.entityHandles = value;
    }

}
