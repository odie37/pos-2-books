
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
 *         &lt;element name="Product_GetDescriptionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "productGetDescriptionResult"
})
@XmlRootElement(name = "Product_GetDescriptionResponse")
public class ProductGetDescriptionResponse {

    @XmlElement(name = "Product_GetDescriptionResult")
    protected String productGetDescriptionResult;

    /**
     * Gets the value of the productGetDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGetDescriptionResult() {
        return productGetDescriptionResult;
    }

    /**
     * Sets the value of the productGetDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGetDescriptionResult(String value) {
        this.productGetDescriptionResult = value;
    }

}
