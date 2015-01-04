
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
 *         &lt;element name="DistributionKey_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "distributionKeyGetNumberResult"
})
@XmlRootElement(name = "DistributionKey_GetNumberResponse")
public class DistributionKeyGetNumberResponse {

    @XmlElement(name = "DistributionKey_GetNumberResult")
    protected int distributionKeyGetNumberResult;

    /**
     * Gets the value of the distributionKeyGetNumberResult property.
     * 
     */
    public int getDistributionKeyGetNumberResult() {
        return distributionKeyGetNumberResult;
    }

    /**
     * Sets the value of the distributionKeyGetNumberResult property.
     * 
     */
    public void setDistributionKeyGetNumberResult(int value) {
        this.distributionKeyGetNumberResult = value;
    }

}