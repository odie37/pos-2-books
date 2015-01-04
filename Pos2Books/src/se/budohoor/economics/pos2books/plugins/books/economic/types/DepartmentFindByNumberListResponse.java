
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
 *         &lt;element name="Department_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfDepartmentHandle" minOccurs="0"/>
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
    "departmentFindByNumberListResult"
})
@XmlRootElement(name = "Department_FindByNumberListResponse")
public class DepartmentFindByNumberListResponse {

    @XmlElement(name = "Department_FindByNumberListResult")
    protected ArrayOfDepartmentHandle departmentFindByNumberListResult;

    /**
     * Gets the value of the departmentFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public ArrayOfDepartmentHandle getDepartmentFindByNumberListResult() {
        return departmentFindByNumberListResult;
    }

    /**
     * Sets the value of the departmentFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public void setDepartmentFindByNumberListResult(ArrayOfDepartmentHandle value) {
        this.departmentFindByNumberListResult = value;
    }

}
