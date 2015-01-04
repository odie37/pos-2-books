
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
 *         &lt;element name="ProductPrice_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfProductPriceData" minOccurs="0"/>
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
    "productPriceGetDataArrayResult"
})
@XmlRootElement(name = "ProductPrice_GetDataArrayResponse")
public class ProductPriceGetDataArrayResponse {

    @XmlElement(name = "ProductPrice_GetDataArrayResult")
    protected ArrayOfProductPriceData productPriceGetDataArrayResult;

    /**
     * Gets the value of the productPriceGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductPriceData }
     *     
     */
    public ArrayOfProductPriceData getProductPriceGetDataArrayResult() {
        return productPriceGetDataArrayResult;
    }

    /**
     * Sets the value of the productPriceGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductPriceData }
     *     
     */
    public void setProductPriceGetDataArrayResult(ArrayOfProductPriceData value) {
        this.productPriceGetDataArrayResult = value;
    }

}
