
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
 *         &lt;element name="Order_GetPdfResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "orderGetPdfResult"
})
@XmlRootElement(name = "Order_GetPdfResponse")
public class OrderGetPdfResponse {

    @XmlElement(name = "Order_GetPdfResult")
    protected byte[] orderGetPdfResult;

    /**
     * Gets the value of the orderGetPdfResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOrderGetPdfResult() {
        return orderGetPdfResult;
    }

    /**
     * Sets the value of the orderGetPdfResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOrderGetPdfResult(byte[] value) {
        this.orderGetPdfResult = ((byte[]) value);
    }

}
