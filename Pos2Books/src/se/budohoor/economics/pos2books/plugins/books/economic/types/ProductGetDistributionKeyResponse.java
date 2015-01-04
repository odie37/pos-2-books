
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
 *         &lt;element name="Product_GetDistributionKeyResult" type="{http://e-conomic.com}DistributionKeyHandle" minOccurs="0"/>
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
    "productGetDistributionKeyResult"
})
@XmlRootElement(name = "Product_GetDistributionKeyResponse")
public class ProductGetDistributionKeyResponse {

    @XmlElement(name = "Product_GetDistributionKeyResult")
    protected DistributionKeyHandle productGetDistributionKeyResult;

    /**
     * Gets the value of the productGetDistributionKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public DistributionKeyHandle getProductGetDistributionKeyResult() {
        return productGetDistributionKeyResult;
    }

    /**
     * Sets the value of the productGetDistributionKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public void setProductGetDistributionKeyResult(DistributionKeyHandle value) {
        this.productGetDistributionKeyResult = value;
    }

}
