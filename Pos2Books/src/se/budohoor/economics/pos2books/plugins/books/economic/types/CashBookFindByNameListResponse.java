
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
 *         &lt;element name="CashBook_FindByNameListResult" type="{http://e-conomic.com}ArrayOfCashBookHandle" minOccurs="0"/>
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
    "cashBookFindByNameListResult"
})
@XmlRootElement(name = "CashBook_FindByNameListResponse")
public class CashBookFindByNameListResponse {

    @XmlElement(name = "CashBook_FindByNameListResult")
    protected ArrayOfCashBookHandle cashBookFindByNameListResult;

    /**
     * Gets the value of the cashBookFindByNameListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookHandle }
     *     
     */
    public ArrayOfCashBookHandle getCashBookFindByNameListResult() {
        return cashBookFindByNameListResult;
    }

    /**
     * Sets the value of the cashBookFindByNameListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookHandle }
     *     
     */
    public void setCashBookFindByNameListResult(ArrayOfCashBookHandle value) {
        this.cashBookFindByNameListResult = value;
    }

}
