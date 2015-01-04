
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
 *         &lt;element name="budgetFigureHandle" type="{http://e-conomic.com}BudgetFigureHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
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
    "budgetFigureHandle",
    "valueHandle"
})
@XmlRootElement(name = "BudgetFigure_SetDepartment")
public class BudgetFigureSetDepartment {

    protected BudgetFigureHandle budgetFigureHandle;
    protected DepartmentHandle valueHandle;

    /**
     * Gets the value of the budgetFigureHandle property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetFigureHandle }
     *     
     */
    public BudgetFigureHandle getBudgetFigureHandle() {
        return budgetFigureHandle;
    }

    /**
     * Sets the value of the budgetFigureHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetFigureHandle }
     *     
     */
    public void setBudgetFigureHandle(BudgetFigureHandle value) {
        this.budgetFigureHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentHandle }
     *     
     */
    public DepartmentHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentHandle }
     *     
     */
    public void setValueHandle(DepartmentHandle value) {
        this.valueHandle = value;
    }

}
