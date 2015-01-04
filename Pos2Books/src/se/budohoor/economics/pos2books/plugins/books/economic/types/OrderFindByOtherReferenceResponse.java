
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
 *         &lt;element name="Order_FindByOtherReferenceResult" type="{http://e-conomic.com}ArrayOfOrderHandle" minOccurs="0"/>
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
    "orderFindByOtherReferenceResult"
})
@XmlRootElement(name = "Order_FindByOtherReferenceResponse")
public class OrderFindByOtherReferenceResponse {

    @XmlElement(name = "Order_FindByOtherReferenceResult")
    protected ArrayOfOrderHandle orderFindByOtherReferenceResult;

    /**
     * Gets the value of the orderFindByOtherReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public ArrayOfOrderHandle getOrderFindByOtherReferenceResult() {
        return orderFindByOtherReferenceResult;
    }

    /**
     * Sets the value of the orderFindByOtherReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public void setOrderFindByOtherReferenceResult(ArrayOfOrderHandle value) {
        this.orderFindByOtherReferenceResult = value;
    }

}
