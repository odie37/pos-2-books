
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
 *         &lt;element name="Order_GetLayoutResult" type="{http://e-conomic.com}TemplateCollectionHandle" minOccurs="0"/>
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
    "orderGetLayoutResult"
})
@XmlRootElement(name = "Order_GetLayoutResponse")
public class OrderGetLayoutResponse {

    @XmlElement(name = "Order_GetLayoutResult")
    protected TemplateCollectionHandle orderGetLayoutResult;

    /**
     * Gets the value of the orderGetLayoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public TemplateCollectionHandle getOrderGetLayoutResult() {
        return orderGetLayoutResult;
    }

    /**
     * Sets the value of the orderGetLayoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public void setOrderGetLayoutResult(TemplateCollectionHandle value) {
        this.orderGetLayoutResult = value;
    }

}
