
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
 *         &lt;element name="PriceGroup_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfPriceGroupHandle" minOccurs="0"/>
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
    "priceGroupFindByNumberListResult"
})
@XmlRootElement(name = "PriceGroup_FindByNumberListResponse")
public class PriceGroupFindByNumberListResponse {

    @XmlElement(name = "PriceGroup_FindByNumberListResult")
    protected ArrayOfPriceGroupHandle priceGroupFindByNumberListResult;

    /**
     * Gets the value of the priceGroupFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceGroupHandle }
     *     
     */
    public ArrayOfPriceGroupHandle getPriceGroupFindByNumberListResult() {
        return priceGroupFindByNumberListResult;
    }

    /**
     * Sets the value of the priceGroupFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceGroupHandle }
     *     
     */
    public void setPriceGroupFindByNumberListResult(ArrayOfPriceGroupHandle value) {
        this.priceGroupFindByNumberListResult = value;
    }

}
