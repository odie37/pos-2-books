
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
 *         &lt;element name="productGroupHandle" type="{http://e-conomic.com}ProductGroupHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "productGroupHandle",
    "valueHandle"
})
@XmlRootElement(name = "ProductGroup_SetAccrual")
public class ProductGroupSetAccrual {

    protected ProductGroupHandle productGroupHandle;
    protected AccountHandle valueHandle;

    /**
     * Gets the value of the productGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupHandle }
     *     
     */
    public ProductGroupHandle getProductGroupHandle() {
        return productGroupHandle;
    }

    /**
     * Sets the value of the productGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupHandle }
     *     
     */
    public void setProductGroupHandle(ProductGroupHandle value) {
        this.productGroupHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setValueHandle(AccountHandle value) {
        this.valueHandle = value;
    }

}
