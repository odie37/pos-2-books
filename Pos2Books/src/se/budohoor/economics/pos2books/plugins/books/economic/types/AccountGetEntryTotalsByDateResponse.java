
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
 *         &lt;element name="Account_GetEntryTotalsByDateResult" type="{http://e-conomic.com}ArrayOfDecimal" minOccurs="0"/>
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
    "accountGetEntryTotalsByDateResult"
})
@XmlRootElement(name = "Account_GetEntryTotalsByDateResponse")
public class AccountGetEntryTotalsByDateResponse {

    @XmlElement(name = "Account_GetEntryTotalsByDateResult")
    protected ArrayOfDecimal accountGetEntryTotalsByDateResult;

    /**
     * Gets the value of the accountGetEntryTotalsByDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public ArrayOfDecimal getAccountGetEntryTotalsByDateResult() {
        return accountGetEntryTotalsByDateResult;
    }

    /**
     * Sets the value of the accountGetEntryTotalsByDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public void setAccountGetEntryTotalsByDateResult(ArrayOfDecimal value) {
        this.accountGetEntryTotalsByDateResult = value;
    }

}
