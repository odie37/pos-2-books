
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
 *         &lt;element name="MileageEntry_GetCostRateResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "mileageEntryGetCostRateResult"
})
@XmlRootElement(name = "MileageEntry_GetCostRateResponse")
public class MileageEntryGetCostRateResponse {

    @XmlElement(name = "MileageEntry_GetCostRateResult", required = true, nillable = true)
    protected BigDecimal mileageEntryGetCostRateResult;

    /**
     * Gets the value of the mileageEntryGetCostRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMileageEntryGetCostRateResult() {
        return mileageEntryGetCostRateResult;
    }

    /**
     * Sets the value of the mileageEntryGetCostRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMileageEntryGetCostRateResult(BigDecimal value) {
        this.mileageEntryGetCostRateResult = value;
    }

}
