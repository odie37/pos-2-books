
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
 *         &lt;element name="Employee_GetDataResult" type="{http://e-conomic.com}EmployeeData" minOccurs="0"/>
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
    "employeeGetDataResult"
})
@XmlRootElement(name = "Employee_GetDataResponse")
public class EmployeeGetDataResponse {

    @XmlElement(name = "Employee_GetDataResult")
    protected EmployeeData employeeGetDataResult;

    /**
     * Gets the value of the employeeGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeData }
     *     
     */
    public EmployeeData getEmployeeGetDataResult() {
        return employeeGetDataResult;
    }

    /**
     * Sets the value of the employeeGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeData }
     *     
     */
    public void setEmployeeGetDataResult(EmployeeData value) {
        this.employeeGetDataResult = value;
    }

}
