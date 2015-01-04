
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
 *         &lt;element name="ProductPrice_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfProductPriceHandle" minOccurs="0"/>
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
    "productPriceUpdateFromDataArrayResult"
})
@XmlRootElement(name = "ProductPrice_UpdateFromDataArrayResponse")
public class ProductPriceUpdateFromDataArrayResponse {

    @XmlElement(name = "ProductPrice_UpdateFromDataArrayResult")
    protected ArrayOfProductPriceHandle productPriceUpdateFromDataArrayResult;

    /**
     * Gets the value of the productPriceUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductPriceHandle }
     *     
     */
    public ArrayOfProductPriceHandle getProductPriceUpdateFromDataArrayResult() {
        return productPriceUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the productPriceUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductPriceHandle }
     *     
     */
    public void setProductPriceUpdateFromDataArrayResult(ArrayOfProductPriceHandle value) {
        this.productPriceUpdateFromDataArrayResult = value;
    }

}
