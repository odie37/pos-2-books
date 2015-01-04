
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
 *         &lt;element name="subscriptionLineHandle" type="{http://e-conomic.com}SubscriptionLineHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
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
    "subscriptionLineHandle",
    "valueHandle"
})
@XmlRootElement(name = "SubscriptionLine_SetDepartment")
public class SubscriptionLineSetDepartment {

    protected SubscriptionLineHandle subscriptionLineHandle;
    protected DepartmentHandle valueHandle;

    /**
     * Gets the value of the subscriptionLineHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionLineHandle }
     *     
     */
    public SubscriptionLineHandle getSubscriptionLineHandle() {
        return subscriptionLineHandle;
    }

    /**
     * Sets the value of the subscriptionLineHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionLineHandle }
     *     
     */
    public void setSubscriptionLineHandle(SubscriptionLineHandle value) {
        this.subscriptionLineHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentHandle }
     *     
     */
    public DepartmentHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentHandle }
     *     
     */
    public void setValueHandle(DepartmentHandle value) {
        this.valueHandle = value;
    }

}
