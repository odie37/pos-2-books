
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
 *         &lt;element name="SumInterval_GetAccountResult" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "sumIntervalGetAccountResult"
})
@XmlRootElement(name = "SumInterval_GetAccountResponse")
public class SumIntervalGetAccountResponse {

    @XmlElement(name = "SumInterval_GetAccountResult")
    protected AccountHandle sumIntervalGetAccountResult;

    /**
     * Gets the value of the sumIntervalGetAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getSumIntervalGetAccountResult() {
        return sumIntervalGetAccountResult;
    }

    /**
     * Sets the value of the sumIntervalGetAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setSumIntervalGetAccountResult(AccountHandle value) {
        this.sumIntervalGetAccountResult = value;
    }

}
