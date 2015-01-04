
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
 *         &lt;element name="Account_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfAccountData" minOccurs="0"/>
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
    "accountGetDataArrayResult"
})
@XmlRootElement(name = "Account_GetDataArrayResponse")
public class AccountGetDataArrayResponse {

    @XmlElement(name = "Account_GetDataArrayResult")
    protected ArrayOfAccountData accountGetDataArrayResult;

    /**
     * Gets the value of the accountGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountData }
     *     
     */
    public ArrayOfAccountData getAccountGetDataArrayResult() {
        return accountGetDataArrayResult;
    }

    /**
     * Sets the value of the accountGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountData }
     *     
     */
    public void setAccountGetDataArrayResult(ArrayOfAccountData value) {
        this.accountGetDataArrayResult = value;
    }

}
