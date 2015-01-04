
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
 *         &lt;element name="BudgetFigure_CreateResult" type="{http://e-conomic.com}BudgetFigureHandle" minOccurs="0"/>
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
    "budgetFigureCreateResult"
})
@XmlRootElement(name = "BudgetFigure_CreateResponse")
public class BudgetFigureCreateResponse {

    @XmlElement(name = "BudgetFigure_CreateResult")
    protected BudgetFigureHandle budgetFigureCreateResult;

    /**
     * Gets the value of the budgetFigureCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetFigureHandle }
     *     
     */
    public BudgetFigureHandle getBudgetFigureCreateResult() {
        return budgetFigureCreateResult;
    }

    /**
     * Sets the value of the budgetFigureCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetFigureHandle }
     *     
     */
    public void setBudgetFigureCreateResult(BudgetFigureHandle value) {
        this.budgetFigureCreateResult = value;
    }

}