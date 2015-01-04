
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
 *         &lt;element name="EmployeeGroup_UpdateFromDataResult" type="{http://e-conomic.com}EmployeeGroupHandle" minOccurs="0"/>
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
    "employeeGroupUpdateFromDataResult"
})
@XmlRootElement(name = "EmployeeGroup_UpdateFromDataResponse")
public class EmployeeGroupUpdateFromDataResponse {

    @XmlElement(name = "EmployeeGroup_UpdateFromDataResult")
    protected EmployeeGroupHandle employeeGroupUpdateFromDataResult;

    /**
     * Gets the value of the employeeGroupUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public EmployeeGroupHandle getEmployeeGroupUpdateFromDataResult() {
        return employeeGroupUpdateFromDataResult;
    }

    /**
     * Sets the value of the employeeGroupUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public void setEmployeeGroupUpdateFromDataResult(EmployeeGroupHandle value) {
        this.employeeGroupUpdateFromDataResult = value;
    }

}
