
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
 *         &lt;element name="Account_GetBudgetFiguresByDateResult" type="{http://e-conomic.com}ArrayOfBudgetFigureHandle" minOccurs="0"/>
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
    "accountGetBudgetFiguresByDateResult"
})
@XmlRootElement(name = "Account_GetBudgetFiguresByDateResponse")
public class AccountGetBudgetFiguresByDateResponse {

    @XmlElement(name = "Account_GetBudgetFiguresByDateResult")
    protected ArrayOfBudgetFigureHandle accountGetBudgetFiguresByDateResult;

    /**
     * Gets the value of the accountGetBudgetFiguresByDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBudgetFigureHandle }
     *     
     */
    public ArrayOfBudgetFigureHandle getAccountGetBudgetFiguresByDateResult() {
        return accountGetBudgetFiguresByDateResult;
    }

    /**
     * Sets the value of the accountGetBudgetFiguresByDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBudgetFigureHandle }
     *     
     */
    public void setAccountGetBudgetFiguresByDateResult(ArrayOfBudgetFigureHandle value) {
        this.accountGetBudgetFiguresByDateResult = value;
    }

}
