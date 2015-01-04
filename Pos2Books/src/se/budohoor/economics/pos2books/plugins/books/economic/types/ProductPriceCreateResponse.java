
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
 *         &lt;element name="ProductPrice_CreateResult" type="{http://e-conomic.com}ProductPriceHandle" minOccurs="0"/>
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
    "productPriceCreateResult"
})
@XmlRootElement(name = "ProductPrice_CreateResponse")
public class ProductPriceCreateResponse {

    @XmlElement(name = "ProductPrice_CreateResult")
    protected ProductPriceHandle productPriceCreateResult;

    /**
     * Gets the value of the productPriceCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPriceHandle }
     *     
     */
    public ProductPriceHandle getProductPriceCreateResult() {
        return productPriceCreateResult;
    }

    /**
     * Sets the value of the productPriceCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPriceHandle }
     *     
     */
    public void setProductPriceCreateResult(ProductPriceHandle value) {
        this.productPriceCreateResult = value;
    }

}
