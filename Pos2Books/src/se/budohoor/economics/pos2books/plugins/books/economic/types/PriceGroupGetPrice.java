
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
 *         &lt;element name="priceGroupHandle" type="{http://e-conomic.com}PriceGroupHandle" minOccurs="0"/>
 *         &lt;element name="productHandle" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
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
    "priceGroupHandle",
    "productHandle"
})
@XmlRootElement(name = "PriceGroup_GetPrice")
public class PriceGroupGetPrice {

    protected PriceGroupHandle priceGroupHandle;
    protected ProductHandle productHandle;

    /**
     * Gets the value of the priceGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupHandle }
     *     
     */
    public PriceGroupHandle getPriceGroupHandle() {
        return priceGroupHandle;
    }

    /**
     * Sets the value of the priceGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupHandle }
     *     
     */
    public void setPriceGroupHandle(PriceGroupHandle value) {
        this.priceGroupHandle = value;
    }

    /**
     * Gets the value of the productHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductHandle }
     *     
     */
    public ProductHandle getProductHandle() {
        return productHandle;
    }

    /**
     * Sets the value of the productHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHandle }
     *     
     */
    public void setProductHandle(ProductHandle value) {
        this.productHandle = value;
    }

}
