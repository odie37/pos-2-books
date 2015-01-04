
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
 *         &lt;element name="Account_GetSumIntervalsResult" type="{http://e-conomic.com}ArrayOfSumIntervalHandle" minOccurs="0"/>
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
    "accountGetSumIntervalsResult"
})
@XmlRootElement(name = "Account_GetSumIntervalsResponse")
public class AccountGetSumIntervalsResponse {

    @XmlElement(name = "Account_GetSumIntervalsResult")
    protected ArrayOfSumIntervalHandle accountGetSumIntervalsResult;

    /**
     * Gets the value of the accountGetSumIntervalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSumIntervalHandle }
     *     
     */
    public ArrayOfSumIntervalHandle getAccountGetSumIntervalsResult() {
        return accountGetSumIntervalsResult;
    }

    /**
     * Sets the value of the accountGetSumIntervalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSumIntervalHandle }
     *     
     */
    public void setAccountGetSumIntervalsResult(ArrayOfSumIntervalHandle value) {
        this.accountGetSumIntervalsResult = value;
    }

}
