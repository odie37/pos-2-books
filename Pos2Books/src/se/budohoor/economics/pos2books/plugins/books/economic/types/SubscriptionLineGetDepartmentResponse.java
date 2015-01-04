
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
 *         &lt;element name="SubscriptionLine_GetDepartmentResult" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
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
    "subscriptionLineGetDepartmentResult"
})
@XmlRootElement(name = "SubscriptionLine_GetDepartmentResponse")
public class SubscriptionLineGetDepartmentResponse {

    @XmlElement(name = "SubscriptionLine_GetDepartmentResult")
    protected DepartmentHandle subscriptionLineGetDepartmentResult;

    /**
     * Gets the value of the subscriptionLineGetDepartmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentHandle }
     *     
     */
    public DepartmentHandle getSubscriptionLineGetDepartmentResult() {
        return subscriptionLineGetDepartmentResult;
    }

    /**
     * Sets the value of the subscriptionLineGetDepartmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentHandle }
     *     
     */
    public void setSubscriptionLineGetDepartmentResult(DepartmentHandle value) {
        this.subscriptionLineGetDepartmentResult = value;
    }

}
