
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
 *         &lt;element name="Employee_GetSalesPriceBeforeResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "employeeGetSalesPriceBeforeResult"
})
@XmlRootElement(name = "Employee_GetSalesPriceBeforeResponse")
public class EmployeeGetSalesPriceBeforeResponse {

    @XmlElement(name = "Employee_GetSalesPriceBeforeResult", required = true, nillable = true)
    protected BigDecimal employeeGetSalesPriceBeforeResult;

    /**
     * Gets the value of the employeeGetSalesPriceBeforeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeGetSalesPriceBeforeResult() {
        return employeeGetSalesPriceBeforeResult;
    }

    /**
     * Sets the value of the employeeGetSalesPriceBeforeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeGetSalesPriceBeforeResult(BigDecimal value) {
        this.employeeGetSalesPriceBeforeResult = value;
    }

}
