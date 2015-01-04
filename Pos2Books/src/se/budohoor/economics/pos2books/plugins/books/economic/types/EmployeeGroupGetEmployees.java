
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
 *         &lt;element name="employeeGroupHandle" type="{http://e-conomic.com}EmployeeGroupHandle" minOccurs="0"/>
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
    "employeeGroupHandle"
})
@XmlRootElement(name = "EmployeeGroup_GetEmployees")
public class EmployeeGroupGetEmployees {

    protected EmployeeGroupHandle employeeGroupHandle;

    /**
     * Gets the value of the employeeGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public EmployeeGroupHandle getEmployeeGroupHandle() {
        return employeeGroupHandle;
    }

    /**
     * Sets the value of the employeeGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public void setEmployeeGroupHandle(EmployeeGroupHandle value) {
        this.employeeGroupHandle = value;
    }

}
