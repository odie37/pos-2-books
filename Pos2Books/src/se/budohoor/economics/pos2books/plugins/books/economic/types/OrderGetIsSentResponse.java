
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
 *         &lt;element name="Order_GetIsSentResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "orderGetIsSentResult"
})
@XmlRootElement(name = "Order_GetIsSentResponse")
public class OrderGetIsSentResponse {

    @XmlElement(name = "Order_GetIsSentResult")
    protected boolean orderGetIsSentResult;

    /**
     * Gets the value of the orderGetIsSentResult property.
     * 
     */
    public boolean isOrderGetIsSentResult() {
        return orderGetIsSentResult;
    }

    /**
     * Sets the value of the orderGetIsSentResult property.
     * 
     */
    public void setOrderGetIsSentResult(boolean value) {
        this.orderGetIsSentResult = value;
    }

}
