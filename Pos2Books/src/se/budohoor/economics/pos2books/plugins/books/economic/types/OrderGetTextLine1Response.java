
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
 *         &lt;element name="Order_GetTextLine1Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "orderGetTextLine1Result"
})
@XmlRootElement(name = "Order_GetTextLine1Response")
public class OrderGetTextLine1Response {

    @XmlElement(name = "Order_GetTextLine1Result")
    protected String orderGetTextLine1Result;

    /**
     * Gets the value of the orderGetTextLine1Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderGetTextLine1Result() {
        return orderGetTextLine1Result;
    }

    /**
     * Sets the value of the orderGetTextLine1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderGetTextLine1Result(String value) {
        this.orderGetTextLine1Result = value;
    }

}
