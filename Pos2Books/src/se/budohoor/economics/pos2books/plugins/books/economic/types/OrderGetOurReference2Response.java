
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
 *         &lt;element name="Order_GetOurReference2Result" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "orderGetOurReference2Result"
})
@XmlRootElement(name = "Order_GetOurReference2Response")
public class OrderGetOurReference2Response {

    @XmlElement(name = "Order_GetOurReference2Result")
    protected EmployeeHandle orderGetOurReference2Result;

    /**
     * Gets the value of the orderGetOurReference2Result property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getOrderGetOurReference2Result() {
        return orderGetOurReference2Result;
    }

    /**
     * Sets the value of the orderGetOurReference2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setOrderGetOurReference2Result(EmployeeHandle value) {
        this.orderGetOurReference2Result = value;
    }

}
