
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
 *         &lt;element name="Currency_FindByCodeResult" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
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
    "currencyFindByCodeResult"
})
@XmlRootElement(name = "Currency_FindByCodeResponse")
public class CurrencyFindByCodeResponse {

    @XmlElement(name = "Currency_FindByCodeResult")
    protected CurrencyHandle currencyFindByCodeResult;

    /**
     * Gets the value of the currencyFindByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getCurrencyFindByCodeResult() {
        return currencyFindByCodeResult;
    }

    /**
     * Sets the value of the currencyFindByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setCurrencyFindByCodeResult(CurrencyHandle value) {
        this.currencyFindByCodeResult = value;
    }

}
