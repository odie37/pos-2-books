
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
 *         &lt;element name="PriceGroup_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfPriceGroupHandle" minOccurs="0"/>
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
    "priceGroupUpdateFromDataArrayResult"
})
@XmlRootElement(name = "PriceGroup_UpdateFromDataArrayResponse")
public class PriceGroupUpdateFromDataArrayResponse {

    @XmlElement(name = "PriceGroup_UpdateFromDataArrayResult")
    protected ArrayOfPriceGroupHandle priceGroupUpdateFromDataArrayResult;

    /**
     * Gets the value of the priceGroupUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceGroupHandle }
     *     
     */
    public ArrayOfPriceGroupHandle getPriceGroupUpdateFromDataArrayResult() {
        return priceGroupUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the priceGroupUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceGroupHandle }
     *     
     */
    public void setPriceGroupUpdateFromDataArrayResult(ArrayOfPriceGroupHandle value) {
        this.priceGroupUpdateFromDataArrayResult = value;
    }

}
