
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
 *         &lt;element name="ProductPrice_GetProductResult" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
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
    "productPriceGetProductResult"
})
@XmlRootElement(name = "ProductPrice_GetProductResponse")
public class ProductPriceGetProductResponse {

    @XmlElement(name = "ProductPrice_GetProductResult")
    protected ProductHandle productPriceGetProductResult;

    /**
     * Gets the value of the productPriceGetProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductHandle }
     *     
     */
    public ProductHandle getProductPriceGetProductResult() {
        return productPriceGetProductResult;
    }

    /**
     * Sets the value of the productPriceGetProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHandle }
     *     
     */
    public void setProductPriceGetProductResult(ProductHandle value) {
        this.productPriceGetProductResult = value;
    }

}
