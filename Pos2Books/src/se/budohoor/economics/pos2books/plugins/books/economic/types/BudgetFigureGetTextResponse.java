
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
 *         &lt;element name="BudgetFigure_GetTextResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "budgetFigureGetTextResult"
})
@XmlRootElement(name = "BudgetFigure_GetTextResponse")
public class BudgetFigureGetTextResponse {

    @XmlElement(name = "BudgetFigure_GetTextResult")
    protected String budgetFigureGetTextResult;

    /**
     * Gets the value of the budgetFigureGetTextResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetFigureGetTextResult() {
        return budgetFigureGetTextResult;
    }

    /**
     * Sets the value of the budgetFigureGetTextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetFigureGetTextResult(String value) {
        this.budgetFigureGetTextResult = value;
    }

}
