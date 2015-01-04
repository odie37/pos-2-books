
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
 *         &lt;element name="DistributionKey_GetAllResult" type="{http://e-conomic.com}ArrayOfDistributionKeyHandle" minOccurs="0"/>
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
    "distributionKeyGetAllResult"
})
@XmlRootElement(name = "DistributionKey_GetAllResponse")
public class DistributionKeyGetAllResponse {

    @XmlElement(name = "DistributionKey_GetAllResult")
    protected ArrayOfDistributionKeyHandle distributionKeyGetAllResult;

    /**
     * Gets the value of the distributionKeyGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistributionKeyHandle }
     *     
     */
    public ArrayOfDistributionKeyHandle getDistributionKeyGetAllResult() {
        return distributionKeyGetAllResult;
    }

    /**
     * Sets the value of the distributionKeyGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistributionKeyHandle }
     *     
     */
    public void setDistributionKeyGetAllResult(ArrayOfDistributionKeyHandle value) {
        this.distributionKeyGetAllResult = value;
    }

}
