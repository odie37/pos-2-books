
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
 *         &lt;element name="Employee_CreateFromDataResult" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "employeeCreateFromDataResult"
})
@XmlRootElement(name = "Employee_CreateFromDataResponse")
public class EmployeeCreateFromDataResponse {

    @XmlElement(name = "Employee_CreateFromDataResult")
    protected EmployeeHandle employeeCreateFromDataResult;

    /**
     * Gets the value of the employeeCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getEmployeeCreateFromDataResult() {
        return employeeCreateFromDataResult;
    }

    /**
     * Sets the value of the employeeCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setEmployeeCreateFromDataResult(EmployeeHandle value) {
        this.employeeCreateFromDataResult = value;
    }

}
