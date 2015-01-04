
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
 *         &lt;element name="Account_GetEntriesByDateResult" type="{http://e-conomic.com}ArrayOfEntryHandle" minOccurs="0"/>
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
    "accountGetEntriesByDateResult"
})
@XmlRootElement(name = "Account_GetEntriesByDateResponse")
public class AccountGetEntriesByDateResponse {

    @XmlElement(name = "Account_GetEntriesByDateResult")
    protected ArrayOfEntryHandle accountGetEntriesByDateResult;

    /**
     * Gets the value of the accountGetEntriesByDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntryHandle }
     *     
     */
    public ArrayOfEntryHandle getAccountGetEntriesByDateResult() {
        return accountGetEntriesByDateResult;
    }

    /**
     * Sets the value of the accountGetEntriesByDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntryHandle }
     *     
     */
    public void setAccountGetEntriesByDateResult(ArrayOfEntryHandle value) {
        this.accountGetEntriesByDateResult = value;
    }

}
