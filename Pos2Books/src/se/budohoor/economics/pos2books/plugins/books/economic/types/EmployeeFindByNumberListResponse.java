
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
 *         &lt;element name="Employee_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfEmployeeHandle" minOccurs="0"/>
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
    "employeeFindByNumberListResult"
})
@XmlRootElement(name = "Employee_FindByNumberListResponse")
public class EmployeeFindByNumberListResponse {

    @XmlElement(name = "Employee_FindByNumberListResult")
    protected ArrayOfEmployeeHandle employeeFindByNumberListResult;

    /**
     * Gets the value of the employeeFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeHandle }
     *     
     */
    public ArrayOfEmployeeHandle getEmployeeFindByNumberListResult() {
        return employeeFindByNumberListResult;
    }

    /**
     * Sets the value of the employeeFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeHandle }
     *     
     */
    public void setEmployeeFindByNumberListResult(ArrayOfEmployeeHandle value) {
        this.employeeFindByNumberListResult = value;
    }

}
