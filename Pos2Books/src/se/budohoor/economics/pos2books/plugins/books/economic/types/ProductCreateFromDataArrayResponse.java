
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
 *         &lt;element name="Product_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfProductHandle" minOccurs="0"/>
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
    "productCreateFromDataArrayResult"
})
@XmlRootElement(name = "Product_CreateFromDataArrayResponse")
public class ProductCreateFromDataArrayResponse {

    @XmlElement(name = "Product_CreateFromDataArrayResult")
    protected ArrayOfProductHandle productCreateFromDataArrayResult;

    /**
     * Gets the value of the productCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductHandle }
     *     
     */
    public ArrayOfProductHandle getProductCreateFromDataArrayResult() {
        return productCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the productCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductHandle }
     *     
     */
    public void setProductCreateFromDataArrayResult(ArrayOfProductHandle value) {
        this.productCreateFromDataArrayResult = value;
    }

}
