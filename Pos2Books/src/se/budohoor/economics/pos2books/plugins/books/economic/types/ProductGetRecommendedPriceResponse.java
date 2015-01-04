
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
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
 *         &lt;element name="Product_GetRecommendedPriceResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "productGetRecommendedPriceResult"
})
@XmlRootElement(name = "Product_GetRecommendedPriceResponse")
public class ProductGetRecommendedPriceResponse {

    @XmlElement(name = "Product_GetRecommendedPriceResult", required = true)
    protected BigDecimal productGetRecommendedPriceResult;

    /**
     * Gets the value of the productGetRecommendedPriceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductGetRecommendedPriceResult() {
        return productGetRecommendedPriceResult;
    }

    /**
     * Sets the value of the productGetRecommendedPriceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductGetRecommendedPriceResult(BigDecimal value) {
        this.productGetRecommendedPriceResult = value;
    }

}
