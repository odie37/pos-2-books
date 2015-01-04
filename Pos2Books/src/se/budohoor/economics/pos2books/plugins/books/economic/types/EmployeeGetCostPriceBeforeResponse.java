
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
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
 *         &lt;element name="Employee_GetCostPriceBeforeResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "employeeGetCostPriceBeforeResult"
})
@XmlRootElement(name = "Employee_GetCostPriceBeforeResponse")
public class EmployeeGetCostPriceBeforeResponse {

    @XmlElement(name = "Employee_GetCostPriceBeforeResult", required = true, nillable = true)
    protected BigDecimal employeeGetCostPriceBeforeResult;

    /**
     * Gets the value of the employeeGetCostPriceBeforeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeGetCostPriceBeforeResult() {
        return employeeGetCostPriceBeforeResult;
    }

    /**
     * Sets the value of the employeeGetCostPriceBeforeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeGetCostPriceBeforeResult(BigDecimal value) {
        this.employeeGetCostPriceBeforeResult = value;
    }

}
