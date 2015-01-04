
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
 *         &lt;element name="EmployeeGroup_GetDataResult" type="{http://e-conomic.com}EmployeeGroupData" minOccurs="0"/>
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
    "employeeGroupGetDataResult"
})
@XmlRootElement(name = "EmployeeGroup_GetDataResponse")
public class EmployeeGroupGetDataResponse {

    @XmlElement(name = "EmployeeGroup_GetDataResult")
    protected EmployeeGroupData employeeGroupGetDataResult;

    /**
     * Gets the value of the employeeGroupGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeGroupData }
     *     
     */
    public EmployeeGroupData getEmployeeGroupGetDataResult() {
        return employeeGroupGetDataResult;
    }

    /**
     * Sets the value of the employeeGroupGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeGroupData }
     *     
     */
    public void setEmployeeGroupGetDataResult(EmployeeGroupData value) {
        this.employeeGroupGetDataResult = value;
    }

}
