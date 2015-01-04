
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
 *         &lt;element name="Department_GetAllResult" type="{http://e-conomic.com}ArrayOfDepartmentHandle" minOccurs="0"/>
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
    "departmentGetAllResult"
})
@XmlRootElement(name = "Department_GetAllResponse")
public class DepartmentGetAllResponse {

    @XmlElement(name = "Department_GetAllResult")
    protected ArrayOfDepartmentHandle departmentGetAllResult;

    /**
     * Gets the value of the departmentGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public ArrayOfDepartmentHandle getDepartmentGetAllResult() {
        return departmentGetAllResult;
    }

    /**
     * Sets the value of the departmentGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public void setDepartmentGetAllResult(ArrayOfDepartmentHandle value) {
        this.departmentGetAllResult = value;
    }

}
