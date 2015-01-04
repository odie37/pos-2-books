
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
 *         &lt;element name="DistributionKey_FindByNumberResult" type="{http://e-conomic.com}DistributionKeyHandle" minOccurs="0"/>
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
    "distributionKeyFindByNumberResult"
})
@XmlRootElement(name = "DistributionKey_FindByNumberResponse")
public class DistributionKeyFindByNumberResponse {

    @XmlElement(name = "DistributionKey_FindByNumberResult")
    protected DistributionKeyHandle distributionKeyFindByNumberResult;

    /**
     * Gets the value of the distributionKeyFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public DistributionKeyHandle getDistributionKeyFindByNumberResult() {
        return distributionKeyFindByNumberResult;
    }

    /**
     * Sets the value of the distributionKeyFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionKeyHandle }
     *     
     */
    public void setDistributionKeyFindByNumberResult(DistributionKeyHandle value) {
        this.distributionKeyFindByNumberResult = value;
    }

}
