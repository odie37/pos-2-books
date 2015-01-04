
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
 *         &lt;element name="ProductPrice_GetDataResult" type="{http://e-conomic.com}ProductPriceData" minOccurs="0"/>
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
    "productPriceGetDataResult"
})
@XmlRootElement(name = "ProductPrice_GetDataResponse")
public class ProductPriceGetDataResponse {

    @XmlElement(name = "ProductPrice_GetDataResult")
    protected ProductPriceData productPriceGetDataResult;

    /**
     * Gets the value of the productPriceGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPriceData }
     *     
     */
    public ProductPriceData getProductPriceGetDataResult() {
        return productPriceGetDataResult;
    }

    /**
     * Sets the value of the productPriceGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPriceData }
     *     
     */
    public void setProductPriceGetDataResult(ProductPriceData value) {
        this.productPriceGetDataResult = value;
    }

}
