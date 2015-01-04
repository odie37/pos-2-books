
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
 *         &lt;element name="projectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
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
    "projectHandle"
})
@XmlRootElement(name = "Order_SetProject")
public class OrderSetProject {

    protected OrderHandle orderHandle;
    protected ProjectHandle projectHandle;

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
     * Gets the value of the projectHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHandle }
     *     
     */
    public ProjectHandle getProjectHandle() {
        return projectHandle;
    }

    /**
     * Sets the value of the projectHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHandle }
     *     
     */
    public void setProjectHandle(ProjectHandle value) {
        this.projectHandle = value;
    }

}
