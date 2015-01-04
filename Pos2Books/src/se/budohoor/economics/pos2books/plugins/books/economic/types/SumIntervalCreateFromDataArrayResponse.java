
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
 *         &lt;element name="SumInterval_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfSumIntervalHandle" minOccurs="0"/>
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
    "sumIntervalCreateFromDataArrayResult"
})
@XmlRootElement(name = "SumInterval_CreateFromDataArrayResponse")
public class SumIntervalCreateFromDataArrayResponse {

    @XmlElement(name = "SumInterval_CreateFromDataArrayResult")
    protected ArrayOfSumIntervalHandle sumIntervalCreateFromDataArrayResult;

    /**
     * Gets the value of the sumIntervalCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSumIntervalHandle }
     *     
     */
    public ArrayOfSumIntervalHandle getSumIntervalCreateFromDataArrayResult() {
        return sumIntervalCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the sumIntervalCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSumIntervalHandle }
     *     
     */
    public void setSumIntervalCreateFromDataArrayResult(ArrayOfSumIntervalHandle value) {
        this.sumIntervalCreateFromDataArrayResult = value;
    }

}
