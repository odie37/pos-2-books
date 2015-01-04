
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
 *         &lt;element name="Order_GetIsArchivedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "orderGetIsArchivedResult"
})
@XmlRootElement(name = "Order_GetIsArchivedResponse")
public class OrderGetIsArchivedResponse {

    @XmlElement(name = "Order_GetIsArchivedResult")
    protected boolean orderGetIsArchivedResult;

    /**
     * Gets the value of the orderGetIsArchivedResult property.
     * 
     */
    public boolean isOrderGetIsArchivedResult() {
        return orderGetIsArchivedResult;
    }

    /**
     * Sets the value of the orderGetIsArchivedResult property.
     * 
     */
    public void setOrderGetIsArchivedResult(boolean value) {
        this.orderGetIsArchivedResult = value;
    }

}
