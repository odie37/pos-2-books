
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
 *         &lt;element name="Employee_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfEmployeeHandle" minOccurs="0"/>
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
    "employeeCreateFromDataArrayResult"
})
@XmlRootElement(name = "Employee_CreateFromDataArrayResponse")
public class EmployeeCreateFromDataArrayResponse {

    @XmlElement(name = "Employee_CreateFromDataArrayResult")
    protected ArrayOfEmployeeHandle employeeCreateFromDataArrayResult;

    /**
     * Gets the value of the employeeCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeHandle }
     *     
     */
    public ArrayOfEmployeeHandle getEmployeeCreateFromDataArrayResult() {
        return employeeCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the employeeCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeHandle }
     *     
     */
    public void setEmployeeCreateFromDataArrayResult(ArrayOfEmployeeHandle value) {
        this.employeeCreateFromDataArrayResult = value;
    }

}
