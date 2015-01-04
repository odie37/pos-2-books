
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
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "value"
})
@XmlRootElement(name = "ProductGroup_SetName")
public class ProductGroupSetName {

    protected ProductGroupHandle productGroupHandle;
    protected String value;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
