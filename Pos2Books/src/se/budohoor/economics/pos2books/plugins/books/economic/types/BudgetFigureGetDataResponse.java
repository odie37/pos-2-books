
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
 *         &lt;element name="BudgetFigure_GetDataResult" type="{http://e-conomic.com}BudgetFigureData" minOccurs="0"/>
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
    "budgetFigureGetDataResult"
})
@XmlRootElement(name = "BudgetFigure_GetDataResponse")
public class BudgetFigureGetDataResponse {

    @XmlElement(name = "BudgetFigure_GetDataResult")
    protected BudgetFigureData budgetFigureGetDataResult;

    /**
     * Gets the value of the budgetFigureGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetFigureData }
     *     
     */
    public BudgetFigureData getBudgetFigureGetDataResult() {
        return budgetFigureGetDataResult;
    }

    /**
     * Sets the value of the budgetFigureGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetFigureData }
     *     
     */
    public void setBudgetFigureGetDataResult(BudgetFigureData value) {
        this.budgetFigureGetDataResult = value;
    }

}
