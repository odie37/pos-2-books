
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
 *         &lt;element name="ProductGroup_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfProductGroupHandle" minOccurs="0"/>
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
    "productGroupFindByNumberListResult"
})
@XmlRootElement(name = "ProductGroup_FindByNumberListResponse")
public class ProductGroupFindByNumberListResponse {

    @XmlElement(name = "ProductGroup_FindByNumberListResult")
    protected ArrayOfProductGroupHandle productGroupFindByNumberListResult;

    /**
     * Gets the value of the productGroupFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductGroupHandle }
     *     
     */
    public ArrayOfProductGroupHandle getProductGroupFindByNumberListResult() {
        return productGroupFindByNumberListResult;
    }

    /**
     * Sets the value of the productGroupFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductGroupHandle }
     *     
     */
    public void setProductGroupFindByNumberListResult(ArrayOfProductGroupHandle value) {
        this.productGroupFindByNumberListResult = value;
    }

}
