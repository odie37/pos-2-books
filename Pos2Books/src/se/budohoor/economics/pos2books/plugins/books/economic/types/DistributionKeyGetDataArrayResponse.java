
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
 *         &lt;element name="DistributionKey_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfDistributionKeyData" minOccurs="0"/>
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
    "distributionKeyGetDataArrayResult"
})
@XmlRootElement(name = "DistributionKey_GetDataArrayResponse")
public class DistributionKeyGetDataArrayResponse {

    @XmlElement(name = "DistributionKey_GetDataArrayResult")
    protected ArrayOfDistributionKeyData distributionKeyGetDataArrayResult;

    /**
     * Gets the value of the distributionKeyGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistributionKeyData }
     *     
     */
    public ArrayOfDistributionKeyData getDistributionKeyGetDataArrayResult() {
        return distributionKeyGetDataArrayResult;
    }

    /**
     * Sets the value of the distributionKeyGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistributionKeyData }
     *     
     */
    public void setDistributionKeyGetDataArrayResult(ArrayOfDistributionKeyData value) {
        this.distributionKeyGetDataArrayResult = value;
    }

}
