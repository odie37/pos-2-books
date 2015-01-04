
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
 *         &lt;element name="BudgetFigure_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfBudgetFigureHandle" minOccurs="0"/>
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
    "budgetFigureCreateFromDataArrayResult"
})
@XmlRootElement(name = "BudgetFigure_CreateFromDataArrayResponse")
public class BudgetFigureCreateFromDataArrayResponse {

    @XmlElement(name = "BudgetFigure_CreateFromDataArrayResult")
    protected ArrayOfBudgetFigureHandle budgetFigureCreateFromDataArrayResult;

    /**
     * Gets the value of the budgetFigureCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBudgetFigureHandle }
     *     
     */
    public ArrayOfBudgetFigureHandle getBudgetFigureCreateFromDataArrayResult() {
        return budgetFigureCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the budgetFigureCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBudgetFigureHandle }
     *     
     */
    public void setBudgetFigureCreateFromDataArrayResult(ArrayOfBudgetFigureHandle value) {
        this.budgetFigureCreateFromDataArrayResult = value;
    }

}
