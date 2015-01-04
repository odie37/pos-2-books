
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
 *         &lt;element name="Product_GetAllAccessibleResult" type="{http://e-conomic.com}ArrayOfProductHandle" minOccurs="0"/>
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
    "productGetAllAccessibleResult"
})
@XmlRootElement(name = "Product_GetAllAccessibleResponse")
public class ProductGetAllAccessibleResponse {

    @XmlElement(name = "Product_GetAllAccessibleResult")
    protected ArrayOfProductHandle productGetAllAccessibleResult;

    /**
     * Gets the value of the productGetAllAccessibleResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductHandle }
     *     
     */
    public ArrayOfProductHandle getProductGetAllAccessibleResult() {
        return productGetAllAccessibleResult;
    }

    /**
     * Sets the value of the productGetAllAccessibleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductHandle }
     *     
     */
    public void setProductGetAllAccessibleResult(ArrayOfProductHandle value) {
        this.productGetAllAccessibleResult = value;
    }

}
