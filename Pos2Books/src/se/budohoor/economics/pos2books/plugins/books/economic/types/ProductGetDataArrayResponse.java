
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
 *         &lt;element name="Product_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfProductData" minOccurs="0"/>
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
    "productGetDataArrayResult"
})
@XmlRootElement(name = "Product_GetDataArrayResponse")
public class ProductGetDataArrayResponse {

    @XmlElement(name = "Product_GetDataArrayResult")
    protected ArrayOfProductData productGetDataArrayResult;

    /**
     * Gets the value of the productGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductData }
     *     
     */
    public ArrayOfProductData getProductGetDataArrayResult() {
        return productGetDataArrayResult;
    }

    /**
     * Sets the value of the productGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductData }
     *     
     */
    public void setProductGetDataArrayResult(ArrayOfProductData value) {
        this.productGetDataArrayResult = value;
    }

}
