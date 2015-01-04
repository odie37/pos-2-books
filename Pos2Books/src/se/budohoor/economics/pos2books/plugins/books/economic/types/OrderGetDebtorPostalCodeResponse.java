
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
 *         &lt;element name="Order_GetDebtorPostalCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "orderGetDebtorPostalCodeResult"
})
@XmlRootElement(name = "Order_GetDebtorPostalCodeResponse")
public class OrderGetDebtorPostalCodeResponse {

    @XmlElement(name = "Order_GetDebtorPostalCodeResult")
    protected String orderGetDebtorPostalCodeResult;

    /**
     * Gets the value of the orderGetDebtorPostalCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderGetDebtorPostalCodeResult() {
        return orderGetDebtorPostalCodeResult;
    }

    /**
     * Sets the value of the orderGetDebtorPostalCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderGetDebtorPostalCodeResult(String value) {
        this.orderGetDebtorPostalCodeResult = value;
    }

}
