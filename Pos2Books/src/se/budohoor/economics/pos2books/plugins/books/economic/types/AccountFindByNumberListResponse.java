
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
 *         &lt;element name="Account_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfAccountHandle" minOccurs="0"/>
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
    "accountFindByNumberListResult"
})
@XmlRootElement(name = "Account_FindByNumberListResponse")
public class AccountFindByNumberListResponse {

    @XmlElement(name = "Account_FindByNumberListResult")
    protected ArrayOfAccountHandle accountFindByNumberListResult;

    /**
     * Gets the value of the accountFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountHandle }
     *     
     */
    public ArrayOfAccountHandle getAccountFindByNumberListResult() {
        return accountFindByNumberListResult;
    }

    /**
     * Sets the value of the accountFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountHandle }
     *     
     */
    public void setAccountFindByNumberListResult(ArrayOfAccountHandle value) {
        this.accountFindByNumberListResult = value;
    }

}
