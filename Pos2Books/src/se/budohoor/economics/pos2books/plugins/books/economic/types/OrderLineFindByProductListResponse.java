
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
 *         &lt;element name="OrderLine_FindByProductListResult" type="{http://e-conomic.com}ArrayOfOrderLineHandle" minOccurs="0"/>
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
    "orderLineFindByProductListResult"
})
@XmlRootElement(name = "OrderLine_FindByProductListResponse")
public class OrderLineFindByProductListResponse {

    @XmlElement(name = "OrderLine_FindByProductListResult")
    protected ArrayOfOrderLineHandle orderLineFindByProductListResult;

    /**
     * Gets the value of the orderLineFindByProductListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderLineHandle }
     *     
     */
    public ArrayOfOrderLineHandle getOrderLineFindByProductListResult() {
        return orderLineFindByProductListResult;
    }

    /**
     * Sets the value of the orderLineFindByProductListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderLineHandle }
     *     
     */
    public void setOrderLineFindByProductListResult(ArrayOfOrderLineHandle value) {
        this.orderLineFindByProductListResult = value;
    }

}
