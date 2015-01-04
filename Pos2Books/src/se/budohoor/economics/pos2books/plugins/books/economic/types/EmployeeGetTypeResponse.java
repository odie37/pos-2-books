
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
 *         &lt;element name="Employee_GetTypeResult" type="{http://e-conomic.com}EmployeeType"/>
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
    "employeeGetTypeResult"
})
@XmlRootElement(name = "Employee_GetTypeResponse")
public class EmployeeGetTypeResponse {

    @XmlElement(name = "Employee_GetTypeResult", required = true)
    protected EmployeeType employeeGetTypeResult;

    /**
     * Gets the value of the employeeGetTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeType }
     *     
     */
    public EmployeeType getEmployeeGetTypeResult() {
        return employeeGetTypeResult;
    }

    /**
     * Sets the value of the employeeGetTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeType }
     *     
     */
    public void setEmployeeGetTypeResult(EmployeeType value) {
        this.employeeGetTypeResult = value;
    }

}
