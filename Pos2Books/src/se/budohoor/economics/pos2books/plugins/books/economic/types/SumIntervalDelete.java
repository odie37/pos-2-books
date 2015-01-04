
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sumIntervalHandle" type="{http://e-conomic.com}SumIntervalHandle" minOccurs="0"/>
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
    "sumIntervalHandle"
})
@XmlRootElement(name = "SumInterval_Delete")
public class SumIntervalDelete {

    protected SumIntervalHandle sumIntervalHandle;

    /**
     * Gets the value of the sumIntervalHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SumIntervalHandle }
     *     
     */
    public SumIntervalHandle getSumIntervalHandle() {
        return sumIntervalHandle;
    }

    /**
     * Sets the value of the sumIntervalHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumIntervalHandle }
     *     
     */
    public void setSumIntervalHandle(SumIntervalHandle value) {
        this.sumIntervalHandle = value;
    }

}
