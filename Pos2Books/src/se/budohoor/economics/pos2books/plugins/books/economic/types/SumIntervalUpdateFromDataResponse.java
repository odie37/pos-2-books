
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
 *         &lt;element name="SumInterval_UpdateFromDataResult" type="{http://e-conomic.com}SumIntervalHandle" minOccurs="0"/>
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
    "sumIntervalUpdateFromDataResult"
})
@XmlRootElement(name = "SumInterval_UpdateFromDataResponse")
public class SumIntervalUpdateFromDataResponse {

    @XmlElement(name = "SumInterval_UpdateFromDataResult")
    protected SumIntervalHandle sumIntervalUpdateFromDataResult;

    /**
     * Gets the value of the sumIntervalUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SumIntervalHandle }
     *     
     */
    public SumIntervalHandle getSumIntervalUpdateFromDataResult() {
        return sumIntervalUpdateFromDataResult;
    }

    /**
     * Sets the value of the sumIntervalUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumIntervalHandle }
     *     
     */
    public void setSumIntervalUpdateFromDataResult(SumIntervalHandle value) {
        this.sumIntervalUpdateFromDataResult = value;
    }

}
