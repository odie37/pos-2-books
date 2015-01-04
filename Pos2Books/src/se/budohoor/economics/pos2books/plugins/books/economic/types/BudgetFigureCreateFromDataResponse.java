
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
 *         &lt;element name="BudgetFigure_CreateFromDataResult" type="{http://e-conomic.com}BudgetFigureHandle" minOccurs="0"/>
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
    "budgetFigureCreateFromDataResult"
})
@XmlRootElement(name = "BudgetFigure_CreateFromDataResponse")
public class BudgetFigureCreateFromDataResponse {

    @XmlElement(name = "BudgetFigure_CreateFromDataResult")
    protected BudgetFigureHandle budgetFigureCreateFromDataResult;

    /**
     * Gets the value of the budgetFigureCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetFigureHandle }
     *     
     */
    public BudgetFigureHandle getBudgetFigureCreateFromDataResult() {
        return budgetFigureCreateFromDataResult;
    }

    /**
     * Sets the value of the budgetFigureCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetFigureHandle }
     *     
     */
    public void setBudgetFigureCreateFromDataResult(BudgetFigureHandle value) {
        this.budgetFigureCreateFromDataResult = value;
    }

}
