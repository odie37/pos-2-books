
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
 *         &lt;element name="ProductPrice_FindByProductAndCurrencyResult" type="{http://e-conomic.com}ProductPriceHandle" minOccurs="0"/>
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
    "productPriceFindByProductAndCurrencyResult"
})
@XmlRootElement(name = "ProductPrice_FindByProductAndCurrencyResponse")
public class ProductPriceFindByProductAndCurrencyResponse {

    @XmlElement(name = "ProductPrice_FindByProductAndCurrencyResult")
    protected ProductPriceHandle productPriceFindByProductAndCurrencyResult;

    /**
     * Gets the value of the productPriceFindByProductAndCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPriceHandle }
     *     
     */
    public ProductPriceHandle getProductPriceFindByProductAndCurrencyResult() {
        return productPriceFindByProductAndCurrencyResult;
    }

    /**
     * Sets the value of the productPriceFindByProductAndCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPriceHandle }
     *     
     */
    public void setProductPriceFindByProductAndCurrencyResult(ProductPriceHandle value) {
        this.productPriceFindByProductAndCurrencyResult = value;
    }

}
