
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
 *         &lt;element name="ProductGroup_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfProductGroupHandle" minOccurs="0"/>
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
    "productGroupCreateFromDataArrayResult"
})
@XmlRootElement(name = "ProductGroup_CreateFromDataArrayResponse")
public class ProductGroupCreateFromDataArrayResponse {

    @XmlElement(name = "ProductGroup_CreateFromDataArrayResult")
    protected ArrayOfProductGroupHandle productGroupCreateFromDataArrayResult;

    /**
     * Gets the value of the productGroupCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductGroupHandle }
     *     
     */
    public ArrayOfProductGroupHandle getProductGroupCreateFromDataArrayResult() {
        return productGroupCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the productGroupCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductGroupHandle }
     *     
     */
    public void setProductGroupCreateFromDataArrayResult(ArrayOfProductGroupHandle value) {
        this.productGroupCreateFromDataArrayResult = value;
    }

}
