
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
 *         &lt;element name="Product_GetAllUpdatedResult" type="{http://e-conomic.com}ArrayOfProductHandle" minOccurs="0"/>
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
    "productGetAllUpdatedResult"
})
@XmlRootElement(name = "Product_GetAllUpdatedResponse")
public class ProductGetAllUpdatedResponse {

    @XmlElement(name = "Product_GetAllUpdatedResult")
    protected ArrayOfProductHandle productGetAllUpdatedResult;

    /**
     * Gets the value of the productGetAllUpdatedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductHandle }
     *     
     */
    public ArrayOfProductHandle getProductGetAllUpdatedResult() {
        return productGetAllUpdatedResult;
    }

    /**
     * Sets the value of the productGetAllUpdatedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductHandle }
     *     
     */
    public void setProductGetAllUpdatedResult(ArrayOfProductHandle value) {
        this.productGetAllUpdatedResult = value;
    }

}
