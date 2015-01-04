
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
 *         &lt;element name="Employee_FindByNumberResult" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "employeeFindByNumberResult"
})
@XmlRootElement(name = "Employee_FindByNumberResponse")
public class EmployeeFindByNumberResponse {

    @XmlElement(name = "Employee_FindByNumberResult")
    protected EmployeeHandle employeeFindByNumberResult;

    /**
     * Gets the value of the employeeFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getEmployeeFindByNumberResult() {
        return employeeFindByNumberResult;
    }

    /**
     * Sets the value of the employeeFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setEmployeeFindByNumberResult(EmployeeHandle value) {
        this.employeeFindByNumberResult = value;
    }

}
