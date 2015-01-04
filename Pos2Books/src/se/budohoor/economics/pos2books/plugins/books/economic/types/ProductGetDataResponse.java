
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
 *         &lt;element name="Product_GetDataResult" type="{http://e-conomic.com}ProductData" minOccurs="0"/>
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
    "productGetDataResult"
})
@XmlRootElement(name = "Product_GetDataResponse")
public class ProductGetDataResponse {

    @XmlElement(name = "Product_GetDataResult")
    protected ProductData productGetDataResult;

    /**
     * Gets the value of the productGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductData }
     *     
     */
    public ProductData getProductGetDataResult() {
        return productGetDataResult;
    }

    /**
     * Sets the value of the productGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductData }
     *     
     */
    public void setProductGetDataResult(ProductData value) {
        this.productGetDataResult = value;
    }

}
