
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
 *         &lt;element name="DistributionKey_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfDistributionKeyHandle" minOccurs="0"/>
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
    "distributionKeyFindByNumberListResult"
})
@XmlRootElement(name = "DistributionKey_FindByNumberListResponse")
public class DistributionKeyFindByNumberListResponse {

    @XmlElement(name = "DistributionKey_FindByNumberListResult")
    protected ArrayOfDistributionKeyHandle distributionKeyFindByNumberListResult;

    /**
     * Gets the value of the distributionKeyFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistributionKeyHandle }
     *     
     */
    public ArrayOfDistributionKeyHandle getDistributionKeyFindByNumberListResult() {
        return distributionKeyFindByNumberListResult;
    }

    /**
     * Sets the value of the distributionKeyFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistributionKeyHandle }
     *     
     */
    public void setDistributionKeyFindByNumberListResult(ArrayOfDistributionKeyHandle value) {
        this.distributionKeyFindByNumberListResult = value;
    }

}
