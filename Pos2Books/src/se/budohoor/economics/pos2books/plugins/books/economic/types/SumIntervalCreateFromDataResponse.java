
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
 *         &lt;element name="SumInterval_CreateFromDataResult" type="{http://e-conomic.com}SumIntervalHandle" minOccurs="0"/>
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
    "sumIntervalCreateFromDataResult"
})
@XmlRootElement(name = "SumInterval_CreateFromDataResponse")
public class SumIntervalCreateFromDataResponse {

    @XmlElement(name = "SumInterval_CreateFromDataResult")
    protected SumIntervalHandle sumIntervalCreateFromDataResult;

    /**
     * Gets the value of the sumIntervalCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SumIntervalHandle }
     *     
     */
    public SumIntervalHandle getSumIntervalCreateFromDataResult() {
        return sumIntervalCreateFromDataResult;
    }

    /**
     * Sets the value of the sumIntervalCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumIntervalHandle }
     *     
     */
    public void setSumIntervalCreateFromDataResult(SumIntervalHandle value) {
        this.sumIntervalCreateFromDataResult = value;
    }

}
