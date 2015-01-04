
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
 *         &lt;element name="PriceGroup_CreateFromDataResult" type="{http://e-conomic.com}PriceGroupHandle" minOccurs="0"/>
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
    "priceGroupCreateFromDataResult"
})
@XmlRootElement(name = "PriceGroup_CreateFromDataResponse")
public class PriceGroupCreateFromDataResponse {

    @XmlElement(name = "PriceGroup_CreateFromDataResult")
    protected PriceGroupHandle priceGroupCreateFromDataResult;

    /**
     * Gets the value of the priceGroupCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupHandle }
     *     
     */
    public PriceGroupHandle getPriceGroupCreateFromDataResult() {
        return priceGroupCreateFromDataResult;
    }

    /**
     * Sets the value of the priceGroupCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupHandle }
     *     
     */
    public void setPriceGroupCreateFromDataResult(PriceGroupHandle value) {
        this.priceGroupCreateFromDataResult = value;
    }

}
