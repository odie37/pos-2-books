
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
 *         &lt;element name="DebtorGroup_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "debtorGroupGetNumberResult"
})
@XmlRootElement(name = "DebtorGroup_GetNumberResponse")
public class DebtorGroupGetNumberResponse {

    @XmlElement(name = "DebtorGroup_GetNumberResult")
    protected int debtorGroupGetNumberResult;

    /**
     * Gets the value of the debtorGroupGetNumberResult property.
     * 
     */
    public int getDebtorGroupGetNumberResult() {
        return debtorGroupGetNumberResult;
    }

    /**
     * Sets the value of the debtorGroupGetNumberResult property.
     * 
     */
    public void setDebtorGroupGetNumberResult(int value) {
        this.debtorGroupGetNumberResult = value;
    }

}
