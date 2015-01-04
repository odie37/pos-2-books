
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
 *         &lt;element name="SumInterval_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfSumIntervalData" minOccurs="0"/>
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
    "sumIntervalGetDataArrayResult"
})
@XmlRootElement(name = "SumInterval_GetDataArrayResponse")
public class SumIntervalGetDataArrayResponse {

    @XmlElement(name = "SumInterval_GetDataArrayResult")
    protected ArrayOfSumIntervalData sumIntervalGetDataArrayResult;

    /**
     * Gets the value of the sumIntervalGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSumIntervalData }
     *     
     */
    public ArrayOfSumIntervalData getSumIntervalGetDataArrayResult() {
        return sumIntervalGetDataArrayResult;
    }

    /**
     * Sets the value of the sumIntervalGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSumIntervalData }
     *     
     */
    public void setSumIntervalGetDataArrayResult(ArrayOfSumIntervalData value) {
        this.sumIntervalGetDataArrayResult = value;
    }

}
