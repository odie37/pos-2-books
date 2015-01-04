
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
 *         &lt;element name="ProductGroup_FindByNumberResult" type="{http://e-conomic.com}ProductGroupHandle" minOccurs="0"/>
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
    "productGroupFindByNumberResult"
})
@XmlRootElement(name = "ProductGroup_FindByNumberResponse")
public class ProductGroupFindByNumberResponse {

    @XmlElement(name = "ProductGroup_FindByNumberResult")
    protected ProductGroupHandle productGroupFindByNumberResult;

    /**
     * Gets the value of the productGroupFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupHandle }
     *     
     */
    public ProductGroupHandle getProductGroupFindByNumberResult() {
        return productGroupFindByNumberResult;
    }

    /**
     * Sets the value of the productGroupFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupHandle }
     *     
     */
    public void setProductGroupFindByNumberResult(ProductGroupHandle value) {
        this.productGroupFindByNumberResult = value;
    }

}
