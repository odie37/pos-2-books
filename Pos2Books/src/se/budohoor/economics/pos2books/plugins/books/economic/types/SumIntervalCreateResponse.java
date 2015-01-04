
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
 *         &lt;element name="SumInterval_CreateResult" type="{http://e-conomic.com}SumIntervalHandle" minOccurs="0"/>
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
    "sumIntervalCreateResult"
})
@XmlRootElement(name = "SumInterval_CreateResponse")
public class SumIntervalCreateResponse {

    @XmlElement(name = "SumInterval_CreateResult")
    protected SumIntervalHandle sumIntervalCreateResult;

    /**
     * Gets the value of the sumIntervalCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SumIntervalHandle }
     *     
     */
    public SumIntervalHandle getSumIntervalCreateResult() {
        return sumIntervalCreateResult;
    }

    /**
     * Sets the value of the sumIntervalCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumIntervalHandle }
     *     
     */
    public void setSumIntervalCreateResult(SumIntervalHandle value) {
        this.sumIntervalCreateResult = value;
    }

}
