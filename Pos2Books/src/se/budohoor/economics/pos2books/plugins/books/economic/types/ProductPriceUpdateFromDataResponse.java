
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
 *         &lt;element name="ProductPrice_UpdateFromDataResult" type="{http://e-conomic.com}ProductPriceHandle" minOccurs="0"/>
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
    "productPriceUpdateFromDataResult"
})
@XmlRootElement(name = "ProductPrice_UpdateFromDataResponse")
public class ProductPriceUpdateFromDataResponse {

    @XmlElement(name = "ProductPrice_UpdateFromDataResult")
    protected ProductPriceHandle productPriceUpdateFromDataResult;

    /**
     * Gets the value of the productPriceUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPriceHandle }
     *     
     */
    public ProductPriceHandle getProductPriceUpdateFromDataResult() {
        return productPriceUpdateFromDataResult;
    }

    /**
     * Sets the value of the productPriceUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPriceHandle }
     *     
     */
    public void setProductPriceUpdateFromDataResult(ProductPriceHandle value) {
        this.productPriceUpdateFromDataResult = value;
    }

}
