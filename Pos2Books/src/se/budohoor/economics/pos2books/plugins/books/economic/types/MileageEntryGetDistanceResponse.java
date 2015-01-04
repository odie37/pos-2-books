
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
 *         &lt;element name="MileageEntry_GetDistanceResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "mileageEntryGetDistanceResult"
})
@XmlRootElement(name = "MileageEntry_GetDistanceResponse")
public class MileageEntryGetDistanceResponse {

    @XmlElement(name = "MileageEntry_GetDistanceResult", required = true)
    protected BigDecimal mileageEntryGetDistanceResult;

    /**
     * Gets the value of the mileageEntryGetDistanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMileageEntryGetDistanceResult() {
        return mileageEntryGetDistanceResult;
    }

    /**
     * Sets the value of the mileageEntryGetDistanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMileageEntryGetDistanceResult(BigDecimal value) {
        this.mileageEntryGetDistanceResult = value;
    }

}
