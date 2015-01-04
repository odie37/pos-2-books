
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
 *         &lt;element name="Department_GetAllUpdatedResult" type="{http://e-conomic.com}ArrayOfDepartmentHandle" minOccurs="0"/>
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
    "departmentGetAllUpdatedResult"
})
@XmlRootElement(name = "Department_GetAllUpdatedResponse")
public class DepartmentGetAllUpdatedResponse {

    @XmlElement(name = "Department_GetAllUpdatedResult")
    protected ArrayOfDepartmentHandle departmentGetAllUpdatedResult;

    /**
     * Gets the value of the departmentGetAllUpdatedResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public ArrayOfDepartmentHandle getDepartmentGetAllUpdatedResult() {
        return departmentGetAllUpdatedResult;
    }

    /**
     * Sets the value of the departmentGetAllUpdatedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public void setDepartmentGetAllUpdatedResult(ArrayOfDepartmentHandle value) {
        this.departmentGetAllUpdatedResult = value;
    }

}
