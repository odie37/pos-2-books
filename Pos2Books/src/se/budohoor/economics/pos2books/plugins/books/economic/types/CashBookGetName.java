
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
 *         &lt;element name="cashBookHandle" type="{http://e-conomic.com}CashBookHandle" minOccurs="0"/>
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
    "cashBookHandle"
})
@XmlRootElement(name = "CashBook_GetName")
public class CashBookGetName {

    protected CashBookHandle cashBookHandle;

    /**
     * Gets the value of the cashBookHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookHandle }
     *     
     */
    public CashBookHandle getCashBookHandle() {
        return cashBookHandle;
    }

    /**
     * Sets the value of the cashBookHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookHandle }
     *     
     */
    public void setCashBookHandle(CashBookHandle value) {
        this.cashBookHandle = value;
    }

}
