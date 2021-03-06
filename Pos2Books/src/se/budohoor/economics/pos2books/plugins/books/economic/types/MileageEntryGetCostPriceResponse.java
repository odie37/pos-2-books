
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
 *         &lt;element name="MileageEntry_GetCostPriceResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "mileageEntryGetCostPriceResult"
})
@XmlRootElement(name = "MileageEntry_GetCostPriceResponse")
public class MileageEntryGetCostPriceResponse {

    @XmlElement(name = "MileageEntry_GetCostPriceResult", required = true)
    protected BigDecimal mileageEntryGetCostPriceResult;

    /**
     * Gets the value of the mileageEntryGetCostPriceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMileageEntryGetCostPriceResult() {
        return mileageEntryGetCostPriceResult;
    }

    /**
     * Sets the value of the mileageEntryGetCostPriceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMileageEntryGetCostPriceResult(BigDecimal value) {
        this.mileageEntryGetCostPriceResult = value;
    }

}
