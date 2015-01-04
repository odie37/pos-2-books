
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
 *         &lt;element name="PriceGroup_GetDataResult" type="{http://e-conomic.com}PriceGroupData" minOccurs="0"/>
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
    "priceGroupGetDataResult"
})
@XmlRootElement(name = "PriceGroup_GetDataResponse")
public class PriceGroupGetDataResponse {

    @XmlElement(name = "PriceGroup_GetDataResult")
    protected PriceGroupData priceGroupGetDataResult;

    /**
     * Gets the value of the priceGroupGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupData }
     *     
     */
    public PriceGroupData getPriceGroupGetDataResult() {
        return priceGroupGetDataResult;
    }

    /**
     * Sets the value of the priceGroupGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupData }
     *     
     */
    public void setPriceGroupGetDataResult(PriceGroupData value) {
        this.priceGroupGetDataResult = value;
    }

}
