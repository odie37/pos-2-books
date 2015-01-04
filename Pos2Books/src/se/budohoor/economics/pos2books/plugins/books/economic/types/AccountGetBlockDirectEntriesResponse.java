
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
 *         &lt;element name="Account_GetBlockDirectEntriesResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "accountGetBlockDirectEntriesResult"
})
@XmlRootElement(name = "Account_GetBlockDirectEntriesResponse")
public class AccountGetBlockDirectEntriesResponse {

    @XmlElement(name = "Account_GetBlockDirectEntriesResult")
    protected boolean accountGetBlockDirectEntriesResult;

    /**
     * Gets the value of the accountGetBlockDirectEntriesResult property.
     * 
     */
    public boolean isAccountGetBlockDirectEntriesResult() {
        return accountGetBlockDirectEntriesResult;
    }

    /**
     * Sets the value of the accountGetBlockDirectEntriesResult property.
     * 
     */
    public void setAccountGetBlockDirectEntriesResult(boolean value) {
        this.accountGetBlockDirectEntriesResult = value;
    }

}
