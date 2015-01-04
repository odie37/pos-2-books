
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
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
 *         &lt;element name="productHandle" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
 *         &lt;element name="currencyHandle" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "productHandle",
    "currencyHandle",
    "price"
})
@XmlRootElement(name = "ProductPrice_Create")
public class ProductPriceCreate {

    protected ProductHandle productHandle;
    protected CurrencyHandle currencyHandle;
    @XmlElement(required = true)
    protected BigDecimal price;

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

    /**
     * Gets the value of the currencyHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getCurrencyHandle() {
        return currencyHandle;
    }

    /**
     * Sets the value of the currencyHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setCurrencyHandle(CurrencyHandle value) {
        this.currencyHandle = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

}
