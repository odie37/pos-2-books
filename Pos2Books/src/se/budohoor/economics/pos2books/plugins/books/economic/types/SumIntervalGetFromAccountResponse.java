
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
 *         &lt;element name="SumInterval_GetFromAccountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sumIntervalGetFromAccountResult"
})
@XmlRootElement(name = "SumInterval_GetFromAccountResponse")
public class SumIntervalGetFromAccountResponse {

    @XmlElement(name = "SumInterval_GetFromAccountResult")
    protected int sumIntervalGetFromAccountResult;

    /**
     * Gets the value of the sumIntervalGetFromAccountResult property.
     * 
     */
    public int getSumIntervalGetFromAccountResult() {
        return sumIntervalGetFromAccountResult;
    }

    /**
     * Sets the value of the sumIntervalGetFromAccountResult property.
     * 
     */
    public void setSumIntervalGetFromAccountResult(int value) {
        this.sumIntervalGetFromAccountResult = value;
    }

}
