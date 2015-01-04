
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="productPriceHandle" type="{http://e-conomic.com}ProductPriceHandle" minOccurs="0"/>
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
    "productPriceHandle"
})
@XmlRootElement(name = "ProductPrice_GetCurrency")
public class ProductPriceGetCurrency {

    protected ProductPriceHandle productPriceHandle;

    /**
     * Gets the value of the productPriceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPriceHandle }
     *     
     */
    public ProductPriceHandle getProductPriceHandle() {
        return productPriceHandle;
    }

    /**
     * Sets the value of the productPriceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPriceHandle }
     *     
     */
    public void setProductPriceHandle(ProductPriceHandle value) {
        this.productPriceHandle = value;
    }

}
