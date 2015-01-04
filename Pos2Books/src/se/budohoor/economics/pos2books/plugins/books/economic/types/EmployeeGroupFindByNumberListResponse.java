
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
 *         &lt;element name="EmployeeGroup_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfEmployeeGroupHandle" minOccurs="0"/>
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
    "employeeGroupFindByNumberListResult"
})
@XmlRootElement(name = "EmployeeGroup_FindByNumberListResponse")
public class EmployeeGroupFindByNumberListResponse {

    @XmlElement(name = "EmployeeGroup_FindByNumberListResult")
    protected ArrayOfEmployeeGroupHandle employeeGroupFindByNumberListResult;

    /**
     * Gets the value of the employeeGroupFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeGroupHandle }
     *     
     */
    public ArrayOfEmployeeGroupHandle getEmployeeGroupFindByNumberListResult() {
        return employeeGroupFindByNumberListResult;
    }

    /**
     * Sets the value of the employeeGroupFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeGroupHandle }
     *     
     */
    public void setEmployeeGroupFindByNumberListResult(ArrayOfEmployeeGroupHandle value) {
        this.employeeGroupFindByNumberListResult = value;
    }

}
