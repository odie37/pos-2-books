
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
 *         &lt;element name="Employee_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfEmployeeData" minOccurs="0"/>
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
    "employeeGetDataArrayResult"
})
@XmlRootElement(name = "Employee_GetDataArrayResponse")
public class EmployeeGetDataArrayResponse {

    @XmlElement(name = "Employee_GetDataArrayResult")
    protected ArrayOfEmployeeData employeeGetDataArrayResult;

    /**
     * Gets the value of the employeeGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeData }
     *     
     */
    public ArrayOfEmployeeData getEmployeeGetDataArrayResult() {
        return employeeGetDataArrayResult;
    }

    /**
     * Sets the value of the employeeGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeData }
     *     
     */
    public void setEmployeeGetDataArrayResult(ArrayOfEmployeeData value) {
        this.employeeGetDataArrayResult = value;
    }

}
