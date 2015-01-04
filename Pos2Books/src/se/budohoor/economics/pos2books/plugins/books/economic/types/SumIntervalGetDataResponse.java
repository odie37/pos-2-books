
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
 *         &lt;element name="SumInterval_GetDataResult" type="{http://e-conomic.com}SumIntervalData" minOccurs="0"/>
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
    "sumIntervalGetDataResult"
})
@XmlRootElement(name = "SumInterval_GetDataResponse")
public class SumIntervalGetDataResponse {

    @XmlElement(name = "SumInterval_GetDataResult")
    protected SumIntervalData sumIntervalGetDataResult;

    /**
     * Gets the value of the sumIntervalGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SumIntervalData }
     *     
     */
    public SumIntervalData getSumIntervalGetDataResult() {
        return sumIntervalGetDataResult;
    }

    /**
     * Sets the value of the sumIntervalGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumIntervalData }
     *     
     */
    public void setSumIntervalGetDataResult(SumIntervalData value) {
        this.sumIntervalGetDataResult = value;
    }

}
