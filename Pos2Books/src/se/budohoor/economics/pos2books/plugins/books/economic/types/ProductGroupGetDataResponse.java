
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
 *         &lt;element name="ProductGroup_GetDataResult" type="{http://e-conomic.com}ProductGroupData" minOccurs="0"/>
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
    "productGroupGetDataResult"
})
@XmlRootElement(name = "ProductGroup_GetDataResponse")
public class ProductGroupGetDataResponse {

    @XmlElement(name = "ProductGroup_GetDataResult")
    protected ProductGroupData productGroupGetDataResult;

    /**
     * Gets the value of the productGroupGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupData }
     *     
     */
    public ProductGroupData getProductGroupGetDataResult() {
        return productGroupGetDataResult;
    }

    /**
     * Sets the value of the productGroupGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupData }
     *     
     */
    public void setProductGroupGetDataResult(ProductGroupData value) {
        this.productGroupGetDataResult = value;
    }

}
