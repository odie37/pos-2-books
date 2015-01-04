
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
 *         &lt;element name="orderHandle" type="{http://e-conomic.com}OrderHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "orderHandle",
    "valueHandle"
})
@XmlRootElement(name = "Order_SetOurReference")
public class OrderSetOurReference {

    protected OrderHandle orderHandle;
    protected EmployeeHandle valueHandle;

    /**
     * Gets the value of the orderHandle property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHandle }
     *     
     */
    public OrderHandle getOrderHandle() {
        return orderHandle;
    }

    /**
     * Sets the value of the orderHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHandle }
     *     
     */
    public void setOrderHandle(OrderHandle value) {
        this.orderHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setValueHandle(EmployeeHandle value) {
        this.valueHandle = value;
    }

}
