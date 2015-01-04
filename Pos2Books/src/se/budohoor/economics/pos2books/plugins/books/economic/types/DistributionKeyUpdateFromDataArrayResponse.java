
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
 *         &lt;element name="DistributionKey_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDistributionKeyHandle" minOccurs="0"/>
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
    "distributionKeyUpdateFromDataArrayResult"
})
@XmlRootElement(name = "DistributionKey_UpdateFromDataArrayResponse")
public class DistributionKeyUpdateFromDataArrayResponse {

    @XmlElement(name = "DistributionKey_UpdateFromDataArrayResult")
    protected ArrayOfDistributionKeyHandle distributionKeyUpdateFromDataArrayResult;

    /**
     * Gets the value of the distributionKeyUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistributionKeyHandle }
     *     
     */
    public ArrayOfDistributionKeyHandle getDistributionKeyUpdateFromDataArrayResult() {
        return distributionKeyUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the distributionKeyUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistributionKeyHandle }
     *     
     */
    public void setDistributionKeyUpdateFromDataArrayResult(ArrayOfDistributionKeyHandle value) {
        this.distributionKeyUpdateFromDataArrayResult = value;
    }

}
