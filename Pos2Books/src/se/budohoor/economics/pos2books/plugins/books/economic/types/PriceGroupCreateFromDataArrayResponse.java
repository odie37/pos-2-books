
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
 *         &lt;element name="PriceGroup_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfPriceGroupHandle" minOccurs="0"/>
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
    "priceGroupCreateFromDataArrayResult"
})
@XmlRootElement(name = "PriceGroup_CreateFromDataArrayResponse")
public class PriceGroupCreateFromDataArrayResponse {

    @XmlElement(name = "PriceGroup_CreateFromDataArrayResult")
    protected ArrayOfPriceGroupHandle priceGroupCreateFromDataArrayResult;

    /**
     * Gets the value of the priceGroupCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceGroupHandle }
     *     
     */
    public ArrayOfPriceGroupHandle getPriceGroupCreateFromDataArrayResult() {
        return priceGroupCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the priceGroupCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceGroupHandle }
     *     
     */
    public void setPriceGroupCreateFromDataArrayResult(ArrayOfPriceGroupHandle value) {
        this.priceGroupCreateFromDataArrayResult = value;
    }

}
