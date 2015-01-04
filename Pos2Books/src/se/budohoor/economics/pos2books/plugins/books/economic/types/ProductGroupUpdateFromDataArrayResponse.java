
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
 *         &lt;element name="ProductGroup_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfProductGroupHandle" minOccurs="0"/>
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
    "productGroupUpdateFromDataArrayResult"
})
@XmlRootElement(name = "ProductGroup_UpdateFromDataArrayResponse")
public class ProductGroupUpdateFromDataArrayResponse {

    @XmlElement(name = "ProductGroup_UpdateFromDataArrayResult")
    protected ArrayOfProductGroupHandle productGroupUpdateFromDataArrayResult;

    /**
     * Gets the value of the productGroupUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductGroupHandle }
     *     
     */
    public ArrayOfProductGroupHandle getProductGroupUpdateFromDataArrayResult() {
        return productGroupUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the productGroupUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductGroupHandle }
     *     
     */
    public void setProductGroupUpdateFromDataArrayResult(ArrayOfProductGroupHandle value) {
        this.productGroupUpdateFromDataArrayResult = value;
    }

}
