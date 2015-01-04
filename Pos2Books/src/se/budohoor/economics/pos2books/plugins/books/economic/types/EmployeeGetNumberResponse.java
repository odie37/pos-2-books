
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
 *         &lt;element name="Employee_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "employeeGetNumberResult"
})
@XmlRootElement(name = "Employee_GetNumberResponse")
public class EmployeeGetNumberResponse {

    @XmlElement(name = "Employee_GetNumberResult")
    protected int employeeGetNumberResult;

    /**
     * Gets the value of the employeeGetNumberResult property.
     * 
     */
    public int getEmployeeGetNumberResult() {
        return employeeGetNumberResult;
    }

    /**
     * Sets the value of the employeeGetNumberResult property.
     * 
     */
    public void setEmployeeGetNumberResult(int value) {
        this.employeeGetNumberResult = value;
    }

}
