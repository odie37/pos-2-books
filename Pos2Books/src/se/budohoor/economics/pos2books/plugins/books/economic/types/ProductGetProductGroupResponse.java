
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
 *         &lt;element name="Product_GetProductGroupResult" type="{http://e-conomic.com}ProductGroupHandle" minOccurs="0"/>
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
    "productGetProductGroupResult"
})
@XmlRootElement(name = "Product_GetProductGroupResponse")
public class ProductGetProductGroupResponse {

    @XmlElement(name = "Product_GetProductGroupResult")
    protected ProductGroupHandle productGetProductGroupResult;

    /**
     * Gets the value of the productGetProductGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupHandle }
     *     
     */
    public ProductGroupHandle getProductGetProductGroupResult() {
        return productGetProductGroupResult;
    }

    /**
     * Sets the value of the productGetProductGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupHandle }
     *     
     */
    public void setProductGetProductGroupResult(ProductGroupHandle value) {
        this.productGetProductGroupResult = value;
    }

}
