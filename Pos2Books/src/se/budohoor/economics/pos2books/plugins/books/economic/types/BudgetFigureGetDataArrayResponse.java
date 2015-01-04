
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
 *         &lt;element name="BudgetFigure_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfBudgetFigureData" minOccurs="0"/>
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
    "budgetFigureGetDataArrayResult"
})
@XmlRootElement(name = "BudgetFigure_GetDataArrayResponse")
public class BudgetFigureGetDataArrayResponse {

    @XmlElement(name = "BudgetFigure_GetDataArrayResult")
    protected ArrayOfBudgetFigureData budgetFigureGetDataArrayResult;

    /**
     * Gets the value of the budgetFigureGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBudgetFigureData }
     *     
     */
    public ArrayOfBudgetFigureData getBudgetFigureGetDataArrayResult() {
        return budgetFigureGetDataArrayResult;
    }

    /**
     * Sets the value of the budgetFigureGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBudgetFigureData }
     *     
     */
    public void setBudgetFigureGetDataArrayResult(ArrayOfBudgetFigureData value) {
        this.budgetFigureGetDataArrayResult = value;
    }

}
