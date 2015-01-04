
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
 *         &lt;element name="Employee_GetGroupResult" type="{http://e-conomic.com}EmployeeGroupHandle" minOccurs="0"/>
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
    "employeeGetGroupResult"
})
@XmlRootElement(name = "Employee_GetGroupResponse")
public class EmployeeGetGroupResponse {

    @XmlElement(name = "Employee_GetGroupResult")
    protected EmployeeGroupHandle employeeGetGroupResult;

    /**
     * Gets the value of the employeeGetGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public EmployeeGroupHandle getEmployeeGetGroupResult() {
        return employeeGetGroupResult;
    }

    /**
     * Sets the value of the employeeGetGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public void setEmployeeGetGroupResult(EmployeeGroupHandle value) {
        this.employeeGetGroupResult = value;
    }

}
